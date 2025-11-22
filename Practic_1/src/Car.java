public class Car {
    // Поля класса
    private String model;
    private String license;
    private String color;
    private int year;

    // Конструктор 1: со всеми полями
    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    // Конструктор 2: по умолчанию
    public Car() {
        this.model = "Неизвестно";
        this.license = "A000AA";
        this.color = "Белый";
        this.year = 2020;
    }

    // Конструктор 3: с выбранными полями (model и year)
    public Car(String model, int year) {
        this.model = model;
        this.license = "B111BB";
        this.color = "Черный";
        this.year = year;
    }

    // Метод для вывода информации об автомобиле
    @Override
    public String toString() {
        return String.format(
            "Модель: %s, Номер: %s, Цвет: %s, Год: %d",
            model, license, color, year
        );
    }

    // Демонстрация работы класса
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Camry", "X123AB", "Красный", 2018);
        Car car2 = new Car();
        Car car3 = new Car("BMW X5", 2022);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}