public abstract class Car {
    private String model;           // Название модели
    private int year;               // Год выпуска
    private String color;           // Цвет автомобиля
    private String transmission;    // Коробка передач
    private int price;              // Цена автомобиля
    private String carClass;        // Класс автомобиля

    public Car(String model, int year, String color, String transmission, int price, String carClass) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.transmission = transmission;
        this.price = price;
        this.carClass = carClass;
    }

    // Метод для получения информации об автомобиле
    public String getCarInfo() {
        return "Модель: " + model +
                ", год выпуска: " + year +
                ", цвет автомобиля: " + color +
                ", коробка передач: " + transmission +
                ", цена: " + price + "$" +
                ", класс автомобиля: " + carClass;
    }

    // Метод для вывода информации об автомобилях, выпущенных после 2006 года
    public static void printCarInfoAfter2006(Car cars) {
        Car car = cars;
        if (car.getYear() > 2006) {
            System.out.println(car.getCarInfo());
        } else {
            System.out.println("Устаревший авто: " + car.getCarInfo());
        }
    }

    // Метод для изменения цвета авто на красный, если он зеленый
    public static void changeGreenCarsToRed(Car cars) {
        Car car = cars;
        if (car.getColor().equalsIgnoreCase("Зеленый")) {
            car.changeColor("Красный");
        }
    }

    // Метод для вывода информации о классе автомобиля
    public static void printCarClasses(Car cars) {
        Car car = cars;
        System.out.println("Класс автомобиля: " + cars.getCarClass() + "\n");
    }

    // Метод для изменения цвета автомобиля
    public void changeColor(String newColor) {
        this.color = newColor;
        System.out.println("Цвет автомобиля: " + getModel() + " " + getYear() + " года изменен на: " + newColor);
    }

    public String getColor() {
        return color;
    }

    public int getYear() {

        return year;
    }

    public String getCarClass() {

        return carClass;
    }

    public String getModel(){

        return model;
    }
}

// Классы автомобилей
class Suzuki extends Car {
    public Suzuki(int year, String color, String transmission, int price, String carClass) {
        super("Suzuki", year, color, transmission, price, carClass);
    }
}

class Toyota extends Car {
    public Toyota(int year, String color, String transmission, int price, String carClass) {
        super("Toyota", year, color, transmission, price, carClass);
    }
}

class Honda extends Car {
    public Honda(int year, String color, String transmission, int price, String carClass) {
        super("Honda", year, color, transmission, price, carClass);
    }
}

class Ford extends Car {
    public Ford(int year, String color, String transmission, int price, String carClass) {
        super("Ford", year, color, transmission, price, carClass);
    }
}

class BMW extends Car {
    public BMW(int year, String color, String transmission, int price, String carClass) {
        super("BMW", year, color, transmission , price, carClass);
    }
}
