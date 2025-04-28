// src/BorrowingProcess.java

import java.time.LocalDate;

public class BorrowingProcess {
    private Book book;
    private Borrower borrower;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public BorrowingProcess(Book book, Borrower borrower) {
        this.book = book;
        this.borrower = borrower;
        this.borrowDate = LocalDate.now(); // تاريخ الإعارة هو اليوم الحالي
        this.returnDate = null; // لم يتم الإرجاع بعد
    }

    public Book getBook() { return book; }
    public Borrower getBorrower() { return borrower; }
    public LocalDate getBorrowDate() { return borrowDate; }
    public LocalDate getReturnDate() { return returnDate; }

    public void returnBook() {
        this.returnDate = LocalDate.now(); // تسجل تاريخ الإرجاع
        borrower.returnBook(book);
    }

    public boolean isReturned() {
        return returnDate != null;
    }

    @Override
    public String toString() {
        return "كتاب: " + book.getTitle() + ", مستعير: " + borrower.getName() + 
               ", تاريخ الإعارة: " + borrowDate +
               ", تاريخ الإرجاع: " + (returnDate != null ? returnDate : "لم يتم الإرجاع بعد");
    }
}