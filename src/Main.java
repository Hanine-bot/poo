// src/Main.java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // إنشاء كائنات ثابتة
        PaperBook book1 = new PaperBook("كتاب برمجة", "أحمد علي", "12345");
        EBook book2 = new EBook("تعلم جافا", "سارة محمد", "67890");

        Borrower borrower1 = new Borrower("محمد حسن", "2023001");

        System.out.println("--- نظام مكتبة بسيط ---");
        System.out.println("1. عرض كتاب 1");
        System.out.println("2. عرض كتاب 2");
        System.out.println("3. استعارة كتاب 1");
        System.out.println("4. استعارة كتاب 2");
        System.out.println("5. استرجاع كتاب 1");
        System.out.println("6. استرجاع كتاب 2");
        System.out.println("0. خروج");

        int choice;
        do {
            System.out.print("أدخل خيارك: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // استهلاك السطر

            switch (choice) {
                case 1:
                    System.out.println(book1);
                    break;
                case 2:
                    System.out.println(book2);
                    break;
                case 3:
                    borrower1.borrowBook(book1);
                    break;
                case 4:
                    borrower1.borrowBook(book2);
                    break;
                case 5:
                    borrower1.returnBook(book1);
                    break;
                case 6:
                    borrower1.returnBook(book2);
                    break;
                case 0:
                    System.out.println("خروج...");
                    break;
                default:
                    System.out.println("خيار غير صحيح.");
            }
        } while (choice != 0);

        scanner.close();
    }
}