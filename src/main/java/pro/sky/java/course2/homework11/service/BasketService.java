package pro.sky.java.course2.homework11.service;

import java.util.Collection;
import java.util.List;

public interface BasketService {

    Collection<Integer> getOrder();

    boolean addOrder(List<Integer> id);
}
