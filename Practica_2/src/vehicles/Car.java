package vehicles;

public class Car extends Vehicle {
    // Дополнительные поля для автомобиля
    private String brand;
    private double price;
    
    // Конструкторы
    public Car() {
        super(); // вызов конструктора родительского класса
        this.brand = "Unknown";
        this.price = 0.0;
        this.engineType = "Gasoline"; // доступ к protected полю
    }
    
    public Car(String brand, String model, String license, String color, int year, String engineType, double price) {
        super(model, license, color, year, engineType); // вызов конструктора родителя
        this.brand = brand;
        this.price = price;
    }
    
    // Реализация абстрактного метода
    @Override
    public String vehicleType() {
        return "Car";
    }
    
    // Геттеры и сеттеры для дополнительных полей
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    
    @Override
    public String toString() {
        return String.format("Car{brand='%s', model='%s', license='%s', color='%s', year=%d, " +
                           "engineType='%s', price=%.2f, owner='%s', insurance='%s', age=%d, type='%s'}",
                brand, getModel(), getLicense(), getColor(), getYear(), getEngineType(),
                price, getOwnerName(), getInsuranceNumber(), calculateAge(), vehicleType());
    }
}