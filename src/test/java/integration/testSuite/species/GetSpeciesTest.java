package integration.testSuite.species;

import integration.builders.species.GetSpeciesRequestBuilder;
import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.response.species.SpeciesResponse;
import integration.testExecution.TestMarshall;

public class GetSpeciesTest extends TestMarshall {
    @Override
    protected AbstractRequest getRequest() {
        return new GetSpeciesRequestBuilder().withId("1").build();
    }

    @Override
    protected AbstractResponse getResponse() {
        return new SpeciesResponse(request);
    }
}
