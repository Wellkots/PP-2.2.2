package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;


import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

	private final CarService service;

	public CarController(CarService service) {
		this.service = service;
	}
	@GetMapping(value = "/car")
	public String Page(@RequestParam(name = "count", defaultValue = "5") int count, ModelMap model) {
		List<Car> carList = service.countCars(count);

		System.out.println(carList);
		model.addAttribute("carList", carList);
		return "car";
	}
}

