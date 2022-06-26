import ejercicio_20_06_2022.src.Point;

public class Cuadrado extends Figura {

    /** Square vertexes */
    private Point v1;
    private Point v2;
    private Point v3;
    private Point v4;
  
    /** Constructor with name and vertexes */
    public Cuadrado(String nombre, Point diagonalVertex1, Point diagonalVertex3) {
      super(nombre);
      this.v1 = diagonalVertex1;
      this.v3 = diagonalVertex3;
      otherDiagonal(diagonalVertex1, diagonalVertex3);
    }
  
    /** Private method to calculate the vertexes for the other diagonal */
    private void otherDiagonal(Point vertex1, Point vertex3) {
      v2 = new Point(vertex3.getX(), vertex1.getY());
      v4 = new Point(vertex1.getX(), vertex3.getY());
    }
  
    public double area() {
      double base = v1.distancia(v2);
      double altura = v1.distancia(v4);
      return base * altura;
    }
  
    /**
     * Implementation of the abstract method to calculate if the figure is
     * regular.
     */
    public boolean isRegular() {
      // Due to our simplification, the square may not be actually a square, but a
      // rectangle. However, that is just our simplification, so we will return
      // always true: a square is always regular, by definition
      return true;
    }
  
    /** Returns a representative string of the square. */
    public String toString() {
      String s = "CUADRADO";
      s += " [NOMBRE=" + nombre + "]";
      s += " : " + "VERTICES " + v1.toString() + "," + v2.toString()
          + "," + v3.toString() + "," + v4.toString();
      return s;
    }
  
    public static void main(String[] args) {
      Point p1 = new Point(1, 3);
      Point p2 = new Point(3, 1);
      Cuadrado s = new Cuadrado("Cuadrado", p1, p2);
      System.out.println(s.toString());
      System.out.println("Area: " + s.area());
    }

    @Override
    public double perimetro() {
      // TODO Auto-generated method stub
      return 0;
    }
  
  }