package User;

import Addresses.AdressManager;

import java.time.LocalDate;
import java.util.ArrayList;

public class User {


    private String name;
    private String lastName;
    private String email;
    private String sifre;
    private String job;
    private int age;
    private LocalDate localDate;
    ArrayList<AdressManager> addressArrayList = new ArrayList<>();


    public User(String name, String lastName, String email, String sifre, String job, int age) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.sifre = sifre;
        this.job = job;
        this.age = age;
        this.localDate = localDate;
        this.addressArrayList = addressArrayList;
    }

    public void addAddress(AdressManager address) {
        this.addAddress(address);
    }
    public void removeAddres(AdressManager address) {
        this.removeAddres(address);
    }
    public boolean checkPassword(String password){
        return this.sifre.equals(password);
    }

    //Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSifre() {
        return sifre;
    }
    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public LocalDate getLocalDate() {
        return localDate;
    }
    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
    public ArrayList<AdressManager> getAddressArrayList() {
        return addressArrayList;
    }
    public void setAddressArrayList(ArrayList<AdressManager> addressArrayList) {
        this.addressArrayList = addressArrayList;
    }


    public static class IndividualCustomerProfile extends AccountManager {
        public IndividualCustomerProfile(User user) {
            super();
        }
    }
}
