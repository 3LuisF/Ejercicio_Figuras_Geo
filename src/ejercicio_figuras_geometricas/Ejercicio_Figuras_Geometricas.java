
package ejercicio_figuras_geometricas;

public class Ejercicio_Figuras_Geometricas {

   
    public static void main(String[] args) {
        // Desarrollo del problema
        
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
    
        System.out.println("El area del círculo es = " + figura1.calcularArea());
        System.out.println("El perimetro del círculo es ="  + figura1.calcularPerimetro());
        System.out.println();
        System.out.println("El area del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perimetro del rectángulo es = " + figura2.calcularPerimetro());
        System.out.println();
        System.out.println("El area del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perimetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();
        System.out.println("El area del triángulo es = " + figura4.calcularArea());
        System.out.println("El perimetro del triángulo es = " + figura4.calcularPerimetro());
        figura4.TipoTri();                
    }
    
}
