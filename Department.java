/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Department {
    public String deptname;
    public String depthead;
    
    
    Department ()
    {
        this.deptname = "unkmow";
        this.depthead = "unknown";
        
    }
    
    Department (String dn, String dh)
    {
        this.deptname = dn;
        this.depthead = dh;
        
    }

    
    
    public void displaydepartmentdata()
    {
        System.out.println(" THE OUTPUT OF DATA : ");
        System.out.println(" Your department name = " + deptname);
        System.out.println(" Your department head = " + depthead);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner scanString = new Scanner (System.in);
      
        System.out.println("Enter your department name = ");
        String deptname = scanString.nextLine();
        System.out.println("Enter your department head = ");
        String depthead = scanString.nextLine();
        
     
        Department d = new Department (deptname , depthead);
        
        d.displaydepartmentdata();
       
        
        
        
         
        
    }
    
}
