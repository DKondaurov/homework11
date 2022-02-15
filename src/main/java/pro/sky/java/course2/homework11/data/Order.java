package pro.sky.java.course2.homework11.data;


import java.util.List;
import java.util.Objects;

public class Order {

    private List<Integer> id;

    public List<Integer> getId() {
        return id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
