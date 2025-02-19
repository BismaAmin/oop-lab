/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.lab.task.pkg1;
import java.util.Scanner;
 class Dish {
    String type;
    String ingredients;
    String cuisine;
 
    public static void main(String [] args){
        Dish dish = new Dish();
        Scanner scan = new Scanner(System.in);
        
        
   
    
    System.out.println("Enter the type of dish = ");
    dish.type = scan.nextLine();
    
    System.out.println("Enter the ingredients = ");
    dish.ingredients = scan.nextLine();
    
    System.out.println("Enter the cuisine = ");
    dish.cuisine = scan.nextLine();
    
    System.out.println("-------WELCOME TO THE ASIAN RESTAURANT--------");
    System.out.println(("Your selected choice is = ") + dish.type );
    System.out.println(("Your selected choice of dish contain the ingredients =  ") + dish.ingredients );
    System.out.println(("Your dish belongs to the " + dish.cuisine + "cuisine"));
    
    scan.close();
    }
    
    
    
    
    
    
    
}
