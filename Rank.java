package api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rank {

    @JsonProperty("importance")
    private String importance;

    @JsonProperty("confidence")
    private String confidence;

    @JsonProperty("confidence_city_level")
    private String confidence_city_level;

    @JsonProperty("match_type")
    private String match_type;

    @JsonProperty("confidence_street_level")
    private String confidence_street_level;


    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public String getConfidence() {
        return confidence;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    public String getConfidence_city_level() {
        return confidence_city_level;
    }

    public void setConfidence_city_level(String confidence_city_level) {
        this.confidence_city_level = confidence_city_level;
    }

    public String getMatch_type() {
        return match_type;
    }

    public void setMatch_type(String match_type) {
        this.match_type = match_type;
    }

    public String getConfidence_street_level() {
        return confidence_street_level;
    }

    public void setConfidence_street_level(String confidence_street_level) {
        this.confidence_street_level = confidence_street_level;
    }

    @Override
    public String toString() {
        return "Rank{" +
                "importance='" + importance + '\'' +
                ", confidence='" + confidence + '\'' +
                ", confidence_city_level='" + confidence_city_level + '\'' +
                ", match_type='" + match_type + '\'' +
                ", confidence_street_level='" + confidence_street_level + '\'' +
                '}';
    }
}
