/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hauntedhouse;
import java.util.Scanner;
/**
 *
 * @author User
 */


    /**
     * @param args the command line arguments
     */
   /* public static void main(String[] args) {
        // TODO code application logic here
        String [] mysteryword = {"GHOST" , "VAMPIRE", "ZOMBIE" };
        char [] hints = { 'G' , 'V' , 'Z'};
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0 ; i< mysteryword.length ; i++)
        {
            boolean correct = false;
            System.out.println(" WELCOME TO ROOM " + (i+1));
            System.out.println (" YOUR HINTS are " + hints[i]);
            do{
            System.out.println (" enter  your guess");
            String guess = scan.nextLine().toUpperCase();
            if(guess.equals (mysteryword[i]))
           {
                correct = true;
                System.out.println(" You have escaped the room ");
            }
            
        }
        
    }
    
}*/

import java.util.Scanner;

public class Hauntedhouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Mystery words for the three rooms
        String[] mysteryWords = {"GHOST", "VAMPIRE", "ZOMBIE"};
        
        System.out.println("Welcome to the Haunted House! Escape by guessing the mystery words.");
        
        // Loop through each room
        for (int i = 0; i < mysteryWords.length; i++) {
            String mysteryWord = mysteryWords[i];
            char firstLetter = mysteryWord.charAt(0);
            String guess;
            
            System.out.println("\nRoom " + (i + 1) + " - The word starts with: " + firstLetter);
            
            // Keep asking until the correct word is guessed
            do {
                System.out.print("Enter your guess: ");
                guess = scanner.nextLine().toUpperCase();
                
                if (!guess.equals(mysteryWord)) {
                    System.out.println("Wrong guess! Try again.");
                }
            } while (!guess.equals(mysteryWord));
            
            System.out.println("Correct! You move to the next room.");
        }
        
        System.out.println("\nCongratulations! You have escaped the haunted house!");
        scanner.close();
    }
}
