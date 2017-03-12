package com.JavaBeginnerTube;

import java.util.Scanner;
import java.util.StringJoiner;
import java.util.Random;

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
        //T14UsingMultipleClasses();
        //T15MethodWithParameters();
        //T16ManyMethodsAndInstances();
        //T17Constructors();
        //T18NestedIfStatement();
        //T19ElseIfStatement();
        //T20ConditionalOperators();
        //T21SimpleAveragingProgram();
        //T22ForLoop();
        //T23CompoundInterestProgram();
        //T24DoWhileLoops();
        //T25MathClassMethods();
        //T26RandomNumberGenerator();
        //T27IntroductionToArrays();
        //T28CreatingArrayTable();
        //T29SummingElementsArrays();
        //T30ArrayElementsAsCounters();
        //T31EnhancedForLoop();
        //T32ArraysInMethods();
        //T33MultidimensionalArrays();
        //T34TableForMultiArrays();
        //T35VariableLengthArguments();
        //T36TimeClass();
        //T37DisplayRegularTime();
        //T42ToString();
        T43Composition();
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

    public static void T15MethodWithParameters () {
        System.out.println("Please enter a your name: ");
        Scanner fish = new Scanner(System.in);
        String name = fish.nextLine();

        TunaFish tunaFishObject = new TunaFish();
        tunaFishObject.simpleHelloMessage(name);
    }

    public static void T16ManyMethodsAndInstances () {
        System.out.println("Please enter the name: ");
        Scanner fish = new Scanner(System.in);
        String name = fish.nextLine();

        TunaFish tunaFishObject = new TunaFish();
        tunaFishObject.setName(name);
        tunaFishObject.saying();

    }

    public static void T17Constructors () {
        TunaFish tunaFishObject = new TunaFish("Joe");
        tunaFishObject.saying();
    }

    public static void T18NestedIfStatement () {
        Scanner fish = new Scanner(System.in);
        int theAge = fish.nextInt();

        if (theAge < 50) {
            System.out.println("You are so young!");
        } else {
            System.out.println("You are old");
            if (theAge > 75) {
                System.out.println("You are REALLY old");
            } else  {
                System.out.println("You are not that old");
            }
        }
    }

    public static void T19ElseIfStatement () {
        Scanner fish = new Scanner(System.in);
        int theAge = fish.nextInt();

        if (theAge >= 60){
            System.out.println("You are a senior citizen!");
        } else if (theAge >= 50) {
            System.out.println("You are in your 50s!");
        } else if (theAge >= 40) {
            System.out.println("You are in your 40s!");
        } else {
            System.out.println("You are young buck");
        }
    }

    public static void T20ConditionalOperators () {
        Scanner fish = new Scanner(System.in);
        int theAge = fish.nextInt();

        System.out.println(theAge > 50 ? "You are old":"You are young");
    }

    public static void T21SimpleAveragingProgram () {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int grade;
        int average;
        int counter = 0;

        while (counter < 10) {
            grade = input.nextInt();
            total = total + grade;
            counter++;
        }

        average = total/10;
        System.out.println("The average is " + average);
    }

    public static void T22ForLoop () {
        for (int counter=1;counter<=10;counter++) {
            System.out.println(counter);
        }
        for (int counter=1;counter<=78;counter+=3) {
            System.out.println(counter);
        }
    }

    public static void T23CompoundInterestProgram () {
        //A=P(1+R)^n
        double amount;
        double principal = 10000;
        double rate = 0.01;

        for(int day = 1; day<=20; day++) {
            amount = principal*Math.pow(1+rate,day);
            System.out.println(day + "  " + amount);
        }
    }

    public static void T24DoWhileLoops () {
        int counter = 0;
        do {
            System.out.println(counter);
            counter++;
        }while (counter <= 10);
    }

    public static void T25MathClassMethods () {
        System.out.println("Abs: " + Math.abs(26));
        System.out.println("Abs: " + Math.abs(-26));
        System.out.println("Ceil: " + Math.ceil(7.4));
        System.out.println("Floor: " + Math.floor(7.4));
        System.out.println("Max: " + Math.max(8.6,5.2));
        System.out.println("Min: " + Math.min(8.6,5.2));
        System.out.println("Pow: " + Math.pow(5,3));
        System.out.println("Sqrt: " + Math.sqrt(9));
    }

    public static void T26RandomNumberGenerator() {
        Random dice = new Random();
        int number;

        for (int counter=1; counter<=10; counter++) {
            number = 1 + dice.nextInt(6);
            System.out.println(number + " ");
        }
    }

    public static void T27IntroductionToArrays () {
        int size = 10;
        int fish[] = new int[size];
        Random dice = new Random();

        for(int counter = 0; counter < size; counter++){
            fish[counter] = dice.nextInt(100);
        }

        for (int counter = 0; counter < size; counter++) {
            System.out.println(fish[counter]);
        }

        int fish2[] = {1,2,3,4,5};
        System.out.println(fish2[2]);
    }

    public static void T28CreatingArrayTable() {
        System.out.println("Index\tValue");
        int fish[] = {1,2,3,4,5,6,7,7,8,9,7,4,4,4,18};

        for (int counter = 0;counter < fish.length; counter++){
            System.out.println(counter + "\t" + fish[counter]);
        }
    }

    public static void T29SummingElementsArrays () {
        int fish[] = RandomArray(50);
        int sum = 0;

        for (int counter=0; counter<fish.length; counter++) {
            System.out.println(fish[counter]);
            sum += fish[counter];
        }
        System.out.println("The sum is: " + sum);
    }

    public static void T30ArrayElementsAsCounters () {
        Random rand = new Random();
        int freq[] = new int[7];

        for(int roll=1; roll<5000; roll++) {
            ++freq[1+rand.nextInt(6)];
        }

        System.out.println("Face\tFrequency");

        for(int face=1; face<freq.length; face++) {
            System.out.println(face + "\t" + freq[face]);
        }
    }

    public static void T31EnhancedForLoop () {
        int fish[] = RandomArray(6);
        int total = 0;

        for (int x:fish) {
            System.out.println(x);
            total += x;
        }
        System.out.println("Total: " + total);
    }

    public static void T32ArraysInMethods (){
        int fish[] = {1,2,3,4,5,6};
        change(fish);

        for (int y:fish) {
            System.out.println(y);
        }
    }
    public static void change(int x[]){
        for (int counter=0; counter<x.length; counter++){
            x[counter]+=5;
        }
    }

    public static void T33MultidimensionalArrays () {
        int firstArray[][] = {{8,9,10,11},{12,13,14,15}};
        int secondArray[][]={{30,31,32,33},{43},{4,5,6}};
    }

    public static void T34TableForMultiArrays () {
        int firstArray[][] = {{8,9,10,11},{12,13,14,15}};
        int secondArray[][]={{30,31,32,33},{43},{4,5,6}};

        System.out.println("The first Array:");
        displayTwoDArrays(firstArray);

        System.out.println("The second Array:");
        displayTwoDArrays(secondArray);
    }
    public static void displayTwoDArrays(int x[][]) {
        for (int row=0; row<x.length; row++) {
            for(int column=0; column<x[row].length; column++) {
                System.out.print(x[row][column]+"\t");
            }
            System.out.println();
        }
    }

    public static void T35VariableLengthArguments () {
        System.out.println(average(1,2,4,88,3,32,3,456,45,45,6,6,4,3,5,57,8,7,9,56,5));
    }
    public static int average(int...numbers) {
        int total = 0;
        for(int x:numbers) {
            total+=x;
        }
        return total/numbers.length;
    }

    public static void T36TimeClass () {
        FishTime tunaTime = new FishTime();
        System.out.println(tunaTime.toMill());
        tunaTime.setTime(12,25,30);
        System.out.println(tunaTime.toMill());
    }

    public static void T37DisplayRegularTime () {
        FishTime tunaTime = new FishTime();

        System.out.println(tunaTime.toMill());
        System.out.println(tunaTime.toString());

        tunaTime.setTime(18,25,30);
        System.out.println(tunaTime.toMill());
        System.out.println(tunaTime.toString());
    }

    public static void T42ToString () {
        potpie potObject = new potpie(4,5,6);
        System.out.println(potObject.toString());
    }

    public static void T43Composition () {
        potpie potObject = new potpie(4,5,6);
        TunaPersonal tunaPersonalObject = new TunaPersonal("Tom", potObject);
        System.out.println(tunaPersonalObject);
    }

    public static int[] RandomArray(int size) {
        int fish[] = new int[size];
        Random dice = new Random();
        for(int counter = 0; counter < size; counter++){
            fish[counter] = dice.nextInt(1000);
        }
        return fish;
    }

}
