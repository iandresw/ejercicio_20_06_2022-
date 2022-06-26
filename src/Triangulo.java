import ejercicio_20_06_2022.src.Point;

public class Triangulo extends Figura {

    private Point v1;
    private Point v2;
    private Point v3;
  
    public Triangulo(String nombre, Point v1, Point v2, Point v3) {
        super(nombre);
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public Triangulo(String nombre) {
        super(nombre);
    }
    

    public double[] longituDeBorde() {
      double longituDeBorde[] = new double[3];
      // borde 1->2
      longituDeBorde[0] = v1.distancia(v2);
      // borde 2->3
      longituDeBorde[1] = v2.distancia(v3);
      // borde 3->1
      longituDeBorde[2] = v3.distancia(v1);
      return longituDeBorde;
    }
  

    public double area() {
      return 0.0;
    }
  


    @Override
    public double perimetro() {
        return 0.0;
    }
  }

