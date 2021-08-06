package integration.response.species;

import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.model.AllSpecies;

import java.io.IOException;

public class AllSpeciesResponse extends AbstractResponse {

    public AllSpeciesResponse(AbstractRequest request) {
        super(request);
    }

    @Override
    public AllSpecies getResponseObject() throws IOException {
        return getResponseObject(AllSpeciesResponse.class);
    }

    @Override
    public String getJsonSchemaFileName() {
        return null;
    }

}
