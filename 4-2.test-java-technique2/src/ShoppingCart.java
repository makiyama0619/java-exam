import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart extends LinkedList<Item>{

    List<Item>list = new ArrayList<>();
    
    public int getTotalPrice(){
        int totalPrice = 0;
        for (Item item : this) {
			totalPrice += item.getPrice();
		}
		return totalPrice;

    public int getAveragePrice(){
        if (this.isEmpty()) {
            return 0;
        }
        return getTotalPrice() / this.size();
    }
}
}
