
}
public class AreaDeLaFigura {

    /** The array of figures */
    private Figura figuras[] = null;
  
    /** Constructor of the class with a fixed number of figures. */
    public AreaDeLaFigura(int numFiguras) {
      figuras = new Figura[numFiguras];
    }
  
    /** Calculates the total area of the array figures. */
    public double areaTotal() {
      double areaTotal = 0;
      for (int i = 0; i < figuras.length; i++) {
        System.out.println(" Summing area of figure " + i + ":"
            + figuras[i].area());
        areaTotal += figuras[i].area();
      }
      return areaTotal;
    }
  
    /** Adds a new figure in the first empty position of the figures array. */
    public void addFigure(Figura f) {
      for (int i = 0; i < figuras.length; i++) {
        if (figuras[i] == null) {
          figuras[i] = f;
          break;
        }
      }
    }
  
    /** Prints a list with the array figures. */
    public void print() {
      for (int i = 0; i < figures.length; i++) { 
      /* 
       * The call to the toString method works because 
       * this method is defined in the Object class 
       * (which all Java classes extend).
       * In general, we need to declare the method in the parent class
       * in order to be able to call it applying polymorphism.
       */
      System.out.println(figures[i].toString());
      }
      System.out.println("Total area: "+totalArea());
    }
  
    /** Main Program */
    public static void main(String args[]) throws Exception {
      FiguresArea figuresArea = new FiguresArea(2);
  
      Point p1 = new Point(1, 1);
      Point p2 = new Point(3, 1);
      Point p3 = new Point(2, 3);
      Triangle t = new Triangle("Triangle1", p1, p2, p3);
  
      Point p4 = new Point(1, 3);
      Point p5 = new Point(3, 1);
      Square s = new Square("Square1", p4, p5);
  
      figuresArea.addFigure(t);
      figuresArea.addFigure(s);
      
      figuresArea.print();
    }
  }