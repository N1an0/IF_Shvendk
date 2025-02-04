import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();

        // Добавляем автомобили в список
        cars.add(new Suzuki(2005, "Зеленый", 150000, "SUV"));
        cars.add(new Toyota(2010, "Синий", 180000, "Мини-автомобиль"));
        cars.add(new Honda(2015, "Красный", 200000, "Городской"));
        cars.add(new Ford(2008, "Зеленый", 170000, "Полноразмерный"));
        cars.add(new BMW(2020, "Черный", 400000, "Бизнес"));
        cars.add(new Suzuki(2012, "Белый", 160000, "Среднеразмерный"));
        cars.add(new Toyota(2003, "Зеленый", 140000, "Мини-автомобиль"));
        cars.add(new Honda(2018, "Синий", 220000, "Городской"));
        cars.add(new Ford(2009, "Красный", 175000, "MPV"));
        cars.add(new BMW(2016, "Зеленый", 350000, "Спорткар"));

        // Вызываем методы
        Car.printCarInfoAfter2006(cars);
        Car.changeGreenCarsToRed(cars);
        Car.printCarClasses(cars);
    }
}
