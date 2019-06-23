package xadrez.pecas;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class PecaDeserializer extends StdDeserializer<Peca> {
    private static final long serialVersionUID = 1L;

    public PecaDeserializer() {
        this(null);
    }

    public PecaDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Peca deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonNode node = jp.getCodec().readTree(jp);
        String tipo = node.get("tipo").asText();
        String cor = node.get("cor").asText();
        String idCasa = node.get("idCasa").asText();

        Peca peca = Peca.criar(Peca.Tipo.valueOf(tipo), Peca.Cor.valueOf(cor), idCasa);
        return peca;
    }

}
