package Tema2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Crear un men� de una calculadora donde las opciones sean: 1. Sumar, 2. Restar, 3.
Multiplicar, 4. Dividir. Se pedir�n dos n�meros al usuarios y seg�n la opci�n seleccionada se
realizar� la operaci�n y mostrar� el resultado por pantalla.*/

public class Ejercicio37 {

	public static void main(String[] args) 
	{
	Scanner reader = new Scanner(System.in);
	boolean fin = false;
	while(!fin)
	{
			
		
		System.out.println("*** CALCULADORA *** \n");
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("3.Multiplicar");
		System.out.println("4.Dividir \n\n");
		
		
		boolean avanzar = false;
		int opcion = 0;
		int k = 0;
        while(!avanzar){
        try 
            {
            if (k > 0)
                System.out.println("Elige una opci�n correcta: ");
            if (k == 0)
                System.out.println("Elige una opci�n: ");
            opcion = reader.nextInt();
                switch (opcion) 
                {
                    case 1:
                        avanzar = true;
                        break;
                    case 2:
                        avanzar = true;
                        break;
                    case 3:
                        avanzar = true;
                        break;
                    case 4:
                        avanzar = true;
                        break;
                    default:
                        k++;
                }
            }catch (InputMismatchException e) 
            {
                System.out.println("(Debes insertar un n�mero)\n");
                k++;
                reader.next();
            }
        }
        System.out.println( "Opci�n escogida -> " + opcion );
        double n = 0;
        double i = 0;
        double resultado = 0;
		System.out.println("Introduzca el primer n�mero: ");
		n = reader.nextInt();
		System.out.println("Introduzca el segundo n�mero: ");
		i = reader.nextInt();
		if (opcion == 1)
			resultado = i + n;
		if (opcion == 2)
			resultado = n - i;
		if (opcion == 3)
			resultado = n * i;
		if (opcion == 4)
			resultado = n / i;
		System.out.println("El resultado es: " + resultado);
		
		
		System.out.println("�Quiere volver a operar? \n");
		System.out.println("1.Si");
		System.out.println("2.No");
		int h = 0;
		opcion = 0;
		avanzar = false;
        while(!avanzar){
        try 
            {
            if (h > 0)
                System.out.println("Elige una opci�n correcta: ");
            if (h == 0)
                System.out.println("Elige una opci�n: ");
            opcion = reader.nextInt();
                switch (opcion) 
                {
                    case 1:
                        avanzar = true;
                        break;
                    case 2:
                        avanzar = true;
                        break;
                    default:
                        h++;
                }
            }catch (InputMismatchException e) 
            {
                System.out.println("(Debes insertar un n�mero)\n");
                h++;
                reader.next();
            }
        if (opcion == 1)
        	fin = false;
        if (opcion == 2)
        	fin = true;
		}
		
		}
		reader.close();
	}
	
	
	/*if (num >= 0 && num < 1000)
	 {
		if (num >= 0 && num < 10)
			una cifra
		if (num >= 10 && num < 100)
			dos cifras
		if (num >= 100 && num < 1000)
			tres cifras
	}
	else
		error*/
}
