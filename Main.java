package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        guessNumber();
    }
    private static void guessNumber() {
        Scanner scanner = new Scanner(System.in);
        do {
            int numComp = (int)(Math.random()*10);
            System.out.println("Угдай число от 0 до 9. У тебя три попытки.");
            for (int i = 3; i > 0; i--) {
                System.out.println("Введи свой ответ: (для выхода из игры, нажми Enter)");
                int questionNum = scanner.nextInt(); //try не будем ставить, так как еще не узучали :)
                if (questionNum == numComp) {
                    System.out.println("Ты угадал число, молодец!");
                    break;
                }
                System.out.println(questionNum > numComp ? "Введенное число больше " : "Введенное число меньше ");
                System.out.println((i-1) > 0 ? " У тебя осталось " + (i-1) + " попыток." : "Попытки закончились, ты проиграл.");
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
        }
        while (scanner.nextInt() == 1);
    }
}
