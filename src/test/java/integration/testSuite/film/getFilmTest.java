package integration.testSuite.film;


import integration.builders.film.GetFilmRequestBuilder;
import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.response.film.FilmResponse;
import integration.testExecution.TestMarshall;

public class getFilmTest extends TestMarshall {
    @Override
    protected AbstractRequest getRequest() {
        return new GetFilmRequestBuilder().withId("1").build();
    }

    @Override
    protected AbstractResponse getResponse() {
        return new FilmResponse(request);
    }


}
