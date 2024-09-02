package miPrincipal;

public class AppPunto {
    public static void menu(){
        System.out.println("\n======================================");
        System.out.println("         Operaciones con Punto        ");
        System.out.println("======================================");
        Punto p1 = new Punto(2,1);
        Punto p2 = new Punto(3,2);
        Punto p3 = new Punto(4,1);

        System.out.println("Eje x del punto 1= "+p1.getX());
        System.out.println("Eje y del punto 1= "+p1.getY());
        

        System.out.println("Eje x del punto 2= "+p2.getX());
        System.out.println("Eje y del punto 2= "+p2.getY());

        System.out.println("Eje x del punto 3= "+p3.getX());
        System.out.println("Eje y del punto 3= "+p3.getY());

        System.out.println("Distancia de p1 a p2 = "+p1.distancia(p2));
        System.out.println("Distancia de p2 a p3 = "+p2.distancia(p3));
        System.out.println("Distancia de p1 a p3 = "+p1.distancia(p3));

    }
    
}
