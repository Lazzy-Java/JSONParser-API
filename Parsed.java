package api;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class Parsed {

    @JsonProperty
    private String housenumber;
    @JsonProperty
    private String street;
    @JsonProperty
    private String suburb;
    @JsonProperty
    private String expected_type;

    public String getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getExpected_type() {
        return expected_type;
    }

    public void setExpected_type(String expected_type) {
        this.expected_type = expected_type;
    }
}
