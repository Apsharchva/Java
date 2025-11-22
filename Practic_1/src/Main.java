import java.time.Year;

// Класс Car
class Car {
    // Поля класса
    private String brand;
    private String model;
    private int year;
    private double price;
    private String color;
    
    // Константа - текущий год
    private static final int CURRENT_YEAR = Year.now().getValue();
    
    // Конструкторы
    
    // 1. Конструктор по умолчанию
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = CURRENT_YEAR;
        this.price = 0.0;
        this.color = "Unknown";
    }
    
    // 2. Конструктор с основными параметрами
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = 0.0;
        this.color = "Unknown";
    }
    
    // 3. Конструктор со всеми параметрами
    public Car(String brand, String model, int year, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }
    
    // 4. Конструктор копирования
    public Car(Car other) {
        this.brand = other.brand;
        this.model = other.model;
        this.year = other.year;
        this.price = other.price;
        this.color = other.color;
    }
    
    // Метод To_String() для вывода значений полей
    @Override
    public String toString() {
        return String.format("Car{brand='%s', model='%s', year=%d, price=%.2f, color='%s', age=%d years}",
                brand, model, year, price, color, calculateAge());
    }
    
    // Геттеры (методы получения значений)
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
    
    public String getColor() {
        return color;
    }
    
    public static int getCurrentYear() {
        return CURRENT_YEAR;
    }
    
    // Сеттеры (методы установки значений)
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    // Метод для вычисления возраста автомобиля
    public int calculateAge() {
        return CURRENT_YEAR - year;
    }
    
    // Дополнительный метод для вычисления возраста относительно указанного года
    public int calculateAge(int referenceYear) {
        return referenceYear - year;
    }
}

// Главный класс Main для тестирования
public class Main {
    public static void main(String[] args) {
        // Создание объектов с использованием различных конструкторов
        
        // 1. Объект с конструктором по умолчанию
        Car car1 = new Car();
        System.out.println("Car1 (конструктор по умолчанию):");
        System.out.println(car1.toString());
        System.out.println();
        
        // 2. Объект с конструктором с основными параметрами
        Car car2 = new Car("Toyota", "Camry", 2020);
        System.out.println("Car2 (основные параметры):");
        System.out.println(car2.toString());
        System.out.println();
        
        // 3. Объект с конструктором со всеми параметрами
        Car car3 = new Car("BMW", "X5", 2018, 45000.0, "Black");
        System.out.println("Car3 (все параметры):");
        System.out.println(car3.toString());
        System.out.println();
        
        // 4. Объект с конструктором копирования
        Car car4 = new Car(car3);
        System.out.println("Car4 (конструктор копирования car3):");
        System.out.println(car4.toString());
        System.out.println();
        
        // Тестирование геттеров и сеттеров
        System.out.println("=== Тестирование геттеров и сеттеров ===");
        System.out.println("До изменения:");
        System.out.println("car2 цвет: " + car2.getColor());
        System.out.println("car2 цена: " + car2.getPrice());
        
        // Использование сеттеров для изменения значений
        car2.setColor("Red");
        car2.setPrice(25000.0);
        
        System.out.println("После изменения:");
        System.out.println("car2 цвет: " + car2.getColor());
        System.out.println("car2 цена: " + car2.getPrice());
        System.out.println();
        
        // Тестирование метода calculateAge()
        System.out.println("=== Тестирование метода calculateAge() ===");
        System.out.println("Возраст car1: " + car1.calculateAge() + " лет");
        System.out.println("Возраст car2: " + car2.calculateAge() + " лет");
        System.out.println("Возраст car3: " + car3.calculateAge() + " лет");
        System.out.println("Возраст car4: " + car4.calculateAge() + " лет");
        System.out.println();
        
        // Тестирование перегруженного метода calculateAge с параметром
        System.out.println("Возраст car3 в 2025 году: " + car3.calculateAge(2025) + " лет");
        
        // Демонстрация работы всех объектов после изменений
        System.out.println("\n=== Финальное состояние всех объектов ===");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
    }
}