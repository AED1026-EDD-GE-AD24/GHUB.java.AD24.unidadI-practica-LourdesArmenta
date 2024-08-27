package miPrincipal;

public class Conjunto {
    static int M=20; //tamaño del arreglo
    private Object cto[];
    private int cardinal;
    private int capacidad;

    //Operaciones
    public Conjunto(){
        cto = new Object[M];
        cardinal = 0;
        capacidad = M;

    }
    //determinar si el conjunto es vacio
    public boolean esVacio(){
        return (cardinal ==0);
    }
    //pertenece al conjunto
    public boolean pertenece(Object elemento){
        int k = 0;
        boolean encontrado = false;

        while (k<cardinal && !encontrado){
            encontrado = cto[k].equals(elemento); // cto[k] == elemento
            k++;
        }
        return encontrado;

    }

    //Añade un elemento al conjunto, si no está en el conjunto
    public void añadir(Object elemento){
        if (!pertenece(elemento)){
            /*
             * Verificar si hay posiciones libres
             * en caso contrario se amplia
             * el conjunto
             */
            if (cardinal == capacidad){
                Object nuevoCto[];
                nuevoCto = new Object[capacidad+M];
                for(int k =0;k<capacidad;k++){
                    nuevoCto[k]=cto[k];
                }
                capacidad +=M;
                cto = nuevoCto;
              
            }
            cto[cardinal] = elemento;
            cardinal++;
        }

    }

    //quita el elemento del conjunto
    public void retirar(Object elemento){
        if(pertenece(elemento)){
            int k=0;
            while (!cto[k].equals(elemento)){
                k++;
            }
            /*
             * desde el elemento k hasta la ultima
             * posicion mover los elementos una posicion 
             * a la izquierde
             */
            for(;k<cardinal;k++){
                cto[k]=cto[k+1];

            }
            cardinal --;


        }
    }




}
