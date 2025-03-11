/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.lab.task.pkg1;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class dishes {
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        
    String type;
    String ingredients;
    String cuisine;
    
    System.out.println("Enter the type of dish = ");
    type = scan.nextLine();
    
    System.out.println("Enter the ingredients = ");
    ingredients = scan.nextLine();
    
    System.out.println("Enter the cuisine = ");
    cuisine = scan.nextLine();
    
    System.out.println("-------WELCOME TO THE ASIAN RESTAURANT--------");
    System.out.println(("Your selected choice is = ") + type );
    System.out.println(("Your selected choice of dish contain the ingredients =  ") + ingredients );
    System.out.println(("Your dish belongs to the " + cuisine + "cuisine"));
    
    scan.close();
    }
}
    
