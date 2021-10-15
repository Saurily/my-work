package com.pb.harashchenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше число = " );
        a =in.nextInt();
        if ((0 <= a) && (a<=14)){
            System.out.print("Диапазон '['0'-'14']'");
        }
        else if ((15 <= a) && (a<=35)){
            System.out.print("Диапазон '['15'-'35']'");
        }
        else if ((36 <= a) && (a<=50)){
            System.out.print("Диапазон '['36'-'50']'");
        }
        else if ((51 <= a) && (a<=100)){
            System.out.print("Диапазон '['51'-'100']'");
        }
        else{
            System.out.print("Не попадает не в один диапазон");
        }
    }
}
