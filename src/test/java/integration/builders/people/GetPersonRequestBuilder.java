package integration.builders.people;

import integration.builders.base.AbstractIDRequestBuilder;
import integration.request.base.AbstractGetRequest;
import integration.request.people.GetPersonRequest;

public class GetPersonRequestBuilder extends AbstractIDRequestBuilder {

    @Override
    protected AbstractGetRequest getRequestForID() {
        return new GetPersonRequest(id);
    }

}
