package integration.model;

import lombok.Getter;
import lombok.Setter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;


@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class People extends AbstractObject {

    private Integer count;
    private String next;
    private String previous;
    private List<Person> results;
}
