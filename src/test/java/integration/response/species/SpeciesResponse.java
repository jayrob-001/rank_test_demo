package integration.response.species;

import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.model.Planet;

import java.io.IOException;

public class SpeciesResponse extends AbstractResponse {

    public SpeciesResponse(AbstractRequest request) {
        super(request);
    }

    @Override
    public SpeciesResponse getResponseObject() throws IOException {
        return getResponseObject(Planet.class);
    }

    @Override
    public String getJsonSchemaFileName() {
        return null;
    }

}
