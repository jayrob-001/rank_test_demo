package integration.response.vehicle;

import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.model.Planet;

import java.io.IOException;

public class VehicleResponse extends AbstractResponse {

    public VehicleResponse(AbstractRequest request) {
        super(request);
    }

    @Override
    public VehicleResponse getResponseObject() throws IOException {
        return getResponseObject(Planet.class);
    }

    @Override
    public String getJsonSchemaFileName() {
        return null;
    }

}
