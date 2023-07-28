import java.util.*;

public class Store {

    ArrayList<Brands> brandsArrayList = new ArrayList<>();
    ArrayList<BaseProducts> phoneProductArrayList = new ArrayList<>();
    ArrayList<BaseProducts> notebookProductArrayList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void store(){

        Brands samsung = new Brands(1, "Samsung");
        Brands lenova = new Brands(2, "Lenova");
        Brands Huawei = new Brands(3, "Huawei");
        Brands Casper = new Brands(4, "Casper");
        Brands Asus = new Brands(5, "Asus");
        Brands Hp = new Brands(6, "HP");
        Brands Xiomi = new Brands(7, "Xiomi");
        Brands Monster = new Brands(8, "Monster");
        Brands Apple = new Brands(9, "Apple");

        brandsArrayList.addAll(List.of(new Brands[]{samsung,lenova,Huawei,Casper,Asus,Hp,Xiomi,Monster,Apple}));

        PhoneProduct p20 = new PhoneProduct(100, 15200, 15, 150, "Huawei P20", brandsArrayList.get(2), 128, 1.6, 6, "white", 400);
        PhoneProduct iPhone11 = new PhoneProduct(101, 32550, 12, 225, "iPhone 11", brandsArrayList.get(8), 64, 5, 4, "black", 800);
        PhoneProduct galaxy = new PhoneProduct(102, 3199, 12, 55, "Galaxy A51", brandsArrayList.get(0), 128, 6.5, 5, "red", 220);
        PhoneProduct Note10 = new PhoneProduct(103, 4012, 10, 440, "Redmi Note 10 Pro", brandsArrayList.get(6), 8, 6.5, 8, "Black", 125);
        phoneProductArrayList.addAll(List.of(new PhoneProduct[]{p20,iPhone11,galaxy,Note10}));

        NotebookProduct Matebook = new NotebookProduct(200, 7000, 5, 88, "Matebook 14", brandsArrayList.get(2), 512, 14, 16, "White");
        NotebookProduct V14Igl = new NotebookProduct(201, 3699, 4, 45, "V14 IGL", brandsArrayList.get(1), 1024, 14, 8, "Black");
        NotebookProduct TufGaming = new NotebookProduct(202, 8199, 3, 20, "Tuf Gaming", brandsArrayList.get(4), 2048, 15.6, 32, "Orange");
        notebookProductArrayList.addAll(List.of(new NotebookProduct[]{Matebook,V14Igl,TufGaming}));

        menu();
    }
    public void menu(){
        System.out.println("PatikaStore Ürün Yönetim Paneli !\n" +
                "1 - Notebook İşlemleri\n" +
                "2 - Cep Telefonu İşlemleri\n" +
                "3 - Marka Listele\n" +
                "0 - Çıkış Yap");
        System.out.print("Seçiminiz:");
        int secim = scanner.nextInt();
        switch (secim){
            case 1:
                cihazMenu(notebookProductArrayList);
                break;
            case 2:
                cihazMenu(phoneProductArrayList);
                break;
            case 3:
                markaListesi();
                break;
            case 4:
                System.out.println("Sistemden çıkış yapılıyor...");
                break;
            default:
                System.out.println("Yanlış değer girildi!!!");
                System.out.print("Sistemden çıkmak için 1'e devam etmek için herhangi bir tuşa basınız:");
                int secim2 = scanner.nextInt();
                if (secim2==1){
                    System.out.println("Sistemden çıkış yapılıyor...");
                    break;
                }else {
                    menu();
                }
        }
    }
    public void cihazMenu(ArrayList<BaseProducts>products){
        System.out.print("1 - Ürün Listesi \n" +
                "2 - Ürün Ekle \n" +
                "3 - Ürün Kaldır \n" +
                "4 - Ürün sırala \n" +
                "0 - geri ");
        System.out.println();
        System.out.print("Seçiminiz:");
        int secim = scanner.nextInt();
        switch (secim){
            case 0:
                menu();
                break;
            case 1:
                urunListesi(products);
                break;
            case 2:
                addProduct(products);
                break;
            case 3:
                removeProduct(products);
                break;
            case 4:
                sortProducts(products);
                break;
            default:
                System.out.println("Yanlış bir değer girdiniz!!!");
                menu();
        }
    }
    public void addProduct(ArrayList<BaseProducts> products){
        System.out.println("********************** Ürün Ekleme Ekranına Hoş geldiniz **********************");
        System.out.print("Urun id:");
        int productId= scanner.nextInt();
        System.out.print("Birim fiyat:");
        int unitPrice = scanner.nextInt();
        System.out.print("İndirim oranı:");
        int discountRate = scanner.nextInt();
        System.out.print("Depolama:");
        int storage = scanner.nextInt();
        System.out.print("Ürün adı:");
        String productName = scanner.next();
        Brands brand = markaSecimi();
        System.out.print("Hafıza");
        int memoryProduct = scanner.nextInt();
        System.out.print("Ekran büyüklüğü:");
        double screenSize = scanner.nextInt();
        System.out.print("Ram:");
        int ram = scanner.nextInt();
        System.out.print("Renk:");
        String colour = scanner.next();
        if (products == notebookProductArrayList){
            System.out.print("Pil gücü:");
            int power = scanner.nextInt();
            phoneProductArrayList.add(new PhoneProduct(productId,unitPrice,discountRate,storage,productName,brand,memoryProduct,screenSize,ram,colour,power));
        }else {
            notebookProductArrayList.add(new NotebookProduct(productId,unitPrice,discountRate,storage,productName,brand,memoryProduct,screenSize,ram,colour));
        }
    }
    public void removeProduct(ArrayList<BaseProducts> products){
        System.out.print("Silmek istediğiniz ürünün id'sini giriniz:");
        int idSec = scanner.nextInt();
        for (BaseProducts baseProducts :products){
            if (baseProducts.getId()== idSec){
                products.remove(baseProducts);
                System.out.println("Ürün sistemden silindi...");
            }
        }
        cihazMenu(products);
    }
    public void sortProducts(ArrayList<BaseProducts> products){
        System.out.println("1 - A-Z \n" +
                "2 - Z-A \n" +
                "3 - Küçükten büyüğe \n" +
                "4 - Büyükten küçüğe ");
        System.out.print("Hangi türde ürünleri sıralamak istersiniz:");
        int secim = scanner.nextInt();
        switch (secim){
            case 1:
                products.sort(new Comparator<BaseProducts>() {
                    @Override
                    public int compare(BaseProducts o1, BaseProducts o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });
                urunListesi(products);
                break;
            case 2:
                products.sort(new Comparator<BaseProducts>() {
                    @Override
                    public int compare(BaseProducts o1, BaseProducts o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                }.reversed());
                urunListesi(products);
                break;
            case 3:
                products.sort(new Comparator<BaseProducts>() {
                    @Override
                    public int compare(BaseProducts o1, BaseProducts o2) {
                        return o1.getId()-o2.getId();
                    }
                });
                urunListesi(products);
                break;
            case 4:
                products.sort(new Comparator<BaseProducts>() {
                    @Override
                    public int compare(BaseProducts o1, BaseProducts o2) {
                        return o1.getId()-o2.getId();
                    }
                }.reversed());
                urunListesi(products);
                break;
        }
    }
    public Brands markaSecimi(){
        System.out.println("Markalar\n--------------------");
        for (Brands brands :brandsArrayList){
            System.out.println(brands.getId() + ") " + brands.getName());
        }
        System.out.print("Markanızı seçiniz:");
        int secim = scanner.nextInt();
        return brandsArrayList.get(secim-1);
    }
    public void urunListesi(ArrayList<BaseProducts> products){
        System.out.println("| ID |      Ürün Adı            |   Fiyat      |  Marka       |  Depolama   |  Ekran    |    Ram     |");
        System.out.println("-----------------------------------------------------------------------------------------------------");

        for (BaseProducts products1 : products){
            System.out.println( products1.getId() + " | " + products1.getName() + " | " + products1.getPrice() + " | " + products1.getBrand().getName() + " | " + products1.getMemory() + " | " + products1.getScreenSize() + " | " + products1.getRam());
        }
    }
    public void markaListesi(){
        brandsArrayList.sort(new OrderByeLetterComparable());

        Iterator<Brands> itr = brandsArrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
