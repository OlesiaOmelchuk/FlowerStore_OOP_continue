package ua.edu.ucu.apps.demo.flowerStore.flowers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/flower")
public class FlowerController {

    @GetMapping
    public List<Flower> getFlowers(){
        return List.of(
                new Flower(5, FlowerColor.RED, 10, FlowerType.ROSE),
                new Flower(4,FlowerColor.BLUE, 40, FlowerType.TULIP));
    }
}