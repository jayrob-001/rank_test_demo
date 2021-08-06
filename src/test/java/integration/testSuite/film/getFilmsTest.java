package integration.testSuite.film;


import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.request.film.GetFilmsRequest;
import integration.response.film.FilmResponse;
import integration.testExecution.TestMarshall;

public class getFilmsTest extends TestMarshall {
    @Override
    protected AbstractRequest getRequest() {
        return new GetFilmsRequest();
    }

    @Override
    protected AbstractResponse getResponse() {
        return new FilmResponse(request);
    }
}
