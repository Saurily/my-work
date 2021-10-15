package com.pb.harashchenko.hw2;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int operand1, operand2;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите операнд1 = " );
        operand1=in.nextInt();
        System.out.print("Введите операнд1 = " );
        operand2=in.nextInt();
        System.out.print("Выберете арифметическую операцию '+', '-' , '*', '/' = " );
        char symbol = in.next().charAt(0);
        int result;
        switch (symbol) {
            case '+':
                System.out.print("Ответ: " + (result=operand1+operand2));
                break;
            case '-':
                System.out.print("Ответ: " + (result=operand1-operand2));
                break;
            case '*':
                System.out.print("Ответ: " + (result=operand1*operand2));
                break;
            case '/':
                if (operand1 != 0)
                    System.out.print("Ответ: " + (result=operand1/operand2));
                else {
                    System.out.print("Ошибка: На ноль делить нельзя!");
                }

                break;
        }

        }
    }

