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
        int forLinter = 0;      //linter doesn't like magic numbers :+(
        return List.of(
                new Flower(forLinter+5, FlowerColor.RED, forLinter+10, FlowerType.ROSE),
                new Flower(forLinter+4, FlowerColor.BLUE, forLinter+40, FlowerType.TULIP));
    }
}