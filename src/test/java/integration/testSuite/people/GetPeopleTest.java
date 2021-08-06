package integration.testSuite.people;

import integration.model.Person;
import integration.request.people.GetPeopleRequest;
import integration.response.people.PeopleResponse;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.testExecution.TestMarshall;

import java.io.IOException;
import java.util.List;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

@Slf4j
public class GetPeopleTest extends TestMarshall {

    @Override
    protected AbstractRequest getRequest() {
        return new GetPeopleRequest();
    }

    @Override
    protected AbstractResponse getResponse() {
        return new PeopleResponse(request);
    }

    @Test
    public void getPeopleTest() throws IOException {
        PeopleResponse response = (PeopleResponse) this.response;

        List<Person> results = response.getResponseObject().getResults();

        for (Person person : results) {
            log.info("person.getName(): " + person.getName());
        }
    }
}
