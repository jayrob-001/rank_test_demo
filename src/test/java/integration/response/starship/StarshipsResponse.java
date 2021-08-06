package integration.response.starship;

import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.model.AllSpecies;

import java.io.IOException;

public class StarshipsResponse extends AbstractResponse {

    public StarshipsResponse(AbstractRequest request) {
        super(request);
    }

    @Override
    public AllSpecies getResponseObject() throws IOException {
        return getResponseObject(StarshipsResponse.class);
    }

    @Override
    public String getJsonSchemaFileName() {
        return null;
    }

}
