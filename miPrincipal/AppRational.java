package miPrincipal;
import java.util.Scanner;
public class AppRational{
    public static void menu() throws Exception{
        Scanner consola = new Scanner(System.in);
        System.out.println("\n======================================");
        System.out.println("Operaciones con Racionales ");
        System.out.println("======================================");

        System.out.print("Introduce el numerador 1:");
        int a = consola.nextInt();
        System.out.print("Introduce el denominador 1:");
        int b = consola.nextInt();

        Rational r1 = new Rational(a,b);

        System.out.print("Introduce el numerador 2:");
        a = consola.nextInt();
        System.out.print("Introduce el denominador 2:");
        b = consola.nextInt();

        Rational r2 = new Rational(a,b);
         
        // Rational r1 = new Rational(2,3);
        //Rational r2 = new Rational(5,3);
         Rational r3 = r1.add( r2);
         System.out.println("Resulado de la suma = "+r3);
         r3 = r1.mult(r2);
         System.out.println("Resultado del producto = "+r3);


        System.out.print("Introduce el numerador 2:");
        a = consola.nextInt();
        System.out.print("Introduce el denominador 2:");
        b = consola.nextInt();

        Rational r5 = new Rational(a,b);
        Rational r6 = new Rational (a,b);

        // Rational r5 = new Rational (2,4);
         //Rational r6 = new Rational (4,8);
        System.out.println(r5+ " y "+r6+" son iguales?"+r5.equal(r6));


        System.out.print("Introduce el numerador 3:");
        a = consola.nextInt();
        System.out.print("Introduce el denominador 3:");
        b = consola.nextInt();

        Rational r7 = new Rational(a,b);

        System.out.print("Introduce el numerador 3:");
        a = consola.nextInt();

        System.out.print("Introduce el denominador 3:");
        b = consola.nextInt();

        Rational r8 = new Rational(a,b);
        Rational r9 = r7.add(r8);

        //Rational r7 = new Rational(2,3);
        //Rational r8 = new Rational(5,3);
        //Rational r9 = r7.add(r8);
        System.out.println("Resultado de la suma = "+r9);
        r9 = r7.mult(r8);
        System.out.println("Resultado del producto = "+r9);
        System.out.println(r7+ " y "+r8+ " son iguales?"+r7.equal(r8));
    }

}