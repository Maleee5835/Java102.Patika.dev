public class Book {
//Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır.

    private String bookName;
    private Integer bookPage;
    private String authorName;
    private Integer dateOfPublish;

    public Book(String bookName, Integer bookPage, String authorName, Integer dateOfPublish) {
        this.bookName = bookName;
        this.bookPage = bookPage;
        this.authorName = authorName;
        this.dateOfPublish = dateOfPublish;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookPage() {
        return bookPage;
    }

    public void setBookPage(Integer bookPage) {
        this.bookPage = bookPage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getDateOfPublish() {
        return dateOfPublish;
    }

    public void setDateOfPublish(Integer dateOfPublish) {
        this.dateOfPublish = dateOfPublish;
    }
}
