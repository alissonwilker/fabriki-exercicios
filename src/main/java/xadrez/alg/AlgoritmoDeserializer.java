package xadrez.alg;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class AlgoritmoDeserializer extends StdDeserializer<AlgoritmoXadrez> {
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
