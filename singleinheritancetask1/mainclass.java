/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.singleinheritancetask1;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class mainclass {
    public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
    System.out.println(" enter length = ");
    int len = s.nextInt();
    System.out.println(" enter the width = ");
    int wid = s.nextInt();
    Rectangle r = new Rectangle(len, wid);
    r.display();
    r.area();
}
}
