package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Bill;

public class DesafioBar {

	public static void main(String[] args) {
	
		Bill ct = new Bill();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("SEXO          : ");
		ct.gender = sc.next().charAt(0);
		System.out.print("ESPETOS       : ");
		ct.barbequeu = sc.nextInt();
		System.out.print("REFRIGERANTES : ");
		ct.sofDrink = sc.nextInt();
		System.out.print("CERVEJAS      : ");
		ct.beer = sc.nextInt();
		
		double tkt = ct.Ticket(ct.gender);
		double consumo = ct.Feeding(ct.sofDrink, ct.beer, ct.barbequeu);
		double cover = ct.Cover(consumo);
		
		
		
		System.out.println("RELATORIO");
		System.out.printf("CONSUMO    : R$ %.2f %n",  (consumo));
		System.out.print("COUVERT    : ");
		if (cover == 0) {
			System.out.println("ISENTO");
		} else {
			System.out.println(cover);
		}
		
		System.out.printf("INGRESSO   : R$ %.2f %n", tkt);
		System.out.println();
		System.out.printf("Valor a Pagar    : %.2f %n" ,(consumo+cover+tkt));
			
		
		sc.close();
		

	}

}
