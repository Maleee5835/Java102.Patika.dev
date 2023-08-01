package SystemManagament;
import Addresses.Adress;
import Addresses.BusinessAddress;
import Insurance.Insurance;
import User.Account;
import Addresses.AdressManager;
import Addresses.HomeAddress;
import User.AccountManager;
import User.User;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeSet;

public class Managament {
    public AccountManager accountManager;

    public Account account;
    public Managament() {
        this.accountManager = new AccountManager();
    }

    public void displayMenu() {
        System.out.println("#################### Menü ####################");
        System.out.println("1. Kullanıcı ekle (Bireysel veya Kurumsal)");
        System.out.println("2. Giriş");
        System.out.println("3. Liste Hesaplarını Göster");
        System.out.println("4. Çıkış");
        System.out.println("#################################################");
        System.out.print("Seçiminiz:");
    }
    public void addUser(String userType, String name, String surname, String email, String password, String profession,
                        int age, String companyName){
        //String name, String lastName, String email, String sifre, String job, int age
        User user = new User(name,surname,email,password,profession,age);
        if (userType.equals("I")){
            Account account1 = new Account(user) {
                @Override
                public void addInsurance(Insurance insurance) {

                }
            };
            accountManager.addAccount(account1);
            System.out.println("Sisteme başarı ile eklenmiştir.");
        } else if (userType.equals("E")) {
            Account account2 = new Account(user) {
                @Override
                public void addInsurance(Insurance insurance) {

                }
            };
            accountManager.addAccount(account2);
            System.out.println("Sisteme başarı ile eklenmiştir.");
        }

    }
    public Account login(String email ,String password){
        Account account = accountManager.login(email, password);
        if (account != null)
            account.showUserInfo();
        return account;
    }
    public void afterLoginMenu() {
        System.out.println("#################################################");
        System.out.println("1. Adres Ekle");
        System.out.println("2. Sigorta Ekle");
        System.out.println("3. Kullanıcı bilgilerini göster");
        System.out.println("4. Çıkış");
        System.out.println("#################################################");
        System.out.print("Seçiminiz:");
    }
    public void addHomeAdress(User user,String street, String city, String country, String postalCode){
        Adress homeAddress = new HomeAddress(street,city,country,postalCode);
        AdressManager.addAddress(user,homeAddress);
            System.out.println("Sisteme başarı ile eklenmiştir.");
    }
    public void addBussinessAddress(User user,String street, String city, String country, String postalCode, String companyName){
        Adress bussinesAddress = new BusinessAddress(street,city,country,postalCode,companyName);
        AdressManager.addAddress(user,bussinesAddress);
        System.out.println("Sisteme başarı ile eklenmiştir.");
    }
    public void showListAccount(){
        TreeSet<Account> accountList = accountManager.getAccountList();
        if (accountList.isEmpty()) {
            System.out.println("Hesap bulunamadı!!!");
            return;
        }
        for (Account account : accountList){
            System.out.print("Kullanıcı adı : " + account.getUser().getName());
            System.out.println(account.getUser().getLastName());
            System.out.println(account.getUser().getJob());
            System.out.println(account.getUser().getLocalDate());
            System.out.println(account.getUser().getEmail());
            System.out.println(account.getUser().getAge());
        }
    }
    public void showUserInfo(){
        account.showUserInfo();
    }
}
