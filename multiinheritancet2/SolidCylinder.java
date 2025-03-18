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
public class SolidCylinder extends Cylinder {
   SolidCylinder(double r , double h){
       super (r, h);
    }
     
    public void volume(){
         System.out.println(" the area = " + super.area());
         System.out.println(" the volume = " + (super.area()*heigth));
         
     }
}
