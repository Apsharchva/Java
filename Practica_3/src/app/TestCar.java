package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        // Создание экземпляров классов
        Car car = new Car("Toyota Camry", "ABC123", "Red", 2020, "John Doe", "INS12345");
        ElectricCar electricCar = new ElectricCar("Tesla Model 3", "XYZ789", "White", 2022, "Jane Smith", "INS67890", 75);

        // Вывод исходной информации
        System.out.println("=== Исходная информация ===");
        System.out.println(car.toString());
        System.out.println(electricCar.toString());

        // Изменение года выпуска и имени владельца
        System.out.println("\n=== После изменений года и владельца ===");
        car.setYear(2021);
        car.setOwnerName("Mike Johnson");
        
        electricCar.setYear(2023);
        electricCar.setOwnerName("Sarah Wilson");
        
        System.out.println(car.toString());
        System.out.println(electricCar.toString());

        // Изменение страхового номера
        System.out.println("\n=== После изменения страхового номера ===");
        car.setInsuranceNumber("NEWINS111");
        electricCar.setInsuranceNumber("NEWINS222");
        
        System.out.println(car.toString());
        System.out.println(electricCar.toString());

        // Получение информации о емкости батареи
        System.out.println("\n=== Информация о батарее электромобиля ===");
        System.out.println("Емкость батареи: " + electricCar.getBatteryCapacity() + "kWh");

        // Изменение емкости батареи
        electricCar.setBatteryCapacity(100);
        System.out.println("Новая емкость батареи: " + electricCar.getBatteryCapacity() + "kWh");
        System.out.println(electricCar.toString());
    }
}