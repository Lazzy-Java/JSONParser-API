package api;

public class Place {

    private final String houseNumber;
    private final String city ;
    private final String state_code ;

    public Place(String address) {
        this.houseNumber = address.split(",")[0];
        this.city = address.split(",")[1];
        this.state_code = address.split(",")[2];

    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState_code() {
        return state_code;
    }

    @Override
    public String toString() {
        return houseNumber + " " + city + " , " + state_code  ;
    }
}
