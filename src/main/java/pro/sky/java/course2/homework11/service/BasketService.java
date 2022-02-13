package pro.sky.java.course2.homework11.service;

import java.util.List;

public interface BasketService {

    boolean addOrder(String id);

    List<String> getOrder();
}
