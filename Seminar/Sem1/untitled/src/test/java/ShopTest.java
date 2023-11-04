import Shop.Product;
import Shop.Shop;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */

    @Test
    void quantity() {
        Shop shop = new Shop();
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        product1.setTitle("Apple");
        product1.setCost(122);
        product2.setTitle("Tomato");
        product2.setCost(200);
        product3.setTitle("Lemon");
        product3.setCost(160);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        shop.setProducts(productList);
        assertThat(shop.getProducts().size()).isEqualTo(3);
    }

    @Test
    void getMostExpensiveProduct(){
        Shop shop = new Shop();
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        product1.setTitle("Apple");
        product1.setCost(122);
        product2.setTitle("Tomato");
        product2.setCost(200);
        product3.setTitle("Lemon");
        product3.setCost(160);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        shop.setProducts(productList);
        assertThat(shop.getMostExpensiveProduct(productList)).isEqualTo(product2);
    }

    @Test
    void sortProductsByPrice(){
        Shop shop = new Shop();
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        product1.setTitle("Apple");
        product1.setCost(122);
        product2.setTitle("Tomato");
        product2.setCost(200);
        product3.setTitle("Lemon");
        product3.setCost(160);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        shop.setProducts(productList);
        out.println(productList.toString());
        shop.sortProductsByPrice(productList);
        out.println(productList.toString());
        assertThat(productList.get(2)).isEqualTo(product2);
    }
}
