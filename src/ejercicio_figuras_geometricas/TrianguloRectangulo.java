
package ejercicio_figuras_geometricas;


public class TrianguloRectangulo {
    //Atributos
    int Base,Altura;
    //Parametros para las caracterisiticas
    public TrianguloRectangulo(int Base,int Altura){
        this.Base = Base;
        this.Altura=Altura;
    }
    //Metodos que me calculan area y perimetro 
    double calcularArea(){
        return (Base*Altura)/2;
    }
    double calcularHipotenusa(){
        return Math.sqrt((Base*Base)+(Altura*Altura));
    }
    double calcularPerimetro(){
        return (Base+Altura+calcularHipotenusa());
    }
    void TipoTri(){
        if ((Base == Altura)&&(Base==calcularHipotenusa())&&(Altura==calcularHipotenusa())){
            System.out.println("Es un triángulo equilátero");
        }
        if ((Base != Altura)&&(Base!=calcularHipotenusa())&&(Altura!=calcularHipotenusa())){
            System.out.println("Es un triángulo escaleno");
        }
        else {
            System.out.println("Es un triaungulo isósceles");
        }

    }
    
}
