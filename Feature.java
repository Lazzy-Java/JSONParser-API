package api;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonAutoDetect
public class Feature{

    @JsonProperty("bbox")
    private List<Double> bbox;

    @JsonProperty("geometry")
    private Geometry geometry;

    @JsonProperty("properties")
    private Property property;

    @JsonProperty("type")
    private String type;

    public String getType() {
        return type;
    }
    public Property getProperty() {
        return property;
    }



    public List<Double> getBbox() {
        return bbox;
    }

    public void setBbox(List<Double> bbox) {
        this.bbox = bbox;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public Property getProperties() {
        return property;
    }

    public void setProperties(Property property) {
        this.property = property;
    }


    @Override
    public String toString() {
        return "Feature{" +
                "bbox=" + bbox +
                ", geometry=" + geometry +
                ", properties=" + property +
                '}';
    }


}
