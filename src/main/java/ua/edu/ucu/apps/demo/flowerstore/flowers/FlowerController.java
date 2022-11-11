package ua.edu.ucu.apps.demo.flowerstore.flowers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/flower")
public class FlowerController {

    @GetMapping
    public List<Flower> getFlowers() {
        int length = 4, price = 10;
        return List.of(
                new Flower(length, FlowerColor.RED, price, FlowerType.ROSE),
                new Flower(length, FlowerColor.BLUE, price, FlowerType.TULIP));
    }
}