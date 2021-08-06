package integration.response.people;

import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.model.People;

import java.io.IOException;

public class PeopleResponse extends AbstractResponse {

    public PeopleResponse(AbstractRequest request) {
        super(request);
    }

    @Override
    public People getResponseObject() throws IOException {
        return getResponseObject(People.class);
    }

    @Override
    public String getJsonSchemaFileName() {
        return "people.json";
    }
}
