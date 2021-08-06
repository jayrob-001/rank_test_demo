package integration.builders.base;

import integration.request.base.AbstractGetRequest;


public abstract class AbstractIDRequestBuilder {
    protected abstract AbstractGetRequest getRequestForID();

    protected String id;

    public AbstractIDRequestBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public AbstractGetRequest build() {
        return getRequestForID();
    }
}
