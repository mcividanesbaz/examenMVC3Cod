

package superficies;

import java.util.Scanner;


public class vista {
  
     private static Scanner sc; 
     
    public void introducirCuadrado(cuadrado cua){
    
           String shapeType;

            System.out.println("what is the side length?");
            cua.sideLength = sc.nextFloat();
               sc = new Scanner(System.in);   
    }
    
    
    public void introducirCirculo(circulo cir){
       
        
        
          System.out.println("What is the radius of the circle?");
            cir.radius = sc.nextFloat();
            sc = new Scanner(System.in);
     

    }
    public void introducirRectangulo(rectangulo rec){
        
        System.out.println("what is the rectangles width?");
            rec.sideLength = sc.nextFloat();
            System.out.println("What is the rectangles height?");
            rec.sideHeight = sc.nextFloat();
        
        
    }
    
    
    
    
    
    
}
