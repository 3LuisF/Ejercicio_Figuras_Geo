
package ejercicio_figuras_geometricas;


public class Cuadrado {
    //Atributos
    int Lado;
    //Parametros que definen las caracteristicas
    public Cuadrado(int Lado){
        this.Lado = Lado;
    }
    
    //Metodos que retornan sus caracteristicas
    double calcularArea(){
        return Lado*Lado;
    }
    double calcularPerimetro(){
        return 4*Lado;
    }
}
