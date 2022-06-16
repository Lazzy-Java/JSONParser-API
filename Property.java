package api;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Property {

    private String country;
    private String result_type;
    private String city;
    private String formatted;
    private String county;
    private String postcode;
    private String lon;
    private String country_code;
    private String address_line2;
    private String houseNumber;
    private String address_line1;
    private Datasource datasource;
    private String street;
    private Rank rank;
    private String state;
    private String state_code;
    private String lat;
    private String place_id;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getResult_type() {
        return result_type;
    }

    public void setResult_type(String result_type) {
        this.result_type = result_type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFormatted() {
        return formatted;
    }

    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getAddress_line2() {
        return address_line2;
    }

    public void setAddress_line2(String address_line2) {
        this.address_line2 = address_line2;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getAddress_line1() {
        return address_line1;
    }

    public void setAddress_line1(String address_line1) {
        this.address_line1 = address_line1;
    }

    public Datasource getDatasource() {
        return datasource;
    }

    public void setDatasource(Datasource datasource) {
        this.datasource = datasource;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState_code() {
        return state_code;
    }

    public void setState_code(String state_code) {
        this.state_code = state_code;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "country='" + country + '\'' +
                ", result_type='" + result_type + '\'' +
                ", city='" + city + '\'' +
                ", formatted='" + formatted + '\'' +
                ", county='" + county + '\'' +
                ", postcode='" + postcode + '\'' +
                ", lon='" + lon + '\'' +
                ", country_code='" + country_code + '\'' +
                ", address_line2='" + address_line2 + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", address_line1='" + address_line1 + '\'' +
                ", datasource=" + datasource +
                ", street='" + street + '\'' +
                ", rank=" + rank +
                ", state='" + state + '\'' +
                ", state_code='" + state_code + '\'' +
                ", lat='" + lat + '\'' +
                ", place_id='" + place_id + '\'' +
                '}';
    }
}
