package integration.testExecution;

import com.github.fge.jsonschema.SchemaVersion;
import com.github.fge.jsonschema.cfg.ValidationConfiguration;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import integration.client.AbstractRequest;
import integration.client.AbstractResponse;
import integration.reporting.ReportUtil;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.lang.reflect.Method;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public abstract class TestMarshall {


    protected abstract AbstractRequest getRequest();
    protected abstract AbstractResponse getResponse();

    protected AbstractRequest request;
    protected AbstractResponse response;

    public ReportUtil reportUtil = new ReportUtil();

    @BeforeSuite
    public void setupBaseURL(ITestContext context) {
        RestAssured.baseURI = context.getCurrentXmlTest().getParameter("BaseURI");
    }

//    @BeforeTest
//    @BeforeClass

    @BeforeMethod
    public void setUp(Method method) throws IOException {
        reportUtil.setUp(method);
        this.request = getRequest();
        this.response = getResponse();
    }

    @AfterMethod
    public void getResult(ITestResult result) {
        reportUtil.addResult(result);
    }

//    @AfterClass

    @AfterTest
    public void tearDown() {
        reportUtil.writeResult();
    }

//    @AfterSuite


    //common
    public void validateSchema(Response response, String filename) {
        JsonSchemaFactory jsonSchemaFactory = JsonSchemaFactory.newBuilder()
                .setValidationConfiguration(
                    ValidationConfiguration.newBuilder()
                            .setDefaultVersion(SchemaVersion.DRAFTV4)
                            .freeze())
                .freeze();

        response
                .then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath(filename)
                        .using(jsonSchemaFactory));
    }

}
