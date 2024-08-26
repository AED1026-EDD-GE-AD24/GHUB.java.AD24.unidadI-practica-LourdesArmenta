package miPrincipal;

import org.junit.jupiter.engine.script.ScriptAccessor.SystemPropertyAccessor;

public class Principal {
    public String getGreeting() {
        return "Hola Mundo!";
    }

    public static void main(String[] args) {
        //System.out.println(new Principal().getGreeting());
        Rational r1 = new Rational(2,3);
        Rational r2 = new Rational(5,3);
        Rational r3 = r1.add(r1, r2);
        System.out.println("Resulado de la suma = "+r3);
        r3 = r1.mult(r1, r2);
        System.out.println("Resultado del producto = "+r3);
        Rational r5 = new Rational (2,4);
        Rational r6 = new Rational (4,8);
        System.out.print(r5+ " y "+r6+r5.equal(r5, r6));
        




    }
}