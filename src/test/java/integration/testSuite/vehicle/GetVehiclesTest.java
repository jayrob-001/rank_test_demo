package integration.testSuite.vehicle;

import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.request.vehicle.GetVehiclesRequest;
import integration.response.species.AllSpeciesResponse;
import integration.response.vehicle.VehiclesResponse;
import integration.testExecution.TestMarshall;

public class GetVehiclesTest extends TestMarshall {
    @Override
    protected AbstractRequest getRequest() {
        return new GetVehiclesRequest();
    }

    @Override
    protected AbstractResponse getResponse() {
        return new VehiclesResponse(request);
    }
}
