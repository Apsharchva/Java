package vehicles;

import java.time.Year;

public abstract class Vehicle {
    // Общие поля для всех транспортных средств
    private String model;
    private String license;
    private String color;
    private int year;
    private String ownerName;
    private String insuranceNumber;
    protected String engineType; // защищённое поле для наследования
    
    // Константа
    private static final int CURRENT_YEAR = Year.now().getValue();
    
    // Конструкторы
    public Vehicle() {
        this.model = "Unknown";
        this.license = "Unknown";
        this.color = "Unknown";
        this.year = CURRENT_YEAR;
        this.ownerName = "Unknown";
        this.insuranceNumber = "Unknown";
        this.engineType = "Unknown";
    }
    
    public Vehicle(String model, String license, String color, int year, String engineType) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = "Unknown";
        this.insuranceNumber = "Unknown";
        this.engineType = engineType;
    }
    
    // Абстрактный метод для возврата типа транспортного средства
    public abstract String vehicleType();
    
    // Геттеры и сеттеры
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    
    public String getLicense() { return license; }
    public void setLicense(String license) { this.license = license; }
    
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    
    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }
    
    public String getInsuranceNumber() { return insuranceNumber; }
    public void setInsuranceNumber(String insuranceNumber) { this.insuranceNumber = insuranceNumber; }
    
    public String getEngineType() { return engineType; }
    public void setEngineType(String engineType) { this.engineType = engineType; }
    
    public static int getCurrentYear() { return CURRENT_YEAR; }
    
    // Метод для вычисления возраста
    public int calculateAge() {
        return CURRENT_YEAR - year;
    }
    
    @Override
    public String toString() {
        return String.format("Vehicle{model='%s', license='%s', color='%s', year=%d, " +
                           "ownerName='%s', insuranceNumber='%s', engineType='%s', age=%d, type='%s'}",
                model, license, color, year, ownerName, insuranceNumber, engineType, 
                calculateAge(), vehicleType());
    }
}