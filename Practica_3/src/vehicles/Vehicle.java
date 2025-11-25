package vehicles;

public abstract class Vehicle {
    protected String model;
    protected String license;
    protected String color;
    protected int year;
    protected String ownerName;
    protected String insuranceNumber;
    protected String engineType;

    // Конструктор
    public Vehicle(String model, String license, String color, int year, 
                   String ownerName, String insuranceNumber, String engineType) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }

    // Геттеры
    public String getModel() { return model; }
    public String getLicense() { return license; }
    public String getColor() { return color; }
    public int getYear() { return year; }
    public String getOwnerName() { return ownerName; }
    public String getInsuranceNumber() { return insuranceNumber; }
    public String getEngineType() { return engineType; }

    // Сеттеры
    public void setModel(String model) { this.model = model; }
    public void setLicense(String license) { this.license = license; }
    public void setColor(String color) { this.color = color; }
    public void setYear(int year) { this.year = year; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }
    public void setInsuranceNumber(String insuranceNumber) { this.insuranceNumber = insuranceNumber; }
    public void setEngineType(String engineType) { this.engineType = engineType; }

    // Абстрактный метод
    public abstract String vehicleType();

    // Метод toString
    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", license='" + license + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", ownerName='" + ownerName + '\'' +
                ", insuranceNumber='" + insuranceNumber + '\'' +
                ", engineType='" + engineType + '\'' +
                ", type='" + vehicleType() + '\'' +
                '}';
    }
}