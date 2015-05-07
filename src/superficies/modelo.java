
package superficies;

import java.util.Scanner;


public class modelo {
   
   public modelo(){}
    
    
    private static Scanner sc; 
    
    
    public void calcularCuadrado(cuadrado cua){
       
        if (shapeType.equals("square")) {
            //add area calculations for square
           

            System.out.println("what is the side length?");
            cua.sideLength = sc.nextFloat();
            cua.squareArea = cua.sideLength * cua.sideLength;
            System.out.println("The area for your square: " + cua.squareArea);

        }
    }
    
    
        public void calcularRectangulo(rectangulo rec){
        if (shapeType.equals("rectangle")) {
            //add area calculations for rectangle here
        

        
            
            rec.rectangleArea = rec.sideLength * rec.sideHeight;
            System.out.println("The area for your rectangle is: " + rec.rectangleArea);

        }
        }
        
        public void calcularTriangulo(triangulo tri){
        if (shapeType.equals("triangle")) {
            //add area calculations for triangle here
            

            System.out.println("What is the base length of the triangle?");
            baseLength = sc.nextFloat();
            System.out.println("What is the height of the triangle?");
            height = sc.nextFloat();
            tri.triangleArea = (float) (0.5 * tri.baseLength * tri.height);
            System.out.println("Your triangles area is: " + tri.triangleArea);

        }
        }
        public void calcularCirculo(circulo cir){
        if (shapeType.equals("circle")) {
            //add area calculations for a circle here
           

          
            cir.circleArea = cir.radius * cir.radius;
            cir.circleArea = (float) (3.14159265 * cir.circleArea);
            System.out.println("Your Circles area is " + cir.circleArea);

        }

    }
    
    
    
}
