package org.mandan.use;

import org.mandan.CharacterFinder;

import java.util.Scanner;

public class CharacterFinderUser {

    public CharacterFinderUser(){
        use();
    }

    public void use(){
        Scanner in = new Scanner(System.in);
        CharacterFinder characterFinder = new CharacterFinder();

        System.out.println("Welcome to word finder program. \nTo close program, type exit for input sentence ");

        do {

            System.out.println("Please input sentence : ");
            String line = in.nextLine();

            if(line.equalsIgnoreCase("exit"))
                break;


            System.out.println("Please input character to find : ");
            String searchChar = in.nextLine();

            String foundWord = characterFinder.findWord(line, searchChar);

            System.out.println("Word = " + foundWord);
        }while(true);

        System.out.println("Thanks for using the program");
    }

    public static void main(String[] args) {
        new CharacterFinderUser();
    }
}
