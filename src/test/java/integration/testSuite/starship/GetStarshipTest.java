package integration.testSuite.starship;

import integration.builders.planet.GetPlanetRequestBuilder;
import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.response.planet.PlanetResponse;
import integration.testExecution.TestMarshall;

public class GetStarshipTest extends TestMarshall {
    @Override
    protected AbstractRequest getRequest() {
        return new GetPlanetRequestBuilder().withId("1").build();
    }

    @Override
    protected AbstractResponse getResponse() {
        return new PlanetResponse(request);
    }
}
