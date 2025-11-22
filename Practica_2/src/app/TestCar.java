package app;

import vehicles.Vehicle;
import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРОВАНИЕ КЛАССОВ ТРАНСПОРТНЫХ СРЕДСТВ ===\n");
        
        // 1. Демонстрация полиморфизма - работа с объектами через ссылки на родительские классы
        System.out.println("1. ПОЛИМОРФИЗМ - РАБОТА ЧЕРЕЗ ССЫЛКИ НА Vehicle:");
        System.out.println("=================================================");
        
        // Создание объектов через ссылки на родительский класс Vehicle
        Vehicle vehicle1 = new Car("Toyota", "Camry", "A123BC", "Black", 2020, "Gasoline", 25000.0);
        Vehicle vehicle2 = new ElectricCar("Tesla", "Model 3", "E456TS", "Red", 2022, 45000.0, 75.0);
        
        // Вызов методов через ссылки на Vehicle (полиморфизм)
        displayVehicleInfo(vehicle1);
        displayVehicleInfo(vehicle2);
        
        // 2. Демонстрация работы с классом Car
        System.out.println("\n\n2. РАБОТА С КЛАССОМ CAR:");
        System.out.println("=======================");
        
        Car car = new Car("BMW", "X5", "B789MW", "White", 2018, "Diesel", 60000.0);
        
        // Изменение свойств с помощью сеттеров (инкапсуляция)
        System.out.println("До изменений:");
        System.out.println(car.toString());
        
        car.setOwnerName("Иван Иванов");
        car.setInsuranceNumber("INS123456789");
        car.setPrice(55000.0);
        car.setColor("Blue");
        
        System.out.println("\nПосле изменений:");
        System.out.println(car.toString());
        
        // 3. Демонстрация работы с классом ElectricCar
        System.out.println("\n\n3. РАБОТА С КЛАССОМ ELECTRICCAR:");
        System.out.println("===============================");
        
        ElectricCar electricCar = new ElectricCar("Nissan", "Leaf", "N321LF", "Green", 2021, 32000.0, 40.0);
        
        // Изменение свойств с помощью сеттеров (инкапсуляция)
        System.out.println("До изменений:");
        System.out.println(electricCar.toString());
        
        electricCar.setOwnerName("Мария Петрова");
        electricCar.setInsuranceNumber("INS987654321");
        electricCar.setBatteryCapacity(62.0); // увеличение ёмкости батареи
        electricCar.setPrice(30000.0);
        
        System.out.println("\nПосле изменений:");
        System.out.println(electricCar.toString());
        
        // 4. Демонстрация protected поля engineType
        System.out.println("\n\n4. ДЕМОНСТРАЦИЯ PROTECTED ПОЛЯ engineType:");
        System.out.println("========================================");
        
        System.out.println("Тип двигателя Car: " + car.getEngineType());
        System.out.println("Тип двигателя ElectricCar: " + electricCar.getEngineType());
        System.out.println("Тип двигателя Vehicle1 (Car): " + vehicle1.getEngineType());
        System.out.println("Тип двигателя Vehicle2 (ElectricCar): " + vehicle2.getEngineType());
        
        // 5. Демонстрация инкапсуляции - доступ только через геттеры/сеттеры
        System.out.println("\n\n5. ДЕМОНСТРАЦИЯ ИНКАПСУЛЯЦИИ:");
        System.out.println("============================");
        
        // Все поля доступны только через методы
        System.out.println("Все поля защищены и доступны через геттеры/сеттеры:");
        System.out.println("Модель Car: " + car.getModel());
        System.out.println("Владелец ElectricCar: " + electricCar.getOwnerName());
        System.out.println("Ёмкость батареи: " + electricCar.getBatteryCapacity() + " кВт·ч");
        
        // Попытка прямого доступа к полям вызовет ошибку компиляции:
        // car.model = "New Model"; // Ошибка: model has private access in Vehicle
        // electricCar.batteryCapacity = 100.0; // Ошибка: batteryCapacity has private access in ElectricCar
        
        // 6. Демонстрация полиморфизма в массиве
        System.out.println("\n\n6. ПОЛИМОРФИЗМ В МАССИВЕ:");
        System.out.println("========================");
        
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("Honda", "Civic", "H111CV", "Gray", 2019, "Gasoline", 22000.0);
        vehicles[1] = new ElectricCar("Hyundai", "Kona Electric", "E222KN", "Blue", 2023, 35000.0, 64.0);
        vehicles[2] = new Car("Audi", "A4", "A333UD", "Silver", 2020, "Gasoline", 40000.0);
        vehicles[3] = new ElectricCar("Ford", "Mustang Mach-E", "E444FM", "Yellow", 2022, 50000.0, 88.0);
        
        // Установка владельцев
        vehicles[0].setOwnerName("Алексей Смирнов");
        vehicles[1].setOwnerName("Ольга Ковалева");
        vehicles[2].setOwnerName("Дмитрий Попов");
        vehicles[3].setOwnerName("Екатерина Новикова");
        
        System.out.println("Все транспортные средства в массиве:");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println((i + 1) + ". " + vehicles[i].toString());
        }
        
        // 7. Демонстрация абстрактного метода vehicleType()
        System.out.println("\n\n7. ДЕМОНСТРАЦИЯ АБСТРАКТНОГО МЕТОДА vehicleType():");
        System.out.println("=================================================");
        
        for (Vehicle vehicle : vehicles) {
            System.out.println("Тип транспортного средства: " + vehicle.vehicleType());
        }
    }
    
    // Метод для демонстрации полиморфизма - принимает любой Vehicle
    public static void displayVehicleInfo(Vehicle vehicle) {
        System.out.println("\n--- Информация о транспортном средстве ---");
        System.out.println("Тип: " + vehicle.vehicleType());
        System.out.println("Модель: " + vehicle.getModel());
        System.out.println("Год: " + vehicle.getYear());
        System.out.println("Двигатель: " + vehicle.getEngineType());
        System.out.println("Возраст: " + vehicle.calculateAge() + " лет");
        System.out.println("Владелец: " + vehicle.getOwnerName());
        
        // Проверка типа для вывода специфичной информации
        if (vehicle instanceof ElectricCar) {
            ElectricCar ec = (ElectricCar) vehicle;
            System.out.println("Ёмкость батареи: " + ec.getBatteryCapacity() + " кВт·ч");
            System.out.println("Пробег: " + ec.calculateRange() + " км");
        } else if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            System.out.println("Бренд: " + car.getBrand());
            System.out.println("Цена: " + car.getPrice() + " руб.");
        }
    }
}