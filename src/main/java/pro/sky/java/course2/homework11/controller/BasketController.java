package pro.sky.java.course2.homework11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.homework11.service.BasketService;

import java.util.List;

@RequestMapping("/order")
@RestController

public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketServiceImpl) {
        this.basketService = basketServiceImpl;
    }


    //localhost:8080/store/order/add?id=122
    @GetMapping("/add")
    boolean addOrder(@RequestParam("id") String id) {
        return basketService.addOrder(id);
    }

    //localhost:8080/store/order/get
    @GetMapping("/get")
    public List<String> getEmployees() {
        return basketService.getOrder();
    }


}
