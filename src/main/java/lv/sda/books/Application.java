package lv.sda.books;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Application {

    //Agris
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Bookstore BS = new Bookstore();
        while (true) {
            Bookstore.printMenu();
            String input = scanner.nextLine();

            if ("q".equalsIgnoreCase(input)) {
                System.out.println("Exit");
                break;
            }
            switch (input) {
                case "1" -> BS.printData("Search book by name:", BS.searchBook(BS.inputBookTitle(), 2));
                case "2" -> BS.addBook(BS.newBookInput());
                case "3" -> {
                    try {
                        BS.removeBook(BS.searchBook(BS.inputBookIsbn(), 1).get(0));
                    } catch (Exception e) {
                        System.out.println("Book not found");
                    }
                }
                case "4" -> BS.printData("Search book by isbn nr.:", BS.searchBook(BS.inputBookIsbn(), 1));
                case "5" -> BS.printData("List of all books:", BS.searchBook("", 0));
                case "6" -> BS.saveData();
            }
        }
    }

    //Dima
/*    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        Bookstore bookStore = new Bookstore();

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Search book");
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Get Book info");
            System.out.println("5. List Available Books");
            System.out.println("6. Write to file");
            System.out.println("Press Q to quit ");
            String input = scanner.nextLine();

            if ("q".equalsIgnoreCase(input)){
                System.out.println("Beidzam darbu");
                break;
            }
            switch (input){
                case "1":
                    System.out.println("Searching for");
                    System.out.println("Enter book name: ");
                    String myInput = scanner.nextLine();
                    bookStore.searchBook(myInput);
                    break;

                case "2":
                    //full old method
                    System.out.println("Adding Book");

                    Book b1 = new Book();
                    System.out.println("Enter ISBN: ");
                    b1.setIsbn(scanner.nextLine());

                    System.out.println("Enter title: ");
                    b1.setTitle(scanner.nextLine());

                    System.out.println("Enter description: ");
                    b1.setDescription(scanner.nextLine());

                    System.out.println("Enter author: ");
                    b1.setAuthor(scanner.nextLine());

                    System.out.println("Enter publisher: ");
                    b1.setPublisher(scanner.nextLine());

                    System.out.println("Enter number of pages: ");
                    b1.setPages(scanner.nextInt());

                    System.out.println("Enter publishing year: ");
                    b1.setPublishingYear(LocalDate.of(2001,1,1));

                    bookStore.addBook(b1);
                    bookStore.allBooks();

                    bookStore.addBook(bookStore.newBookInput());

                    bookStore.allBooks();
                    break;

                case "3":
                    System.out.println("Removing Book");
                    System.out.println("Enter books ISBN to remove: ");
                    String myInput3 = scanner.nextLine();
                    bookStore.removeBook(myInput3);
                    break;

                case "4":
                    System.out.println("Book Info");
                    System.out.println("Enter isbn number: ");
                    String myInput4 = scanner.nextLine();
                    bookStore.getInfo(myInput4);
                    break;

                case "5":
                    System.out.println("Available Books");
                    bookStore.allBooks();
                    break;

                case "6":
                    bookStore.saveData();


            }
        }

    }*/

}
