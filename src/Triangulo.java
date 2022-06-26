import ejercicio_20_06_2022.src.Point;

public class Triangulo extends Figura {

  /** Vertexes of the triangle */
  private Point v1;
  private Point v2;
  private Point v3;
  private String nombre = "Triangulo";

  /** Constructor del triangulo comn sus vertices */
  public Triangulo(String nombre, Point v1, Point v2, Point v3) {
    super(nombre);
    this.v1 = v1;
    this.v2 = v2;
    this.v3 = v3;

  }

  /** Devuelve una matriz con la longitud de cada borde del triángulo. */
  public double[] longituDeBorde() {
    double longituDeBorde[] = new double[3];

    // Longitud 1->2
    longituDeBorde[0] = v1.distancia(v2);
    // Longitud 2->3
    longituDeBorde[1] = v2.distancia(v3);
    // Longitud 3->1
    longituDeBorde[2] = v3.distancia(v1);

    return longituDeBorde;
  }

  /** Implementación del método abstracto para calcular el área del triángulo. */
  public double area() {
    Point medio = new Point((v1.getX() + v2.getX()) / 2,
        (v1.getY() + v2.getY()) / 2);
    double base = v1.distancia(v2);
    double altura = medio.distancia(v3);
    return (base * altura) / 2;
  }


  /**
   * Implementación del método abstracto para indicar si el triángulo es
   * regular.
   */
  public boolean isRegular() {
    double longituDeBorde[] = longituDeBorde();
    if (longituDeBorde[0] == longituDeBorde[1] && longituDeBorde[1] == longituDeBorde[2]
        && longituDeBorde[2] == longituDeBorde[0]) {
      return true;
    }
    return false;
  }

  /** Returns a representative string of the triangle. */
  public String toString() {
    String s = "TRIANGULO";
    s += " [NOMBRE = " + nombre  + "]";
    if (isRegular()) {
      s += " [REGULAR] ";
    } else {
      s += " [IRREGULAR] ";
    }
    s += " : " + "VERTICES " + v1.toString() + "," + v2.toString()
        + "," + v3.toString();
    return s;
  }

  public static void main(String[] args) {
    String nombre = "triangulo 1";
    Point p1 = new Point(1, 1);
    Point p2 = new Point(3, 1);
    Point p3 = new Point(2, 3);
    Triangulo t = new Triangulo("t1", p1, p2, p3);
    System.out.println(t.toString());
    System.out.println("Area del "+nombre+": " +t.area());
    nombre = "triangulo 2";
    Point p4 = new Point(4, 6);
    Point p5 = new Point(7,91);
    Point p6 = new Point(8, 7);
    Triangulo x = new Triangulo( "t2",p4, p5, p6);
    System.out.println(x.toString());
    System.out.println("Area del "+nombre+": " +x.area());
  }

  @Override
  public double perimetro() {
    // TODO Auto-generated method stub
    return 0;
  }
}