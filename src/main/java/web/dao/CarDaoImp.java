package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{
    private static int carsCount;
    private List<Car> carsList;

    {
        carsList = new ArrayList<>();

        carsList.add(new Car(++carsCount,"BMW","M5"));
        carsList.add(new Car(++carsCount,"MERCEDES","E200"));
        carsList.add(new Car(++carsCount,"AUDI","Q5"));
        carsList.add(new Car(++carsCount,"SKODA","KODIAQ"));
        carsList.add(new Car(++carsCount,"PORSCHE","911"));
    }

    @Override
    public List<Car> getCarsList(int count) {
        return carsList.stream().limit(count >=0 && count <=5 ? count : Integer.MAX_VALUE).toList();
    }
}
