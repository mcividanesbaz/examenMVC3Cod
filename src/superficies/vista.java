

package superficies;

import java.util.Scanner;


public class vista {
  
     private static Scanner sc;

    /**
     * Menu con la figura que vamos a crear.
     */
    public void menu() {
        String shapeType;

        sc = new Scanner(System.in);

        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        shapeType = sc.nextLine();
        System.out.println("You said: " + shapeType);

        if (shapeType.equals("square")) {
            cuadrado cuadrado1 = new cuadrado();
            introducirDatosSquare(cuadrado1);
            Superficies.calcularCuadrado(cuadrado1);
            this.visualizarSquare(cuadrado1);

        }
        if (shapeType.equals("rectangle")) {
            rectangulo rectangulo1 = new rectangulo();
            introducirDatosRectangle(rectangulo1);
            Superficies.calcularRectangulo(rectangulo1);
            this.visualizarRectangle(rectangulo1);
        }
        if (shapeType.equals("triangle")) {
            triangulo triangulo1 = new triangulo();
            introducirDatosTriangle(triangulo1);
            Superficies.calcularTriangulo(triangulo1);
            this.visualizarTriangle(triangulo1);
        }
        if (shapeType.equals("circle")) {
            circulo circle1 = new circulo();
            introducirDatosCircle(circle1);
            Superficies.calcularCirculo(circle1);
            this.visualizarCircle(circle1);
        }
    }

    /**
     * Introducimos los datos de un cuadrado.
     *
     */
    public void introducirDatosSquare(cuadrado cua) {
        System.out.println("what is the side length?");
        cua.setSideLength(sc.nextFloat());
    }

    /**
     * Introducimos los datos de un rectangulo.
     *
     */
    public void introducirDatosRectangle(rectangulo rec) {
        System.out.println("what is the rectangles width?");
        rec.setSideLength(sc.nextFloat());
        System.out.println("What is the rectangles height?");
        rec.setSideHeight(sc.nextFloat());
    }

    /**
     * Introducimos los datos de un triangulo.
     *
     */
    public void introducirDatosTriangle(triangulo tri) {
        System.out.println("What is the base length of the triangle?");
        tri.setBaseLength(sc.nextFloat());
        System.out.println("What is the height of the triangle?");
        tri.setHeight(sc.nextFloat());
    }

    /**
     * Introducimos los datos de un circulo
     *
     * @param circle le pasamos el objeto tipo Circle
     */
    public void introducirDatosCircle(circulo cir) {
        System.out.println("What is the radius of the circle?");
        cir.setRadius(sc.nextFloat());
    }

    /**
     * Visualizamos el area del rectangulo
     *
     */
    public void visualizarRectangle(rectangulo rec) {
        System.out.println("The area for your rectangle: " + rec.getRectangleArea());
    }

    /**
     * Visualizamos el area del cuadrado
     *
     */
    public void visualizarSquare(cuadrado cua) {
        System.out.println("The area for your square: " + cua.getSquareArea());
    }

    /**
     * Visualizamos el area del triangulo
     *
     */
    public void visualizarTriangle(triangulo tri) {
        System.out.println("Your triangles area is: " + tri.getTriangleArea());
    }

    /**
     * Visualizamos el area del Circulo
     *
     */
    public void visualizarCircle(circulo cir) {
        System.out.println("Your Circles area is " + cir.getCircleArea());
    }
    
    
}
