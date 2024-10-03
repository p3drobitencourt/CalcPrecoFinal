import java.util.Scanner;

public class Impostos {
	
	Scanner scan = new Scanner(System.in);

	public double IPI(double valorProduto, double frete, double seguro) {
		 double baseCalculo = valorProduto + frete + seguro;
		 double ipi = baseCalculo*15;
		 return ipi;
	}
	
	public double ICMS(double valor) {
		double aliMGSP = 0.3;
	double aliSPMG = 0.5;
	double aliRJMG = 0.7;
	double aliRJSP = 0.4;
	double aliSPRJ = 0.1;
	double aliMGRJ = 0.6;
		double icms =0;
		
		System.out.println("Selecione o estaod de origem"+ "\n1 - Minas Gerias"+ "\n2 - São Paulo"+ "\n3 - Rio de Janeiro");
		int estOrigin = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Selecione o estad destino"+ "\n1 - Minas Gerais"+ "\n2 - São Paulo"+ "\n3 - Rio de Janeiro");
		int estDest = scan.nextInt();
		scan.nextLine();
		
		switch (estOrigin) {
		case 1:
			System.out.println("O estado de origem foi MG.");
			if(estDest == 1) {
				System.out.println("não tem custo");
				icms = 0;
			}
			else if(estDest == 2) {
				System.out.println("O estado de destino foi SP.");
				icms = valor*aliMGSP;
			}
			else {
				System.out.println("O estado de destino é RJ.");
				icms = valor*aliMGRJ;
			}
			break;
		case 2:
			System.out.println("O estado de origem é SP.");
			if(estDest == 1) {
				System.out.println("O estado de destino foi MG.");
				icms = valor*aliSPMG;
			}
			else if(estDest == 2) {
				System.out.println("não tem custo");
				icms = 0;
			}
			else {
				System.out.println("O estado de destino foi RJ.");
				icms = valor*aliSPRJ;
			}
			break;
		case 3:
			System.out.println("O estado de origem foi RJ.");
			if(estDest == 1) {
				System.out.println("O estado de destino foi MG.");
				icms = valor*aliRJMG;
			}
			else if(estDest == 2) {
				System.out.println("O estado de destino foi SP.");
				icms = valor*aliRJSP;
			}
			else {
				System.out.println("não tem custo");
				icms = 0;
			}
	break;
			
	default:
			break;
	}
		return icms;
		}
	
	public double ISS(double valorServico, double aliPraticada) {
		double iss = aliPraticada*valorServico;
		return iss;
		}
	
}