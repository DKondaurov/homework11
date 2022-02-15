package pro.sky.java.course2.homework11.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.course2.homework11.service.BasketService;

import java.util.*;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {

    private final List<Integer> orders;

    public BasketServiceImpl() {
        this.orders = new ArrayList<>();
    }

    @Override
    public boolean addOrder(List<Integer> id) {
        return orders.addAll(id);
    }

    @Override
    public List<Integer> getOrder() {
        return Collections.unmodifiableList(orders);
    }

}