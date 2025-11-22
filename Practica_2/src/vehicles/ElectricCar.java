package vehicles;

public class ElectricCar extends Car {
    private double batteryCapacity; // ёмкость аккумулятора
    
    // Конструкторы
    public ElectricCar() {
        super(); // вызов конструктора родительского класса
        this.batteryCapacity = 0.0;
        this.engineType = "Electric"; // использование protected поля для установки значения
    }
    
    public ElectricCar(String brand, String model, String license, String color, 
                      int year, double price, double batteryCapacity) {
        super(brand, model, license, color, year, "Electric", price);
        this.batteryCapacity = batteryCapacity;
    }
    
    // Переопределение метода vehicleType
    @Override
    public String vehicleType() {
        return "Electric Car";
    }
    
    // Методы для работы с batteryCapacity
    public double getBatteryCapacity() {
        return batteryCapacity;
    }
    
    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    
    // Дополнительный метод для электромобилей
    public double calculateRange() {
        // Предположим, что 1 кВт·ч дает 6 км пробега
        return batteryCapacity * 6;
    }
    
    @Override
    public String toString() {
        return String.format("ElectricCar{brand='%s', model='%s', license='%s', color='%s', year=%d, " +
                           "engineType='%s', price=%.2f, batteryCapacity=%.1f kWh, range=%.1f km, " +
                           "owner='%s', insurance='%s', age=%d, type='%s'}",
                getBrand(), getModel(), getLicense(), getColor(), getYear(), getEngineType(),
                getPrice(), batteryCapacity, calculateRange(), 
                getOwnerName(), getInsuranceNumber(), calculateAge(), vehicleType());
    }
}