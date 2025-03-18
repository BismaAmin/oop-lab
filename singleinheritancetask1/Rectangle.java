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
public class Rectangle extends Shape {
    public double length;
    public double width;
    
    Rectangle(int l, int w)
    {
        this.length= l;
        this.width= w;
    }
    
    void area(){
        System.out.println(" area = " + length*width);
    }
}
