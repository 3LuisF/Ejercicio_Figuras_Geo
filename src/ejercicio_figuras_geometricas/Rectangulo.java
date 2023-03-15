

package ejercicio_figuras_geometricas;


public class Rectangulo {
    //Atributos 
    int base,altura;
    
    //parametros que definen al rectangulo
    Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    //metodos que me calculan 
    double calcularArea (){
        return base*altura;
    }
    double calcularPerimetro(){
        return (2*base)+(2*altura);        
    }
    
}
    
