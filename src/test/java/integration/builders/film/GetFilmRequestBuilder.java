package integration.builders.film;

import integration.builders.base.AbstractIDRequestBuilder;
import integration.request.base.AbstractGetRequest;
import integration.request.film.GetFilmRequest;

public class GetFilmRequestBuilder extends AbstractIDRequestBuilder {
    @Override
    protected AbstractGetRequest getRequestForID() {
        return new GetFilmRequest(id);
    }
}
