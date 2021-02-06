package fundamentals.oop;

import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private int[] expirationDate;

    public Product(String name, double price, int[] expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public int[] addDate() {
        Scanner scan = new Scanner(System.in);
        int[] date = new int[3];

        System.out.print("Input day: ");
        date[0] = scan.nextInt();
        while (date[0] > 30 || date[0] < 1) {
            System.out.print("Input day: ");
            date[0] = scan.nextInt();
        }

        System.out.print("Input month: ");
        date[1] = scan.nextInt();
        while (date[1] > 12 || date[1] < 1) {
            System.out.print("Input month: ");
            date[1] = scan.nextInt();
        }

        System.out.print("Input year: ");
        date[2] = scan.nextInt();
        while (date[2] > 3000 || date[2] < 2021) {
            System.out.print("Input year: ");
            date[2] = scan.nextInt();
        }

        return date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int[] getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int[] expirationDate) {
        this.expirationDate = expirationDate;
    }
}
