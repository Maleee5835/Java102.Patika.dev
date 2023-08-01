package Addresses;
public class BusinessAddress implements Adress{

    private String street;
    private String city;
    private String country;
    private String postalCode;
    private String companyName;

    public BusinessAddress(String street, String city, String country, String postalCode, String companyName) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
        this.companyName = companyName;
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
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BusinessAddress{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
