package org.mandan.use;

import org.mandan.BinaryOneLocation;

import java.util.Scanner;

public class BinaryOneLocationUser {

    public BinaryOneLocationUser(){
        use();
    }

    private void use() {
        Scanner in = new Scanner(System.in);
        BinaryOneLocation binaryOneLocation = new BinaryOneLocation();

        System.out.println("Welcome to longest 1's string finder program. \nTo close program, type exit for input ");

        do {

            System.out.println("Please input an integer : ");
            String line = in.nextLine();

            if(line.equalsIgnoreCase("exit"))
                break;

            int loc = binaryOneLocation.findlocation(Integer.parseInt(line));

            System.out.println("Longest 1's string location = " + loc);
        }while(true);

        System.out.println("Thanks for using the program");
    }


    public static void main(String[] args) {
        new BinaryOneLocationUser();
    }
}
