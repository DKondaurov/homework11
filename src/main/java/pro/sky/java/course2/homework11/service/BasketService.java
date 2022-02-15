package pro.sky.java.course2.homework11.service;

import java.util.List;

public interface BasketService {

    List<Integer> getOrder();

    boolean addOrder(List<Integer> id);
}
