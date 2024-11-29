import java.util.Arrays;
import java.util.Comparator;

public class CarSortingExample {
    // Клас автомобіля
    static class Car {
        private String brand;
        private String model;
        private int year;
        private double price;
        private int mileage;

        // Конструктор
        public Car(String brand, String model, int year, double price, int mileage) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.price = price;
            this.mileage = mileage;
        }
        // Геттери
        public String getBrand() {
            return brand;
        }
        public String getModel() {
            return model;
        }
        public int getYear() {
            return year;
        }
        public double getPrice() {
            return price;
        }
        public int getMileage() {
            return mileage;
        }
        // Перевизначення методу toString для зручного виводу
        @Override
        public String toString() {
            return "Car{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", year=" + year +
                    ", price=" + price +
                    ", mileage=" + mileage +
                    '}';
        }

        // Перевизначення equals для пошуку
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Car car = (Car) obj;
            return year == car.year &&
                    Double.compare(car.price, price) == 0 &&
                    mileage == car.mileage &&
                    brand.equals(car.brand) &&
                    model.equals(car.model);
        }
    }

    // Виконавчий метод
    public static void main(String[] args) {
        // Створення масиву об'єктів
        Car[] cars = {
                new Car("Toyota", "Camry", 2020, 25000, 30000),
                new Car("Honda", "Civic", 2018, 20000, 45000),
                new Car("Ford", "Focus", 2019, 18000, 35000),
                new Car("BMW", "X5", 2021, 50000, 15000),
                new Car("Audi", "A4", 2020, 30000, 20000),
                new Car("Nissan", "Altima", 2020, 25000, 35000)  // Додано автомобіль з тією ж ціною
        };

        // Сортування масиву:
        // 1. За ціною (price) — за зростанням.
        // 2. За пробігом (mileage) — за спаданням.
        Arrays.sort(cars, Comparator
                .comparingDouble(Car::getPrice)           // Сортування за ціною за зростанням
                .thenComparing(Comparator.comparingInt(Car::getMileage).reversed())); // Сортування за пробігом за спаданням

        // Виведення відсортованого масиву
        System.out.println("Відсортований масив:");
        for (Car car : cars) {
            System.out.println(car);
        }

        // Пошук автомобіля, ідентичного заданому
        Car targetCar = new Car("Honda", "Civic", 2018, 20000, 45000);
        int index = Arrays.asList(cars).indexOf(targetCar);

        // Результат пошуку
        if (index != -1) {
            System.out.println("Знайдено автомобіль: " + cars[index]);
        } else {
            System.out.println("Автомобіль не знайдено.");
        }
    }
}
