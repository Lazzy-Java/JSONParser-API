package api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Query {

    @JsonProperty("text")
    private String text;

    @JsonProperty("parsed")
    private Parsed parsed;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Parsed getParsed() {
        return parsed;
    }

    public void setParsed(Parsed parsed) {
        this.parsed = parsed;
    }
}
