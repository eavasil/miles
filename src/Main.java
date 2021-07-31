import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws Exception {
               System.out.println("Программа расчета бесплатных бонусных миль за перелеты");
               System.out.println("Введите стоимость вашего билета в рублях: ");
               Scanner scanner = new Scanner(System.in);
               int price_fly = (int) scanner.nextDouble();
               System.out.println("Сумма перевода: " + price_fly);
               int miles = price_fly / 20;
               System.out.println("Начисленные мили за перелет: " + miles);

        }
    }