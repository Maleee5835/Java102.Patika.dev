package Addresses;

public class HomeAddress implements Adress{

    private String street;
    private String city;
    private String country;
    private String postalCode;

    public HomeAddress(String street, String city, String country, String postalCode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
    }

    @Override
    public String getStreet() {
        return null;
    }

    @Override
    public void setStreet(String street) {

    }

    @Override
    public String getCity() {
        return null;
    }

    @Override
    public void setCity(String city) {

    }

    @Override
    public String getCountry() {
        return null;
    }

    @Override
    public void setCountry(String country) {

    }

    @Override
    public String getPostalCode() {
        return null;
    }

    @Override
    public void setPostalCode(String postalCode) {

    }

    @Override
    public String toString() {
        return "HomeAddress{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
