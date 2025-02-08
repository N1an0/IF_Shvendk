import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();

        // Добавляем автомобили в список
        cars.add(new Suzuki(2005, "Зеленый", "Механика" ,150000, "SUV"));
        cars.add(new Toyota(2010, "Синий", "Автомат" ,180000, "Мини-автомобиль"));
        cars.add(new Honda(2015, "Красный", "Автомат" ,200000, "Городской"));
        cars.add(new Ford(2008, "Зеленый", "Механика" ,170000, "Полноразмерный"));
        cars.add(new BMW(2020, "Черный", "Автомат" ,400000, "Бизнес"));
        cars.add(new Suzuki(2012, "Белый", "Автомат" ,160000, "Среднеразмерный"));
        cars.add(new Toyota(2003, "Зеленый", "Механика" ,140000, "Мини-автомобиль"));
        cars.add(new Honda(2018, "Синий", "Автомат" ,220000, "Городской"));
        cars.add(new Ford(2009, "Красный", "Механика" ,175000, "MPV"));
        cars.add(new BMW(2016, "Зеленый", "Автомат" ,350000, "Спорткар"));

        for (Car car : cars) {
            Car.printCarInfoAfter2006(car);
            Car.changeGreenCarsToRed(car);
            Car.printCarClasses(car);
        }
    }
}
