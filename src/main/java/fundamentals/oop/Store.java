package fundamentals.oop;

public class Store {
    private Product[] products;

    public void prouctList(double limitPrice){
        System.out.println("Show products within price range: ");
        for(int i=0;i< getProducts().length;i++){
//            if()
        }
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
