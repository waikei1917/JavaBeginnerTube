package com.JavaBeginnerTube;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //T4HelloWorld();
        //T5Variables();
        //T6GetUserInput();
        //T7Calculator();
        //T8MathOperator();
        //T9Increment();
        //T10IfStatement();
        //T11LogicalOperators();
        //T12SwitchStatement();
        //T13WhileLoop();
        T14UsingMultipleClasses();
    }

    public static void T4HelloWorld (){
        System.out.println("Hello World!!!");
    }

    public static void T5Variables (){
        double tuna;
        tuna = 5.28;
        System.out.print("There are ");
        System.out.print(tuna);
        System.out.println(" Moives");

        System.out.print("Apples");
    }

    public static void T6GetUserInput() {
        Scanner fish = new Scanner(System.in);
        System.out.println(fish.nextLine());
    }

    public static void T7Calculator(){
        System.out.println("T7 Tube");

        Scanner fish = new Scanner(System.in);
        double fnum, snum, answer;

        System.out.println("Enter first num: ");
        fnum = fish.nextDouble();
        System.out.println("Enter second num: ");
        snum = fish.nextDouble();

        answer = fnum + snum;
        System.out.println(answer);

    }

    public static void T8MathOperator () {
        int girls, boys, people;
        girls = 6;
        boys = 3;
        people = girls + boys;
        System.out.println(people);
        people = girls - boys;
        System.out.println(people);
        people = girls * boys;
        System.out.println(people);
        people = girls / boys;
        System.out.println(people);

        double girlss, boyss, peoples;
        girlss = 11;
        boyss = 3;
        peoples = girlss / boyss;
        System.out.println(peoples);
        peoples = girlss % boyss;
        System.out.println(peoples);
    }

    public static void T9Increment() {
        int tuna = 5;
        int fish = 18;

        ++tuna;
        System.out.println(tuna);
        System.out.println(++tuna); //Add before print
        System.out.println(tuna++); //Print then add
        System.out.println(tuna);

        tuna = tuna + 10;
        System.out.println(tuna);

        tuna += 10;
        System.out.println(tuna);

        tuna -= 10;
        System.out.println(tuna);

        tuna *= 10;
        System.out.println(tuna);

        tuna /= 10;
        System.out.println(tuna);
    }

    public static void T10IfStatement () {
        System.out.println("Please enter a num: ");
        Scanner fish = new Scanner(System.in);

        int test = fish.nextInt();

        if (test > 10){
            System.out.println("Larger than 10");
        } else if (test <10) {
            System.out.println("Fewer than 10");
        } else {
            System.out.println("Equal 10");
        }
    }

    public static void T11LogicalOperators () {
        System.out.println("Please enter a num: ");
        Scanner fish = new Scanner(System.in);

        int test = fish.nextInt();

        if (test > 10 && test < 20) {
            System.out.println("In range");
        } else if (test < 10 || test > 20) {
            System.out.println("Out range");
        } else {
            System.out.println("10 or 20");
        }
    }

    public static void T12SwitchStatement () {
        System.out.println("Please enter a Level: ");
        Scanner fish = new Scanner(System.in);

        int test = fish.nextInt();

        switch (test) {
            case 1:
                System.out.println("Easy");
                break;
            case 2:
                System.out.println("Normal");
                break;
            case 3:
                System.out.println("Hard");
                break;
            case 4:
                System.out.println("Very Hard");
                break;

                default:
                    System.out.println("Out range");
        }
    }

    public static void T13WhileLoop () {
        int counter = 0;
        while (counter < 20) {
            System.out.println("number: "+ counter);
            counter++;
        }
    }

    public static void T14UsingMultipleClasses () {
        TunaFish tunaFishObject = new TunaFish();
        tunaFishObject.simpleMessage();
    }
}
