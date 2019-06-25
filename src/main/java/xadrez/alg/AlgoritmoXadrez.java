package xadrez.alg;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import xadrez.Xadrez;

@JsonDeserialize(using = AlgoritmoDeserializer.class)
public interface AlgoritmoXadrez {
    default public void setParametros(Object... params) {
        // nao faz nada nessa implementacao default
    }
    
    default public Integer getProfundidade() {
        return 0;
    }

    default public void setProfundidade(Integer profundidade) {
        // nao faz nada nessa implementacao default
    }

    
    public String procurarMelhorMovimento(Xadrez xadrez);
}

class AlgoritmoDeserializer extends StdDeserializer<AlgoritmoXadrez> {
    private static final long serialVersionUID = 1L;

    public AlgoritmoDeserializer() {
        this(null);
    }

    public AlgoritmoDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public AlgoritmoXadrez deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonNode node = jp.getCodec().readTree(jp);
        int profundidade = node.get("profundidade").asInt();

        AlgoritmoXadrez algoritmo = null;
        if (profundidade > 0) {
            algoritmo = new AlgoritmoMinimax();
        } else {
            algoritmo = new AlgoritmoAleatorioMaisXequeMate();
        }
        algoritmo.setProfundidade(profundidade);
        return algoritmo;
    }

}
