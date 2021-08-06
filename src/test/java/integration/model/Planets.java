package integration.model;

import lombok.Getter;
import lombok.Setter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Planets extends AbstractObject {

    private String name;
    private Integer rotation_period;
    private Long orbital_period;
    private Long diameter;
    private String climate;
    private String gravity;
    private String terrain;
    private Integer surface_water;
    private Long population;
    private List<Person> residents;
    private List<Film> films;
}
