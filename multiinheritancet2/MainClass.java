/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.multiinheritancet2;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class MainClass {
    public static void main(String [] args){
        
    Scanner scan = new Scanner(System.in);
    System.out.println(" enter the radius = ");
    double rad = scan.nextDouble();
    System.out.println(" enter the heigth = ");
    double heig = scan.nextDouble();
    
    SolidCylinder s= new SolidCylinder(rad, heig);
    s.volume();
    
}
}
