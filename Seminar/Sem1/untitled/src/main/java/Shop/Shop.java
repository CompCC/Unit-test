package Shop;


import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice(List<Product> products) {
        // Допишите реализацию метода самостоятельно
        products.sort(new ProductComparator());
        return products;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct(List<Product> products) {
        // Допишите реализацию метода самостоятельно
        int temp = 0;
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getCost() > temp) {
                temp = products.get(i).getCost();
                index = i;
            }
        }

        return products.get(index);
    }

}

class ProductComparator implements java.util.Comparator<Product> {
    @Override
    public int compare(Product a, Product b) {
        return a.getCost() - b.getCost();
    }
}