package api;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.List;

@JsonAutoDetect
public class Properties implements Iterable<Property> {

    List<Property> properties;

    @NotNull
    @Override
    public Iterator<Property> iterator() {
        return this.properties.iterator();
    }

    public int getSize(){
        return this.properties.size();
    }


}
