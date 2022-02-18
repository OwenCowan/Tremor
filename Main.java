package com.OWEN;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Vibration Levels
        Scanner vibration = new Scanner(System.in);
        int v = 0;
        System.out.println("Vibration Levels In DB: ");
        if (vibration.hasNextInt()) v = vibration.nextInt();


        //Direction
        Scanner direction = new Scanner(System.in);
        int d = 0;
        System.out.println("Vibration Direction 1 = Right 2 = Left: ");
        if (direction.hasNextInt()) d = direction.nextInt();


        System.out.println("The Reaction Would Be");

        System.out.print(v + "DB");
        if (d == 2) System.out.print("  Right");
        if (d == 1) System.out.print("  Left");

    }
}
