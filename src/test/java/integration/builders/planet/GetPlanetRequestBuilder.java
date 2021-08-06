package integration.builders.planet;

import integration.builders.base.AbstractIDRequestBuilder;
import integration.request.base.AbstractGetRequest;

public class GetPlanetRequestBuilder extends AbstractIDRequestBuilder {
    @Override
    protected AbstractGetRequest getRequestForID() {
        return null;
    }
}
