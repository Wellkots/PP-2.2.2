package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiceImpl implements CarService {
    private CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {

        this.carDAO = carDAO;
    }
    @Override
    public List<Car> countCars(int count) {

        return carDAO.carsCount(count);
    }
}

