package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите операнд: ");
        int a = in.nextInt();
        System.out.println("Введите модуль: ");
        int c_module = in.nextInt();
        if (nod(a, c_module) == 1) {
            for(int i = 2; i < c_module; i++){
                if(((a * i) % c_module) == 1){
                    System.out.println(i);
                    break;
                }
            }
        }
        else {
            System.out.println("Error");
        }
        }

    public static int nod(int num_1, int num_2){
        while (num_1 != num_2){
            if (num_1 > num_2){
                num_1 = num_1 - num_2;
            }
            else {
                num_2 = num_2 - num_1;
            }
        }
        return num_1;
    }
}

