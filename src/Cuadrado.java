import ejercicio_20_06_2022.src.Point;

public class Cuadrado extends Figura {
    /**
   *
   */
  
    private Point v1;
    private Point v2;
    private Point v3;
    private Point v4;
  
    public Cuadrado(String nombre) {
      super(nombre);
    }

    /** Constructor con su nombre y sus vertices */
    public Cuadrado(String nombre, Point diagonalV1, Point diagonalV3) {
      super(nombre);
      this.v1 = diagonalV1;
      this.v3 = diagonalV3;
      otraDiagonal(diagonalV1, diagonalV3);
    }
  
    /** Private method to calculate the vertexes for the other diagonal */
    private void otraDiagonal(Point v1, Point v3) {
      v2 = new Point(v3.getX(), v1.getY());
      v4 = new Point(v1.getX(), v3.getY());
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
      nombre = "Cuadrado 1";
      String s = "CUADRADO";
      s += " [NOMBRE = " + nombre + "]";
      s += " : " + "VERTICES " + v1.toString() + "," + v2.toString()
          + "," + v3.toString() + "," + v4.toString();
      return s;
    }
  
    public static void main(String[] args) {
      Point p1 = new Point(1, 3);
      Point p2 = new Point(3, 1);
      Cuadrado s = new Cuadrado("cuadrado ", p1, p2);
      System.out.println(s.toString());
      System.out.println("Area: " + s.area());
    }

    @Override
    public double perimetro() {
      // TODO Auto-generated method stub
      return 0;
    }

  }