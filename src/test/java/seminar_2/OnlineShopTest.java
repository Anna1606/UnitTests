package seminar_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import seminar_2.OnlineShop.Cart;
import seminar_2.OnlineShop.Product;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OnlineShopTest {
    private Cart cart;
    private Product product1;
    private Product product2;

    @BeforeEach
    public void setUp() {
        cart = new Cart();
        product1 = new Product(1,"apple", 1.2, 10);
        product2 = new Product(2,"banana", 1.8, 3);
    }

    @Test
    public void calculateTotalTest() {
        cart.addItem(product1);
        cart.addItem(product2);
        double expectedTotal = 17.4;
        double actualTotal = cart.calculateTotal();
        assertEquals(expectedTotal,actualTotal,"стоимость корзины некорректа");
    }
}
