package figuras;
public class Heron {
    
    //Creamos el metodo para calcular ña ley de heron
    public float calcularLeyHeron(float a,float b,float c){
        float area = (a + b + c)/ 2;
        float resultado = (float) Math.sqrt(area*(area - a)*(area - b)*(area - c));
        return resultado;
    }
}
