import java.util.Scanner;

public class Main {

	
	
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Impostos imp = new Impostos();
		System.out.println("Escolha uma opção"+ "\n1 - Produto"+ "\n2 - Serviço");
		int op = scan.nextInt();
		scan.nextLine();
		
		switch (op) {
		case 1:
			System.out.printf("Digite a margem de lucro que voce quer do produto ou serviço: (Em decimal por favor)");
			double margLucro = scan.nextDouble();
			System.out.printf("Digite o custo para a produção do produto: ");
			double custoPro = scan.nextDouble();
			System.out.printf("Digite o valor do frete aplicado: ");
			double frete = scan.nextDouble();
			System.out.printf("Digite o valor do seguro: ");
			double seguro = scan.nextDouble();
			
			double ipi = imp.IPI(custoPro, frete, seguro);
			double icms = imp.ICMS(custoPro);
			
			double valorFim = custoPro + (ipi+icms) + margLucro;
			System.out.printf("O valor final que o produto será vendido é: "+valorFim);	
			break;

		case 2:
			System.out.printf("Digite a margem de lucro do produto/serviço: ");
			margLucro = scan.nextDouble();
			System.out.printf("Digite o custo para a realização do serviço: ");
			double custoSer = scan.nextDouble();
			System.out.printf("Digite o valor da alíquota praticada: ");
			double aliPraticada = scan.nextDouble();
			
			icms = imp.ICMS(custoSer);
			double iss = imp.ISS(custoSer, aliPraticada);
			
			valorFim = custoSer + (iss+icms) + margLucro;
			System.out.printf("O valor final que o produto será vendido é: "+valorFim);	
			break;
		}

	}
}