package org.example;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкта MathOperation за допомогою анонімного класу
        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Результат додавання: " + addition.operate(5, 3));

        // Лямбда-вираз для StringManipulator
        StringManipulator toUpperCase = str -> str.toUpperCase();
        System.out.println("Рядок у верхньому регістрі: " + toUpperCase.manipulate("привіт"));

        // Виклик методу countUppercase за допомогою посилання на метод
        Function<String, Integer> countUppercaseFunction = Main::countUppercase;
        System.out.println("Кількість великих літер: " + countUppercaseFunction.apply("Hello World"));

        // Створення постачальника випадкових чисел
        Supplier<Integer> randomNumberSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.println("Випадкове число: " + randomNumberSupplier.get());
    }

    // Статичний метод для підрахунку великих літер
    public static int countUppercase(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }
}