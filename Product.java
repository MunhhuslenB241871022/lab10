import java.util.*;
import java.util.stream.*;

class Product {
    private String name;
    private int price;
    private String category;

    public Product(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getPrice() { return price; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return name + " (" + price + ")";
    }
}

public class ProductAnalyzer {
    public static Map<String, List<Product>> analyze(List<Product> products) {
        return products.stream()
                .filter(p -> p.getPrice() > 1000)
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .collect(Collectors.groupingBy(Product::getCategory, LinkedHashMap::new, Collectors.toList()));
    }

    public static void main(String[] args) {
        List<Product> items = Arrays.asList(
                new Product("Цамц", 1200, "Хувцас"),
                new Product("Гутал", 1500, "Хувцас"),
                new Product("Тоглоом", 800, "Электрон"),
                new Product("Утас", 2000, "Электрон")
        );

        Map<String, List<Product>> grouped = analyze(items);
        grouped.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
