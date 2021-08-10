package integration.testSuite.species;

import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.model.SpeciesList;
import integration.model.Species;
import integration.request.species.GetAllSpeciesRequest;
import integration.response.species.AllSpeciesResponse;
import integration.testExecution.TestMarshall;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

@Slf4j
public class GetSpeciesListTest extends TestMarshall {
    @Override
    protected AbstractRequest getRequest() {
        return new GetAllSpeciesRequest();
    }

    @Override
    protected AbstractResponse getResponse() {
        return new AllSpeciesResponse(request);
    }

    @Test
    public void getAllSpeciesTest() throws IOException, ClassNotFoundException {
        SpeciesList result = (SpeciesList) response.getResponseObject();
        Assert.assertEquals(result.getCount(), 37);

        List<Species> results = result.getResults();
        for (Species species : results) {
            log.info(species.getName());
        }
    }
}
