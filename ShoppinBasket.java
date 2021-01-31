package ShoppingBasket;

import java.util.List;

public class ShoppinBasket {
    private final List<Item> items;

    public ShoppinBasket(List<Item> items){
        this.items = items;
    }

//    public double getTotal() {
//        if (items.isEmpty())
//        return 0.0;
//       return items.get(0).getunitPrice();
//    }

    public double getTotal() {
        return items.stream().mapToDouble(item -> item.getSubTotal()).sum();
//        return items.stream().mapToDouble(item -> item.getSubTotal())item.getunitPrice()*item.getQuantity()).sum();
    }

//    private double getSubTotal(Item item) {
//       return item.getunitPrice()*item.getQuantity();
//    }



}
