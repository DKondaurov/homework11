package pro.sky.java.course2.homework11.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.course2.homework11.data.Order;
import pro.sky.java.course2.homework11.service.BasketService;

import java.util.*;
import java.util.stream.Collectors;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {

    private final List<Order> orders;

    public BasketServiceImpl() {
        this.orders = new ArrayList<>();
    }

    @Override
    public boolean addOrder(String id) {
        return orders.add(new Order(id));
    }

    @Override
    public List<String> getOrder() {
        return orders.stream()
                .map(product -> product.getId())
                .collect(Collectors.toList());
    }

}