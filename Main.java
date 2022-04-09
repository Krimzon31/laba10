package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строчку");
        String str1 = in.nextLine();
        System.out.println("Введите вторую строчку");
        String str2 = in.nextLine();
        boolean b1 = str1.endsWith(str2);
        if (b1){
            System.out.println("Всё верно, вторая строка конец первой");
        }
        else{
            System.out.println("Нет, вторая строка не конец первой");
        }
    }
}
