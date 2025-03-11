/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candy.crush;
import java.util.Scanner;
/**
 *
 * @author Riphah
 */
public class CandyCrush {
    public String name ;
    private int score;
    private int level;
   // Scanner scan = new Scanner (System.in);
    
    CandyCrush( String n)
    {
        this.name = n;
        this.score = 0;
        this.level = 0;
    }
    
    public int getscore()
    {
        return score;
    }
    public void setscore(int s)
    {
        this.score = s;
    }
    
    public int getlevel()
    {
        return level;
    }
    public void setlevel(int l)
    {
        this.level = l;
    }
    
    public void action()
    {
        Scanner scanint = new Scanner (System.in);
        //int choice;
        System.out.println("Following actions can be played =  ");
        System.out.println("1. match candies ");
        System.out.println("2. claer a row ");
        System.out.println("3. conplete a level ");
        System.out.println("Enter ur choice according to give options =  ");
        int choice = scanint.nextInt();
        
       /* if(choice == 1)
        {
            score+= 20;
            System.out.println("Your score has been increased by 20");
        }
        else if (choice == 2)
        {
            score +=30;
            System.out.println("Your score has been increased by 30");
        }
        else if (choice == 3)
        {
            level++;
            System.out.println("You have completed this level. So you have been moved to next level " + level);
        }
        else 
        {
           System.out.println("Invalid choice");
        }*/
       switch (choice)
       {
           case 1:
            score+= 20;
            System.out.println("Your score has been increased by 20");
            break;
           case 2:
            score+= 30;
            System.out.println("Your score has been increased by 30");
            break;
           case 3:
            level++;
            System.out.println("You have completed this level. So you have been moved to next level " + level);
            break;
           default:
            System.out.println("INVALID CHOICE");   
       }      
    }
     
    
    public void display() 
    {
       System.out.println("-------YOUR DETAILS ARE-----");
       System.out.println("YOUR NMAE = " + name);
       System.out.println("YOUR SCORE IS = " + score);
       System.out.println("YOUR LEVEL IS = " + level );
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanstr = new Scanner (System.in);
        
        System.out.println("Enter your name = ");
        String name = scanstr.nextLine();
        
        CandyCrush cc = new CandyCrush (name);
        
        cc.setscore(100);
        cc.setlevel(3);
        System.out.println("Your score is = " + cc.getscore());
        System.out.println("Your level is = " + cc.getlevel());
       
        cc.action();
        cc.display();
    } 
}