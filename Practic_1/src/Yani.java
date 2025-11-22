import java.util.Scanner;

public class Yani {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        Scanner scanner = new Scanner(System.in);
        
        // Шаг 1: Получить сумму в юанях
        System.out.print("Введите сумму в китайских юанях: ");
        int yuan = scanner.nextInt();
        
        // Шаг 2: Конвертировать в рубли
        double roubles = ROUBLES_PER_YUAN * yuan;
        
        // Шаг 3: Округлить в пользу покупателя (вниз до 2 знаков)
        roubles = Math.floor(roubles * 100) / 100.0;
        
        // Шаг 4: Определить правильное окончание для юаней
        String yuanEnding;
        int lastDigit = yuan % 10;
        int lastTwoDigits = yuan % 100;
        
        // Проверка для чисел 11-14 (исключения)
        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            yuanEnding = "юаней";
        } else {
            switch (lastDigit) {
                case 1:
                    yuanEnding = "юань";
                    break;
                case 2:
                case 3:
                case 4:
                    yuanEnding = "юаня";
                    break;
                default:
                    yuanEnding = "юаней";
                    break;
            }
        }
        
        // Шаг 5: Определить правильное окончание для рублей
        String roubleEnding;
        int roublesInt = (int) Math.floor(roubles);
        int roubleLastDigit = roublesInt % 10;
        int roubleLastTwoDigits = roublesInt % 100;
        
        // Проверка для чисел 11-14 (исключения)
        if (roubleLastTwoDigits >= 11 && roubleLastTwoDigits <= 14) {
            roubleEnding = "рублей";
        } else {
            switch (roubleLastDigit) {
                case 1:
                    roubleEnding = "рубль";
                    break;
                case 2:
                case 3:
                case 4:
                    roubleEnding = "рубля";
                    break;
                default:
                    roubleEnding = "рублей";
                    break;
            }
        }
        
        // Шаг 6: Вывести результат с правильными окончаниями
        System.out.printf("%d китайских %s = %.2f российских %s%n", 
                         yuan, yuanEnding, roubles, roubleEnding);
    }
}