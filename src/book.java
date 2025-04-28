// src/Book.java

public abstract class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true; // متوفر افتراضياً
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return isAvailable; }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("الكتاب معار حالياً.");
        }
    }

    public void returnBook() {
        isAvailable = true;
    }

    public abstract String getType(); // لتعدد الأشكال (Polymorphism)

    @Override
    public String toString() {
        return "عنوان: " + title + ", مؤلف: " + author + ", ISBN: " + isbn + ", متوفر: " + isAvailable;
    }
}