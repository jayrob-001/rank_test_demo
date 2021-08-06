package integration.response.starship;

import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.model.Planet;

import java.io.IOException;

public class StarshipResponse extends AbstractResponse {

    public StarshipResponse(AbstractRequest request) {
        super(request);
    }

    @Override
    public StarshipResponse getResponseObject() throws IOException {
        return getResponseObject(Planet.class);
    }

    @Override
    public String getJsonSchemaFileName() {
        return null;
    }

}
