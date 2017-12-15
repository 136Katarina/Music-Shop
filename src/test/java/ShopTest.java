import instruments.Guitar;
import instruments.ISell;
import instruments.Violin;
import items.Book;
import org.junit.Before;
import org.junit.Test;
import shops.Shop;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class ShopTest {
    Shop shop;
    Guitar guitar1;
    Guitar guitar2;

    @Before
    public void before(){
        shop = new Shop("Musican");
        guitar2 = new Guitar(5,"wood","white","medium",200, 100);
        guitar1 = new Guitar(7,"wood","white","medium",200, 100);
    }




    @Test
    public void canAddItem(){
        shop.add(guitar1);
        assertEquals(1, shop.totalStock() );

    }

    @Test
    public void canClearStock(){
        shop.add(guitar1);
        shop.clearStock();
        assertEquals(0, shop.totalStock());
    }

    @Test
    public void canRemoveItem(){
        shop.add(guitar1);
        shop.add(guitar2);
        assertEquals(2, shop.totalStock());
        shop.remove(1);
        assertEquals(1, shop.totalStock());

    }

}
