package superficies;

import java.util.Scanner;


public class Superficies {

    private static Scanner sc; 
    
  
    public static void main(String[] args) {
          vista prog = new vista();
        prog.menu();
        
  
}
       public static void calcularCuadrado(cuadrado cua){
        cua.setSquareArea(cua.getSideLength()*cua.getSideLength());
    }
    
      
    public static void calcularRectangulo(rectangulo rec){
        rec.setRectangleArea(rec.getSideLength()*rec.getSideHeight());
        
    }
    
    public static void calcularTriangulo(triangulo tri){      
        tri.setTriangleArea((float) (0.5 * tri.getBaseLength()* tri.getHeight()));
        
    }
    
    public static void calcularCirculo(circulo cir){
        cir.setCircleArea((float) (3.14159265 *(cir.getRadius()*cir.getRadius())));
        
    }
    
}