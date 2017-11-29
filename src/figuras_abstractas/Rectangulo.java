package figuras_abstractas;

/**
 *
 * @author DAVID
 */
public class Rectangulo extends Figura {
    private double ancho;
    private double alto;
    
//Constructores
    public Rectangulo(){}
    
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }    
   
    public double area() {
        return ancho * alto;
    }
    
    public double perimetro(){
       return (2 * alto) + (2 * ancho);
    }
    
}
