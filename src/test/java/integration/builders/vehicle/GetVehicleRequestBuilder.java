package integration.builders.vehicle;

import integration.builders.base.AbstractIDRequestBuilder;
import integration.request.base.AbstractGetRequest;

public class GetVehicleRequestBuilder extends AbstractIDRequestBuilder {
    @Override
    protected AbstractGetRequest getRequestForID() {
        return null;
    }
}
