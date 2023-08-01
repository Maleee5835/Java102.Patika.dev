package User;

import Addresses.AdressManager;
import Insurance.Insurance;
import com.sun.net.httpserver.Authenticator;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Account {
//Account sınıfı müşterinin sisteme giriş sonrasında tüm bilgilerinin tutulduğu hesap bilgisidir.
    User user;
    ArrayList<Insurance> insuranceArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    private AuthenticationStatus authenticationStatus;

    public enum AuthenticationStatus {
        SUCCESS, FAIL;
    }

    public Account(User user) {
        this.user = user;
        this.insuranceArrayList = insuranceArrayList;
        this.authenticationStatus = authenticationStatus;
    }

    public final void showUserInfo(){
        System.out.println("İsim : " +user.getName());
        System.out.println("Soyisim : "  +user.getLastName());
        System.out.println("Email : " + user.getEmail());
        System.out.println("Şifre : " + user.getSifre());
        System.out.println("Meslek : " + user.getJob());
        System.out.println("Giriş tarihi :" + user.getLocalDate());
        System.out.println("Adres:");
        for (AdressManager address : user.getAddressArrayList()) {
            System.out.println(address);
        }
        System.out.println();
        System.out.println("Sigorta:");
        for (Insurance insurance : insuranceArrayList) {
            System.out.println(insurance);
        }
    }
    public void loginOlmaDurumu(String emailControl, String sifreControl ) throws InvalidAuthenticationException {
        if (emailControl.equals(user.getEmail()) && sifreControl.equals(user.getSifre())){
            this.authenticationStatus=AuthenticationStatus.SUCCESS;
        }else {
                throw new InvalidAuthenticationException("Hatalı Giriş !!!");
        }
    }
    public void addAddress(User user,AdressManager address) {
        if (authenticationStatus == AuthenticationStatus.SUCCESS) {
            user.addAddress(address);
        }
    }
    public void removeAddress(AdressManager address) {
        if (authenticationStatus == AuthenticationStatus.SUCCESS) {
            user.removeAddres(address);
        }
    }
    @Override
    public int hashCode() {
        //equals'ı override ettiğimiz zaman peşine hemen hashCode'u da over ride etmeliyiz.
        return user.getEmail().hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Account)) {
            return false;
        }
        Account other = (Account) obj;
        // emailler birbirini tutuyor mu diye kontrol ediyoruz.
        return this.user.getEmail().equals(other.user.getEmail());
    }
    public abstract void  addInsurance(Insurance insurance);

    //Getter and Setter
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public ArrayList<Insurance> getInsuranceArrayList() {
        return insuranceArrayList;
    }
    public void setInsuranceArrayList(ArrayList<Insurance> insuranceArrayList) {
        this.insuranceArrayList = insuranceArrayList;
    }
    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }
    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }
}
