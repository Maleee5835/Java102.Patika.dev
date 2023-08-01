import SystemManagament.Managament;
import User.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Managament managament = new Managament();

        Scanner scanner = new Scanner(System.in);

        boolean stiuation=true;
        while (stiuation){
            managament.displayMenu();
            int deger = scanner.nextInt();
            switch (deger){
                case 1:
                    System.out.print("(I/E): ");
                    String userType = scanner.next();
                    System.out.print("Kullanıcı adı: ");
                    String name = scanner.next();
                    System.out.print("Soyad: ");
                    String surname = scanner.next();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Şifre: ");
                    String password = scanner.nextLine();
                    System.out.print("Meslek: ");
                    String profession = scanner.nextLine();
                    System.out.print("Yaş: ");
                    int age = scanner.nextInt();
                    String companyName = null;
                    if (userType.equalsIgnoreCase("E")) {
                        System.out.print("Şirket Adı: ");
                        scanner.nextLine(); // Clear the buffer
                        companyName = scanner.nextLine();
                    }
                    managament.addUser(userType, name, surname, email, password, profession, age,
                            companyName);
                    break;
                case 2:
                    System.out.print("Email: ");
                    String userEmail = scanner.next();
                    System.out.print("Şifre: ");
                    String userPassword = scanner.nextLine();
                    Account account = managament.login(userEmail, userPassword);
                    if (account == null) {
                        System.out.println();
                    } else {
                        System.out.println("Login successful!");
                        boolean deger2 = true;
                        while (deger2) {
                            managament.afterLoginMenu();
                            int secenek2 = scanner.nextInt();
                            switch (secenek2) {
                                case 1:
                                    System.out.print("Sokak Adresi: ");
                                    String streetAddress = scanner.next();
                                    System.out.print("Yaşadığınız Şehir: ");
                                    String city = scanner.next();
                                    System.out.print("Ülke: ");
                                    String state = scanner.next();
                                    System.out.print("Posta Kodu: ");
                                    String zipCode = scanner.next();
                                    System.out.print("1-EV\n2-İŞ");
                                    System.out.println("Adres tipi:");
                                    int typeOfAdress = scanner.nextInt();
                                    if (typeOfAdress==1){
                                        managament.addHomeAdress(account.getUser(),streetAddress,city,state,zipCode);
                                    }else if (typeOfAdress==2){
                                        System.out.print("Şirket ismi");
                                        String nameOfCompony= scanner.next();
                                        managament.addBussinessAddress(account.getUser(),streetAddress,city,state,zipCode,nameOfCompony);
                                    }else {
                                        System.out.println("Yanlış bir değer girdiniz!!!");
                                    }
                                    break;
                                case 2:
                                    System.out.println("1. Araba Sigortası");
                                    System.out.println("2. Sağlık Sigortası ");
                                    System.out.println("3. Ev Sigortası ");
                                    System.out.println("4. Yolculuk Sigortası ");
                                    System.out.print("Seçiminiz: ");
                                    int insuranceChoice = scanner.nextInt();
                                    if (insuranceChoice==1){
                                        //Buralar kişinin isteğine göre,müşterinin tercihine göre doldurulacaktır.

                                    }
                                    break;
                                case 3:
                                    account.showUserInfo();
                                    break;
                                case 4:
                                    System.out.println("Sistemden çıkış yapılıyor...");
                                    break;
                                default:
                                    System.out.println("Yanlış bir değer girdiniz...");
                                    break;
                            }
                        }
                    }
                    break;
                case 3:
                    managament.showListAccount();
                    break;
                case 4:
                    System.out.println("Sistemden çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Yanlış işlem!!!");
                    break;
            }
       }
    }
}