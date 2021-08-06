package integration.model;

import lombok.Getter;
import lombok.Setter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Vehicles extends AbstractObject{

    private String name;
    private String model;
    private String manufacturer;
    //cost_in_credits
    private Double length;
    private Long max_atmosphering_speed;
    private Integer crew;
    private Integer passengers;
    private Integer cargo_capacity;
    //consumables
    private String vehicle_class;
    private List<Person> pilots;
    private List<Film> films;
}
