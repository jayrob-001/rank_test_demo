package integration.testSuite.planet;


import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.request.planet.GetPlanetsRequest;
import integration.response.planet.PlanetsResponse;
import integration.testExecution.TestMarshall;

public class GetPlanetsTest extends TestMarshall {
    @Override
    protected AbstractRequest getRequest() {
        return new GetPlanetsRequest();
    }

    @Override
    protected AbstractResponse getResponse() {
        return new PlanetsResponse(request);
    }
}
