package web.dao;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
@Service
public interface CarDAO {

    List<Car> carsCount(int count);



}

