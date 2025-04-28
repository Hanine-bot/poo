// src/Borrower.java

import java.util.ArrayList;
import java.util.List;

public class Borrower {
    private String name;
    private String universityId;
    private List<Book> borrowedBooks;

    public Borrower(String name, String universityId) {
        this.name = name;
        this.universityId = universityId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() { return name; }
    public String getUniversityId() { return universityId; }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.borrowBook();
        } else {
            System.out.println("الكتاب غير متوفر للإعارة.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook();
        } else {
            System.out.println("هذا الكتاب غير مستعار من طرف هذا المستعير.");
        }
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public String toString() {
        return "الاسم: " + name + ", الرقم الجامعي: " + universityId;
    }
}