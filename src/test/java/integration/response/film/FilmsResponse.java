package integration.response.film;




import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.model.Films;
import integration.model.People;

import java.io.IOException;

public class FilmsResponse extends AbstractResponse {

    public FilmsResponse(AbstractRequest request) {
        super(request);
    }

    @Override
    public Films getResponseObject() throws IOException {
        return getResponseObject(Films.class);
    }

    @Override
    public String getJsonSchemaFileName() {
        return "films.json";
    }

}
