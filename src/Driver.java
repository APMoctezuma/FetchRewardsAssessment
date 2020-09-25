package src;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        String input;
        Scanner stdIn = new Scanner(System.in);
        do {
            System.out.println("Please enter a word to see if it is a pyramid word");
            input = stdIn.nextLine();
            if(!input.equals("q")) {
                StringAnalyzer stringAnalyzer = new StringAnalyzer(input);
                Response response = stringAnalyzer.isPyramid();
                System.out.println("Your word " + input + " gives the result of " + response.getResult() + " because " + response.getReason());
            }
        } while(!input.equals("q"));
    }
}
