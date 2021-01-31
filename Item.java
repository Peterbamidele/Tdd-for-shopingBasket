package ShoppingBasket;

public class Item {
    private final double unitPrice;
    private final double quantity;


    public Item(double unitPrice, int quantity) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;

    }

//    public double getUnitPrice() {
//        double unitPrice = 0;
//        return unitPrice;
//    }

//    public double getunitPrice() {
//        return unitPrice;
//    }
//
//    public double getQuantity() {
//        return quantity;
//    }
    double getSubTotal(){
        return unitPrice * (double) quantity;
    }
}
