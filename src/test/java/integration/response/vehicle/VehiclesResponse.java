package integration.response.vehicle;

import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.model.Vehicles;

import java.io.IOException;

public class VehiclesResponse extends AbstractResponse {

    public VehiclesResponse(AbstractRequest request) {
        super(request);
    }

    @Override
    public Vehicles getResponseObject() throws IOException {
        return getResponseObject(Vehicles.class);
    }

    @Override
    public String getJsonSchemaFileName() {
        return null;
    }

}
