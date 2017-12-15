import items.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before(){
        book = new Book(30,0.2,"Learn to play Guitar");
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(36, book.calculateMarkup(), 01);
    }

    @Test
    public void canGetName(){
        assertEquals("Learn to play Guitar", book.getName());
    }
}


