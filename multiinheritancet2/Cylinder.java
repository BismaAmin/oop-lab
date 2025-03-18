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
public class Cylinder extends Shape3D {
    public double radius;
    public double heigth;
    
    Cylinder(double r, double h){
        this.radius = r;
        this.heigth = h;
    }
    
    double area(){
        return (3.14)*(radius*radius);
    }
}
