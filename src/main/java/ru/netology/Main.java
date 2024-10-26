package ru.netology;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        ArrayList<Integer> list = new ArrayList<>();
        logger.log("Запускаем программу");
        logger.log("Здравствуйте! Введите размер списка: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        logger.log("Введите верхнюю границу для значений: ");
        int number2 = Integer.parseInt(scanner.nextLine());
        logger.log("Создаем и наполняем список");
        Random random = new Random();
        for (int i = 0; i < number1; i++) {
            list.add(random.nextInt(number2));
        }
        System.out.println("Вот случайный список: " +  list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int number3 = Integer.parseInt(scanner.nextLine());
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(number3);
        ArrayList<Integer> result = new ArrayList<>(filter.filterOut(list));
        System.out.println("Отфильтрованный список: " + result);
        logger.log("Завершаем программу");


    }


}
