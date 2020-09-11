package create.buildpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        this.items.add(item);
    }

    public Float getCost(){
        float cost = 0.0f;
        items.forEach(item -> {
            float price = item.price();
            // TODO 待跟进
//            cost+=price;
        });
        return cost;
    }
}
