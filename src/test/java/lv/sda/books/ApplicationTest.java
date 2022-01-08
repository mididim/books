package lv.sda.books;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    @Test
    public void searchBook(){
        Bookstore BS = new Bookstore();
        assertEquals(4,BS.searchBook("", 0).size());
    }

    @Test
    public void addBook(){
        Bookstore BS = new Bookstore();
        Book newBook = new Book("00001", "Title", "Description", "Author",
                "Publisher", 100, LocalDate.of(2000,1,1));
        BS.addBook(newBook);
        assertEquals(5,BS.searchBook("", 0).size());
    }

    @Test
    public void searchByTitle(){
        Bookstore BS = new Bookstore();
        assertEquals(0,BS.searchBook("", 2).size());
    }

    @Test
    public void removeBook(){
        Bookstore BS = new Bookstore();
        BS.removeBook(BS.searchBook("12324567892", 1).get(0));
        assertEquals(3,BS.searchBook("", 0).size());
    }
    
}
