package ShoppingBasket;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingBasketTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void totalOfEmptyBasket(){
        ShoppinBasket basket =  buildBasketWithItems();
//        ShoppinBasket basket = new ShoppinBasket(new ArrayList<>());
        assertEquals(0.0,basket.getTotal(),0.0);
    }

    @Test
    void TotalOfSingleItem() {
        ShoppinBasket basket = buildBasketWithItems((new Item(100.0,1)));
//       ShoppinBasket basket = new ShoppinBasket(Arrays.asList(new Item(100.0,1)));
        assertEquals(100.0,basket.getTotal(),0.0);}



        @Test
    void totalOfTwoItem(){
        ShoppinBasket basket =  buildBasketWithItems(new Item(100.0,1),new Item(200.0,1));
//        ShoppinBasket basket = new ShoppinBasket(Arrays.asList(new Item(100.0,1),new Item(200.0,1)));
        assertEquals(300.0,basket.getTotal(),0.0);
        }

        @Test
        void totalOfItemswithQuantity(){
            ShoppinBasket basket = buildBasketWithItems(new Item(100.0,2));
            assertEquals(200.0,basket.getTotal(),0.0);
        }

    private ShoppinBasket buildBasketWithItems(Item...items){
        return new ShoppinBasket(Arrays.asList(items));

    }
}