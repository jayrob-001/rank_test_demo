package integration.testSuite.species;

import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.request.species.GetAllSpeciesRequest;
import integration.response.species.AllSpeciesResponse;
import integration.testExecution.TestMarshall;

public class GetAllSpeciesTest extends TestMarshall {
    @Override
    protected AbstractRequest getRequest() {
        return new GetAllSpeciesRequest();
    }

    @Override
    protected AbstractResponse getResponse() {
        return new AllSpeciesResponse(request);
    }
}
