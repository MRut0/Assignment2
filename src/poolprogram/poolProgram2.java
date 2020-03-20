/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolprogram;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class poolProgram2 {
    
    private static String Name;
    private static Scanner input = new Scanner(System.in);
    
   
    public static void main(String[] args) {
//----------------------------Menu----------------------------
        String PoolShape = null;
        String Shape;

        System.out.println("Enter name:");
       //User inputs name    
        Name = input.next();

        //System asks for shape
        System.out.println("Is pool a Cuboid or Cylinder?");
        //User inputs shape
        Shape = input.nextLine();
        
 while (!Shape.equals("cuboid") && (!Shape.equals("cylinder"))){
        Shape = input.next();
        
        if (Shape.equals("cuboid")){
           CubCalc();
        } else if (Shape.equals("cylinder")){
           CyliCalc();
        } else {
           System.out.println("Invalid Shape, re-enter shape:");
           Shape = input.next();
       }
 }
    
    }
    
    
    
//-----------------------------Cuboid------------------------    
    
     public static void CubCalc(){
//**********Area**********

//Input width
    System.out.println("Enter width:");
    double CubWidth=input.nextDouble();
//Input length
    System.out.println("Enter length:");
    double CubLength=input.nextDouble();
//Input depth
    System.out.println("Enter depth:");
    double CubDepth=input.nextDouble();
//Area calculation
    double CubArea=(2*((CubLength*CubWidth)+(CubWidth*CubDepth)+(CubDepth*CubLength)));
    


//*********Volume***********

//Volume calculation
    double CubVol=CubLength*CubWidth*CubDepth;
    
//formatted output
    
        Date Date = null;
        String sAlignLeft = "| %10s %-1s %-24s | \r\n"; 
        String sAlign1 = "| %10s %-30s | \r\n";
        String sFiller = ("|                                            | \n");

        System.out.format("+--------------------------------------------+\n");
        System.out.format(sAlign1,"Ref:","MC123B","Date:" + Date);
        
        System.out.print(sFiller);
        System.out.format(sAlignLeft,"Name:", Name, "Shape: Cuboid");
        System.out.format(sAlign1,"Width:", CubWidth);
        
       
        System.out.print(sFiller);
        System.out.format(sAlign1,"Length:", CubLength);
        System.out.format(sAlign1,"Depth:", CubDepth);
        
        System.out.print(sFiller);
        System.out.format(sAlign1,"Area:", CubArea);
        System.out.format(sAlign1,"Volume", CubVol);
        
        System.out.print(sFiller);
        System.out.println("+--------------------------------------------+");       
        System.out.println("\n");
    }
     
   
     
     
//-------------------------------Cylinder----------------------------
         public static void CyliCalc(){
//***********Area******* 

//Input radius
    System.out.println("Enter radius:");
    double CyliRadius=input.nextDouble();
//Input height
    System.out.println ("Enter height:");
    double CyliHeight=input.nextDouble();
//Separate equation into first and second section
    
//Area Calculation
    double CyliArea=(2*Math.PI*(CyliRadius*(CyliRadius+CyliHeight)));


//***********Volume***********
    
//Volume Calculation
    double CyliVol=(Math.PI*((CyliRadius*CyliRadius)*CyliHeight));
    
//formatted output
    
        Date Date = null;
        String sAlignLeft = "| %10s %-1s %-2s %-18s | \r\n"; 
        String sAlign1 = "| %10s %-31s | \r\n";
        String sFiller = ("|                                            | \n");

        System.out.format("+--------------------------------------------+\n");
        System.out.format(sAlign1,"Ref:","MC123B","Date:" + Date);
        
        System.out.print(sFiller);
        System.out.format(sAlignLeft,"Name:", Name, "Shape:", "Cylinder");
        System.out.format(sAlign1,"Radius:", CyliRadius);
        
        System.out.format(sFiller);
        System.out.format(sAlign1,"Height:", CyliHeight);
        
        System.out.print(sFiller);
        System.out.format(sAlign1,"Area:", CyliArea);
        System.out.format(sAlign1,"Volume", CyliVol);
        
        System.out.print(sFiller);
        System.out.println("+--------------------------------------------+");       
        System.out.println("\n");


    }

    
}