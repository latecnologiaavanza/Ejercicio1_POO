package figuras;
import java.util.Scanner;

public class Figuras{
     public static void main(String[] args) {
         
          Scanner teclado = new Scanner(System.in);
          Perimetros perimetro = new Perimetros();
          Areas area  = new Areas();
          Heron heron = new Heron();
          
          int opcion;
          
          do{
              System.out.println("\n\tMENU");
              System.out.println("1 . Areas");
              System.out.println("2 . Perimetros");
              System.out.println("3 . Ley de heron");
              System.out.println("4 . Salir");
              System.out.print("Digite una opcion : ");
              opcion = teclado.nextInt();
              
              switch(opcion){
                  case 1:
                        System.out.println("\n\tMENU DE AREAS");
                        System.out.println("1 . Cuadrado");
                        System.out.println("2 . Circulo");
                        System.out.println("3 . Triangulo");
                        System.out.println("4 . Rectangulo");
                        System.out.print("Digite una opcion : ");
                        int eleccionArea = teclado.nextInt();
                        
                        switch(eleccionArea){
                            case 1:
                                System.out.print("\nDigite un lado : ");
                                float lado = teclado.nextFloat();
                                
                                float areaCuadrado = area.calcularAreaCuadrado(lado);
                                System.out.println("\nEl area del cuadrado es : " + areaCuadrado);
                                break;
                                
                            case 2:
                                System.out.print("\nDigite el radio : ");
                                float radio = teclado.nextFloat();
                                
                                float areaCirculo = area.calcularAreaCirculo(radio);
                                System.out.println("\nEl area del circulo es : " + areaCirculo);
                                break;
                                
                            case 3:
                                System.out.print("\nDigite la base : ");
                                float base = teclado.nextFloat();
                                
                                System.out.print("Digite la altura : ");
                                float altura = teclado.nextFloat();
                                
                                float areaTriangulo = area.calcularAreaTriangulo(base, altura);
                                System.out.println("\nEl area del triangulo es : " + areaTriangulo);
                                break;
                                
                            case 4:
                                System.out.print("\nDigite la base : ");
                                float baseRectangulo = teclado.nextFloat();
                                
                                System.out.print("Digite la altura : ");
                                float alturaRectangulo = teclado.nextFloat();
                                
                                float areaRectangulo = area.calcularAreaRectangulo(baseRectangulo, alturaRectangulo);
                                System.out.println("\nEl area del rectangulo es  : " + areaRectangulo);
                                
                                break;
                                
                            default:
                                System.out.println("\nLa opcion no existe , vuelva a digitar");
                                break;
                        }
                      break;
                      
                  case 2:
                       System.out.println("\n\tMENU DE PERIMETROS");
                       System.out.println("1 . Cuadrado");
                       System.out.println("2 . Circulo");
                       System.out.println("3 . Triangulo");
                       System.out.println("4 . Rectangulo");
                       System.out.print("Digite una opcion : ");
                       int eleccionPerimetro = teclado.nextInt();
                       
                       switch(eleccionPerimetro){
                           case 1:
                               System.out.print("\nDigite un lado : ");
                               float lado = teclado.nextFloat();
                               
                               float perimetroCuadrado = perimetro.calcularPerimetroCuadrado(lado);
                               System.out.println("\nEl perimetro del cuadrado es : " + perimetroCuadrado);
                               break;
                               
                           case 2:
                               System.out.print("\nDigite el diametro : ");
                               float diametro = teclado.nextFloat();
                               
                               float perimetroCirculo = perimetro.calcularPerimetroCirculo(diametro);
                               System.out.println("\nEl perimetro del circulo es : " + perimetroCirculo);
                               break;
                               
                           case 3:
                               System.out.print("\nDigite el primer lado  : ");
                               float lado1 = teclado.nextFloat();
                               
                               System.out.print("Digite el seundo lado  : ");
                               float lado2 = teclado.nextFloat();
                               
                               System.out.print("Digite el tercer lado  : ");
                               float lado3 = teclado.nextFloat();
                               
                               float perimetroTriangulo = perimetro.calcularPerimetroTriangulo(lado1, lado2, lado3);
                               System.out.println("El perimetro del triangulo es : " + perimetroTriangulo);
                               break;
                               
                           case 4:
                               System.out.print("\nDigite la base : ");
                               float baseRectangulo = teclado.nextFloat();
                                
                               System.out.print("Digite la altura : ");
                               float alturaRectangulo = teclado.nextFloat();
                               
                               float perimetroRectangulo = perimetro.calcularPerimetroRectangulo(baseRectangulo,alturaRectangulo);
                               System.out.println("\nEl perimetro del rectangulo es : " + perimetroRectangulo);
                               break;
                               
                           default:
                               System.out.println("\nLa opcion no existe , vuelva a digitar");
                               break;
                       }
                      break;
                      
                  case 3:
                      float a,b,c;
                      System.out.print("Digite el primer lado : ");
                      a = teclado.nextFloat();
                      
                      System.out.print("Digite el segundo lado : ");
                      b = teclado.nextFloat();
                      
                      System.out.print("Digite el tercer lado : ");
                      c = teclado.nextFloat();
                      
                      float leyHeron = heron.calcularLeyHeron(a, b, c);
                      System.out.println("\nLa ley de heron es : " + leyHeron);
                      break;
                  
                  case 4:
                      opcion = 4;
                      System.out.println("\nGracias por participar !!!");
                      break;
                   
                   default:
                       System.out.println("\nOpcion no disponible");
                       System.out.println("");
                       break;
              }
          }while(opcion != 4);  
    }
}