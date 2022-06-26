import ejercicio_20_06_2022.src.Point;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        AreaDeLaFigura areaDeLaFigura = new AreaDeLaFigura(2);
        Point p1 = new Point(1, 1);
        Point p2 = new Point(3, 1);
        Point p3 = new Point(2, 3);
        Triangulo t = new Triangulo("Triangulo ", p1, p2, p3);
        Point p4 = new Point(1, 3);
        Point p5 = new Point(3, 1);
        Cuadrado s = new Cuadrado("Cuadrado ", p4, p5);
        areaDeLaFigura.addFigura(t);
        areaDeLaFigura.addFigura(s);
        areaDeLaFigura.print();
    }
}