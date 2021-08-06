package integration.response.planet;




import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.model.People;
import integration.model.Planets;

import java.io.IOException;

public class PlanetsResponse extends AbstractResponse {

    public PlanetsResponse(AbstractRequest request) {
        super(request);
    }

    @Override
    public Planets getResponseObject() throws IOException {
        return getResponseObject(People.class);
    }

    @Override
    public String getJsonSchemaFileName() {
        return "planets.json";
    }

}
