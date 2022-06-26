package ejercicio_20_06_2022.src;

public class Point {
  private double x;
  private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


  /**
   * Retorna las coordenadas en string 
   */
  public String toString() {
    return "(" + x + ", " + y + ")";
  }

  /**
   * Returns the distance to the origin It can be also calculated calling to
   * distance(new Point(0,0))
   */
  public double distanciaDelOrigen() {
    return Math.sqrt(x * x + y * y);
  }

  /* Getter methods */
  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  /** Returns the distance to another point */
  public double distancia(Point distanciaDelOrigen) {
    double x1;
    double y1;

    x1 = x - distanciaDelOrigen.getX();
    y1 = y - distanciaDelOrigen.getY();
    return Math.sqrt(x1 * x1 + y1 * y1);
  }

  /** Returns the quadrant */
  public int cuadrante() {
    if (x > 0.0 && y > 0.0) {
      return 1;
    } else if (x < 0.0 && y > 0.0) {
      return 2;
    } else if (x < 0.0 && y < 0.0) {
      return 3;
    } else if (x > 0.0 && y < 0.0) {
      return 4;
    } else { // (x==0.0 || y==0.0)
      return 0;
    }
  }

  /**
   * Returns the nearest point of the array in the parameter or null if array is
   * empty
   * 
   * @param otrosPuntos
   * @return
   */
  public Point nearest(Point[] otrosPuntos) {
    Point nearestPoint = null;
    double minDistance;
    double distance;

    if (otrosPuntos!= null && otrosPuntos.length > 0) {
      // Start storing the first point in the array as the nearest one
      minDistance = distancia(otrosPuntos[0]);
      nearestPoint = otrosPuntos[0];

      for (int i = 1; i < otrosPuntos.length; i++) {
        // If nearer point is found, this is the new nearest one
        distance = distancia(otrosPuntos[i]);
        if (distance < minDistance) {
          distance = minDistance;
          nearestPoint = otrosPuntos[i];
        }
      }
    }

    return nearestPoint;
  }
}
