public class Book implements Comparable<Book> {
    private String title, author;
    private Double price;

    public Book(String title, String author, Double price) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (!title.isEmpty()) {
            this.title = title;
        }else{
            throw new IllegalArgumentException("Title cannot be empty.");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (!author.isEmpty()) {
            this.author = author;
        }else{
            throw new IllegalArgumentException("Author cannot be empty.");
        }
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price >= 0) {
            this.price = price;
        }else{
            throw new IllegalArgumentException("Price cannot be negative.");
        }
    }

    @Override
    public int compareTo(Book book) {
        if (this.getPrice()>book.getPrice()){
            return -1;
        }else{
            return 1;
        }
    }

    @Override
    public String toString(){
        return String.format("Title: %s\nAuthor: %s\nPrice: %.2f",getTitle(), getAuthor(), getPrice());
    }
}
