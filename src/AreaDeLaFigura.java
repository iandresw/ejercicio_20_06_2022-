public class AreaDeLaFigura {

    /** El array de figuras */
    private Figura figuras[] = null;

    public AreaDeLaFigura(int numeroDeFiguras) {
      figuras = new Figura[numeroDeFiguras];
    }

    public AreaDeLaFigura() {
    }
/**
    public AreaDeLaFigura(int numFiguras, String nombre, Figura[][] figuras) {
      figuras = new Figura[nombre][numFiguras];
    }
  
    /** Calcula el área total de las figuras de la matriz. */
    public double areaTotal() {
      double areaTotal = 0;
      for (int i = 0; i < figuras.length; i++) {
          System.out.println(" Area de la figura "+ figuras[i].area());
        areaTotal += figuras[i].area();
      }
      return areaTotal;
    }
  
    /** Agrega una nueva figura en la primera posición vacía de la matriz de figuras. */
    public void addFigura(Figura f) {
      if(figuras != null){
        for (int i = 0; i < figuras.length; i++) {
          if (figuras[i] == null) {
            figuras[i] = f;
            break;
          }
        }
      }else{
        int i =0;
        figuras[i] = f;
      }


      
    }
  
    /** Imprime una lista con las cifras de la matriz. */
    public void print() {
      for (int i = 0; i < figuras.length; i++) { 
      /* 
       * La llamada al método toString funciona porque
       * este método está definido en la clase Object
       * (que se extienden todas las clases de Java).
       * En general, necesitamos declarar el método en la clase padre
       * para poder llamarlo aplicando polimorfismo.
       */
      System.out.println(figuras[i].toString());
      }
      System.out.println("Total area: "+ areaTotal());
    }
  
  }