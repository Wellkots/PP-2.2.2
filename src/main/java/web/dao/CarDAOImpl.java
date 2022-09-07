package web.dao;
import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarDAOImpl implements CarDAO{

    private static final List<Car> cars = Arrays.asList(
            new Car("Golf", "Blue", 2101),
            new Car("BMV", "White", 325),
            new Car("Mercedes", "Black", 124),
            new Car("Mercedes", "Red", 60),
            new Car("BMW", "Yellow", 720));
    @Override
    public List<Car> carsCount(int count) {
        List<Car> carList;
        if (count < 0) {
            carList = cars.stream().limit(0).collect(Collectors.toList());
        } else {
            carList = cars.stream().limit(count).collect(Collectors.toList());
        }
        return cars;
    }
}
