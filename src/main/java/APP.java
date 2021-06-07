/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */
import java.util.Scanner;

public class APP {

    public static void main(String[] args) {
        System.out.println("What is the quote?");
        Scanner sc = new Scanner(System.in);
        String Quote = sc.nextLine();
        System.out.println("Who said it?");
        String QuoteSayer  = sc.nextLine();
        String OutPutString = QuoteSayer + " says, \"" + Quote + "\"";

        System.out.print(OutPutString);

    }
}
