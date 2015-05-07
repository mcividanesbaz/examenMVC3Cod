

package superficies;

import java.util.Scanner;


public class vista {
   private static Scanner sc;
    
    public void introducirDatos(){
    
           String shapeType;

        sc = new Scanner(System.in);

        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        shapeType = sc.nextLine();
        System.out.println("You said: " + shapeType);

    }
}