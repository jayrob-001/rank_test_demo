package integration.testSuite.starship;

import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.request.species.GetAllSpeciesRequest;
import integration.request.starship.GetStarshipsRequest;
import integration.response.species.AllSpeciesResponse;
import integration.response.starship.StarshipsResponse;
import integration.testExecution.TestMarshall;

public class GetStarshipsTest extends TestMarshall {
    @Override
    protected AbstractRequest getRequest() {
        return new GetStarshipsRequest();
    }

    @Override
    protected AbstractResponse getResponse() {
        return new StarshipsResponse(request);
    }
}
