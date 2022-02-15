package pro.sky.java.course2.homework11.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.homework11.data.Order;
import pro.sky.java.course2.homework11.service.BasketService;

import java.util.*;

@Service
public class BasketServiceImpl implements BasketService {

    private final Order order;

    public BasketServiceImpl(Order order) {
        this.order = order;
    }

    public boolean addOrder(List<Integer> id) {
        return order.addOrder(id);
    }

    public Collection<Integer> getOrder() {
        return order.getOrder();
    }
}