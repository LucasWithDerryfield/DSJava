package org.derryfield.toys;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    // Possible responses
    private String[] respond = {
        "It is certain",
        "It is decidedly so",
        "Without a doubt",
        "Yes definitely",
        "You may rely on it",
        "As I see it, yes",
        "Most likely",
        "Outlook good",
        "Yes",
        "Signs point to yes",
        "Reply hazy, try again",
        "Ask again later",
        "Better not tell you now",
        "Cannot predict now",
        "Concentrate and ask again",
        "Don't count on it",
        "My reply is no",
        "My sources say no",
        "Outlook not so good",
        "Very doubtful"
    };

    //shake the 8 ball
    public String shake() {
        Random rando = new Random();
        int finder = rando.nextInt(respond.length);
        return respond[finder]; //return a response from a randomized index in the arrray
    }
    public static void main(String[] args) {
        Magic8Ball magic8Ball = new Magic8Ball();
        Scanner scan = new Scanner(System.in);
        String user = "";
        boolean go = true;
        while (go) {
            System.out.println("Ask a question or press 'q' to exit the program: ");
            user = scan.nextLine();
            if (user.equalsIgnoreCase("q")) {
                go = false;
            } else {
                String finalize = magic8Ball.shake();
                System.out.println(finalize);
            }
        }
    }
}