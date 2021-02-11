package figuras;
public class Areas {
    
     //Creamos el metodo para calcular el area del cuadrado
    public float calcularAreaCuadrado(float lado){
          float area = lado * lado;
          return area;
    }
    
    //Creamos el metodo para calcular el area del circulo
    public float calcularAreaCirculo(float radio){
        float area = (float)(Math.PI * (Math.pow(radio,2)));
        return area;
    }
    
    //Creamos el metodo para calcular el area del triangulo
    public float calcularAreaTriangulo(float base,float altura){
        float area = (base * altura) / 2;
        return area;
    }
    
    //Creamos el metodo para calcular el area del rectangulo
    public float calcularAreaRectangulo(float base,float altura){
        float area = base * altura;
        return area;
    }
}
