package integration.model;

import lombok.Getter;
import lombok.Setter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.net.URL;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Film {
    private String title;
    private Integer episode_id;
    private String opening_crawl;
    private String director;
    private String producer;
    private Date release_date;
    private List<Character> characters;
    private List<Planet> planets;
    private List<Starship> starships;
    private List<Vehicle> vehicles;
    private List<Species> species;
    private Date created;
    private Date edited;
    private URL url;
}
