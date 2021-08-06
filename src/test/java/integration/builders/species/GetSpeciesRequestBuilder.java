package integration.builders.species;

import integration.builders.base.AbstractIDRequestBuilder;
import integration.request.base.AbstractGetRequest;

public class GetSpeciesRequestBuilder extends AbstractIDRequestBuilder {
    @Override
    protected AbstractGetRequest getRequestForID() {
        return null;
    }
}
