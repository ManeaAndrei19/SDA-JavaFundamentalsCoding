package fundamentals.oop;

public class Store {
    private Product[] products;

    public Product[] getListOfProductsWithPriceBiggerThan(double limitPrice) {
        int index = 0;
        int length = 0;
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i].getPrice() > limitPrice) {
                length++;
            }
        }

        Product[] copyArray = new Product[length];


        System.out.println("Show products within price range: ");
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i].getPrice() > limitPrice) {
                copyArray[index++] = this.products[i];
            }
        }
        return copyArray;
    }


    public Product[] getProducts() {
        return this.products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
