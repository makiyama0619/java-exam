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
}
    public int getAveragePrice(){
       return getTotalPrice() / this.size();
    }
}
