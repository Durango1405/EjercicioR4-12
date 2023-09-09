package Actividad2;

import java.util.Scanner;
public class Salariodevengado {
	public static void main(String[] args) {
		String nombre;
		int horas;
		int valorhora;
		int horasextra;
		int horasextra2;
		int salario;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese nombre trabajador:");
		nombre= entrada.next();
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Ingrese numero de horas trabajadas:");
		horas = entrada1.nextInt();
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Ingrese valor por hora:");
		valorhora = entrada2.nextInt(); 
		
		if(horas>40) {
			horasextra=horas-40;
			if(horasextra>8) {
				horasextra2=horasextra-8;
				salario=40*valorhora+16*valorhora+horasextra2*3*valorhora;
			}
			else {
			  salario=40*valorhora+16*valorhora;
			}
		}
		else {
			salario=horas*valorhora;
		}
		
		System.out.println("El trabajador "+nombre+" devengo: $"+salario);
		
		entrada.close();
		entrada1.close();
		entrada2.close();
	}

}
