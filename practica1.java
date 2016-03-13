package fibonacci;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	        int numero,ant1,ant2,i;
	        do{
	            System.out.print("Introduce el numero de términos de fibonacci que quieres: ");
	            numero = sc.nextInt();
	        }while(numero<=1);
	        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son: "); 

	        ant1=1;
	        ant2=1; 

	        System.out.print(ant1 + " ");
	        for(i=2;i<=numero;i++){
	             System.out.print(ant2 + " ");
	             ant2 = ant1 + ant2;
	             ant1 = ant2 - ant1;
	        }
	        System.out.println(); 
	    }

	}
