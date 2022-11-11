package ua.edu.ucu.apps.demo.flowerStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.demo.flowerStore.flowers.Flower;
import ua.edu.ucu.apps.demo.flowerStore.flowers.FlowerColor;
import ua.edu.ucu.apps.demo.flowerStore.flowers.FlowerType;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public String say_hello(){
		return "hello";
	}

}
