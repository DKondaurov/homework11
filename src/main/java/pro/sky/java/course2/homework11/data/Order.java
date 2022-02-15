package pro.sky.java.course2.homework11.data;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
    private final List<Integer> order;

    public Order() {
        this.order = new ArrayList<>();
    }

    public boolean addOrder(List<Integer> id) {
        return order.addAll(id);
    }

    public List<Integer> getOrder() {
        return Collections.unmodifiableList(order);
    }
}
