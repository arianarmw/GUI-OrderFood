package OrderFood;

public class Product {
    private String productName;
    private String price;
    private boolean isOrder;
    
    public Product(String name, String price, boolean isOrder){
        this.productName = name;
        this.price = price;
        this.isOrder = isOrder;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isOrder() {
        return isOrder;
    }

    public void setIsOrder(boolean isOrder) {
        this.isOrder = isOrder;
    }    
}
