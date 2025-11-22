package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ ИНКАПСУЛЯЦИИ И НАСЛЕДОВАНИЯ ===\n");
        
        // 1. Демонстрация работы с классом Car (инкапсуляция)
        System.out.println("1. РАБОТА С КЛАССОМ CAR (ИНКАПСУЛЯЦИЯ):");
        System.out.println("=========================================");
        
        Car regularCar = new Car("Toyota", "Camry", null, null, 2020, "Gasoline", 0);
        
        // Демонстрация доступа к private полям через геттеры
        System.out.println("Доступ к private полям через геттеры:");
        System.out.println("Бренд: " + regularCar.getBrand());
        System.out.println("Модель: " + regularCar.getModel());
        System.out.println("Владелец: " + regularCar.getOwnerName());
        System.out.println("Тип двигателя: " + regularCar.getEngineType());
        
        // Демонстрация изменения private полей через сеттеры
        System.out.println("\nИзменение private полей через сеттеры:");
        regularCar.setOwnerName("Иван Иванов");
        regularCar.setInsuranceNumber("INS123456");
        regularCar.setPrice(25000.0);
        
        System.out.println("После изменений:");
        System.out.println("Владелец: " + regularCar.getOwnerName());
        System.out.println("Страховой номер: " + regularCar.getInsuranceNumber());
        System.out.println("Цена: " + regularCar.getPrice());
        
        // Попытка прямого доступа к private полям (закомментировано - вызовет ошибку компиляции)
        // regularCar.brand = "Honda"; // Ошибка: brand has private access in Car
        // regularCar.ownerName = "Петр"; // Ошибка: ownerName has private access in Car
        
        System.out.println("\n" + regularCar.toString());
        
        // 2. Демонстрация наследования с классом ElectricCar
        System.out.println("\n\n2. РАБОТА С КЛАССОМ ELECTRICCAR (НАСЛЕДОВАНИЕ):");
        System.out.println("===============================================");
        
        ElectricCar electricCar = new ElectricCar("Tesla", "Model 3", null, null, 2022, 75.0, 0);
        
        // Демонстрация наследования методов и полей
        System.out.println("Унаследованные от Car методы (геттеры):");
        System.out.println("Бренд: " + electricCar.getBrand());
        System.out.println("Модель: " + electricCar.getModel());
        System.out.println("Год: " + electricCar.getYear());
        System.out.println("Тип двигателя: " + electricCar.getEngineType());
        System.out.println("Возраст: " + electricCar.calculateAge() + " лет");
        
        // Демонстрация работы с собственным полем ElectricCar
        System.out.println("\nСобственное поле ElectricCar:");
        System.out.println("Емкость батареи: " + electricCar.getBatteryCapacity() + " кВт·ч");
        System.out.println("Расчетный пробег: " + electricCar.calculateRange() + " км");
        
        // Демонстрация изменения унаследованных полей через сеттеры
        System.out.println("\nИзменение унаследованных полей через сеттеры:");
        electricCar.setOwnerName("Мария Козлова");
        electricCar.setColor("Red");
        electricCar.setPrice(45000.0);
        
        System.out.println("После изменений:");
        System.out.println("Владелец: " + electricCar.getOwnerName());
        System.out.println("Цвет: " + electricCar.getColor());
        System.out.println("Цена: " + electricCar.getPrice());
        
        System.out.println("\n" + electricCar.toString());
        
        // 3. Демонстрация полиморфизма
        System.out.println("\n\n3. ДЕМОНСТРАЦИЯ ПОЛИМОРФИЗМА:");
        System.out.println("============================");
        
        // ElectricCar может быть обработан как Car
        Car carAsVehicle = new ElectricCar("Nissan", "Leaf", null, null, 2021, 40.0, 0);
        
        System.out.println("ElectricCar, обрабатываемый как Car:");
        System.out.println("Бренд: " + carAsVehicle.getBrand());
        System.out.println("Тип двигателя: " + carAsVehicle.getEngineType());
        System.out.println("Возраст: " + carAsVehicle.calculateAge() + " лет");
        
        // Вызов переопределенного метода toString()
        System.out.println("\nРезультат toString() (полиморфизм):");
        System.out.println(carAsVehicle.toString());
        
        // 4. Демонстрация protected доступа
        System.out.println("\n\n4. ДЕМОНСТРАЦИЯ PROTECTED ДОСТУПА:");
        System.out.println("================================");
        
        // Внутри ElectricCar мы имеем прямой доступ к protected полю engineType
        // Это демонстрируется в конструкторе ElectricCar, где мы устанавливаем:
        // this.engineType = "Electric";
        
        System.out.println("Protected поле engineType доступно:");
        System.out.println("- Внутри класса Car");
        System.out.println("- Внутри классов-наследников (ElectricCar)");
        System.out.println("- Внутри классов того же пакета (vehicles)");
        
        // Проверка, что engineType установлен правильно в ElectricCar
        System.out.println("\nТип двигателя electricCar: " + electricCar.getEngineType());
        System.out.println("Тип двигателя regularCar: " + regularCar.getEngineType());
        
        // 5. Сравнение объектов
        System.out.println("\n\n5. СРАВНЕНИЕ ОБЪЕКТОВ:");
        System.out.println("=====================");
        
        System.out.println("Обычный автомобиль:");
        System.out.println(regularCar);
        
        System.out.println("\nЭлектромобиль:");
        System.out.println(electricCar);
        
        System.out.println("\nЭлектромобиль, обрабатываемый как автомобиль:");
        System.out.println(carAsVehicle);
    }
}