package miPrincipal;
import java.util.Scanner;

public class Principal {
    public String getGreeting() {
        return "Hola Mundo!";
    }

    public static void main(String[] args)  throws Exception{
        Scanner consola = new Scanner(System.in);
        int opc = 0;
        do{
            System.out.println("*******************************************");
            System.out.println("          Tipos de Datos Abstractos ");
            System.out.println("*******************************************");

            System.out.println(" 1) Rational");
            System.out.println(" 2) Matriz");
            System.out.println(" 3) Cadena");
            System.out.println(" 4) Numerote");
            System.out.println(" 5) Conjunto");
            System.out.println(" 6)");
            System.out.println(" 7)");
            System.out.println(" 8)");
            System.out.println(" 9) Punto");
            System.out.println("10)Triangulo");
            System.out.println("11) Poligono");
            System.out.println("                       0) Salir");

            System.out.print("Seleccione una opcion (0 para salir ): ");
            opc = consola.nextInt();
            switch(opc){
                case 1:
                   AppRational.menu();
                   break;
                case 2:
                   
                case 3:
                   
                case 4:
                case 5:
                   AppConjunto.menu();
                   break;
                case 6:
                case 7:
                case 8:
                case 9:
                   AppPunto.menu();
                   break;
                case 10:
                case 11:

                case 0:
                    System.out.println("Adios");
                    break;
                default:
                   System.out.println("Valor Incorrecto, intente de nuevo");
            }


        } while (opc !=0);

       

       






        




    }
}