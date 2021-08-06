package integration.response.people;

import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.model.Planet;

import java.io.IOException;

public class PersonResponse extends AbstractResponse {

    public PersonResponse(AbstractRequest request) {
        super(request);
    }

    @Override
    public PersonResponse getResponseObject() throws IOException {
        return getResponseObject(Planet.class);
    }

    @Override
    public String getJsonSchemaFileName() {
        return "person.json";
    }

}
