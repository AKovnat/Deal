package by.academy.Deal;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Deal {

    private User seller;
    private User buyer;
    private Product[] products;



    public Deal(User seller, User buyer, Product[] products) {
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;

    }
}
