package api;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.Iterator;
import java.util.List;

@JsonAutoDetect
public class FeatureCollection implements Iterable<Feature> {

    private List<Feature> features;
    private Query query;

    @Override
    public Iterator<Feature> iterator( ) {
        return this.features.iterator( );
    }

    public int size( ) {
        return this.features.size( );
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }
}
