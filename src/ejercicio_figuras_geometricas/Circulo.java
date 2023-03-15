
package ejercicio_figuras_geometricas;


public class Circulo {
    int radio;
    Circulo(int radio){
        //Atributo
        this.radio = radio;
    }
    //Metodos
    double calcularArea(){
        return Math.PI*Math.pow(radio, 2);
    }
    double calcularPerimetro(){
        return 2*Math.PI*radio;
    }
    
}
