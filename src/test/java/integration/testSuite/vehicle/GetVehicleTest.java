package integration.testSuite.vehicle;

import integration.builders.vehicle.GetVehicleRequestBuilder;
import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.response.planet.PlanetResponse;
import integration.response.vehicle.VehicleResponse;
import integration.testExecution.TestMarshall;

public class GetVehicleTest extends TestMarshall {
    @Override
    protected AbstractRequest getRequest() {
        return new GetVehicleRequestBuilder().withId("1").build();
    }

    @Override
    protected AbstractResponse getResponse() {
        return new VehicleResponse(request);
    }
}
