package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Напишите как заканчивается строчка: Кто не сажал дерева, тому не лежать в...");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String line = "Кто не сажал дерева, тому не лежать в тени";
        boolean b1 = line.endsWith(str);
        if (b1){
            System.out.println("Всё верно, полностью пословица звучит так: \nКто не сажал дерева, тому не лежать в тени");
        }
        else{
            System.out.println("Вы ошиблись попробуйте ещё раз");
        }
    }
}
