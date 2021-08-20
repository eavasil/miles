import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Программа расчета бесплатных бонусных миль за перелеты");
        System.out.println("Введите стоимость вашего билета в рублях: ");
        Scanner scanner = new Scanner(System.in);
        int priceFly = (int) scanner.nextDouble();
        System.out.println("Стоимость перелета: " + priceFly);
        int miles = priceFly / 20;
        System.out.println("Начисленные мили за перелет: " + miles);

    }
}