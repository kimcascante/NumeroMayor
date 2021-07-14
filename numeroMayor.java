package Adicional;

/**
 * Nombre del programa: 
 * Descripcion: Calcular el mayor de dos números
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ejp1w2 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 
        int numeroUno;
        int numeroDos;
        String numeroMayor;

        escribir.println("Digite el primer numero");
        numeroUno = Integer.parseInt(leer.readLine());

        escribir.println("Digite el segundo numero");
        numeroDos = Integer.parseInt(leer.readLine());

        if (numeroUno == numeroDos){
            numeroMayor = "No hay numero mayor, ambos numeros son iguales, el numero " + numeroUno;
        } else if (numeroUno > numeroDos){
            numeroMayor = "El numero mayor es " + numeroUno;
        } else {
            numeroMayor = "El numero mayor es " + numeroDos;
        }

        escribir.println(numeroMayor);
    }
}