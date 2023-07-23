import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>(new OrderByPageOfBookComperator());
        TreeSet<Book> books2 = new TreeSet<>(new OrderByLetterOfBookComperator());
        books.add(new Book("Osman",100,"Reşat Nuri",2010));
        books.add(new Book("Ömer",150,"Franz Kafka ",1252));
        books.add(new Book("malimali",123,"maliyazar",2010));
        books.add(new Book("izmir",3423,"yazarizmir",2010));
        books.add(new Book("istanbul",13123,"istanbulyazar",2010));

        books2.addAll(books);

        for (Book book :books){
            System.out.println(book.getBookPage());
        }
        System.out.println("********************");

        for (Book book : books2){
            System.out.println(book.getBookName());
        }

        //Normalde derlediğim zaman kitap isimleri düzenli bir sırada çıkması gerekirken anlamadığım bir şekilde random çıkıyor.Yardım edebilirseniz çok mutlu olurum.


    }
}