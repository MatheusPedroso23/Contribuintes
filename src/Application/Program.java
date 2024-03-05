package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.TaxPlayer;
import Entities.company;
import Entities.individual;

public class Program {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPlayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("tax payer - " + i + "data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				list.add(new individual(name, income, health));
			}
			else {
				System.out.print("number of employess: ");
				int emp = sc.nextInt();
				list.add(new company(name, income, emp));
			}
		}
		
		double soma = 0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(TaxPlayer contribuente : list) {
			double tax = contribuente.tax();
			System.out.println(contribuente.getName() + ": $ " +  String.format("%.2f", tax));
			soma += tax;
		}
		
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", soma));
		
		
		
		sc.close();
	}	
	
		
}
