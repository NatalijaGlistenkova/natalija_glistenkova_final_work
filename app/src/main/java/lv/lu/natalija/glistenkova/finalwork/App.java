package lv.lu.natalija.glistenkova.finalwork;

import lv.lu.natalija.glistenkova.finalwork.model.Product;
import lv.lu.natalija.glistenkova.finalwork.repository.ProductRepository;
import lv.lu.natalija.glistenkova.finalwork.service.ProductService;
import lv.lu.natalija.glistenkova.finalwork.ui.ConsulUi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Map<Long, Product> repository = new HashMap<>();
        ProductRepository productRepository = new ProductRepository(repository);
        ProductService productService = new ProductService(productRepository);
        Scanner scanner = new Scanner(System.in);

        new ConsulUi(productService, scanner).run();
    }

}
