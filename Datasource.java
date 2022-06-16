package api;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class Datasource {

    @JsonProperty("license")
    private String license;

    @JsonProperty("attribution")
    private String attribution;

    @JsonProperty("sourceName")
    private String sourceName;

    @JsonProperty("url")
    private String url;

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getAttribution() {
        return attribution;
    }

    public void setAttribution(String attribution) {
        this.attribution = attribution;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Datasource{" +
                "license='" + license + '\'' +
                ", attribution='" + attribution + '\'' +
                ", sourceName='" + sourceName + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
