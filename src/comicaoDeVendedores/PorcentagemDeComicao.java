package comicaoDeVendedores;

import java.util.Scanner;

public class PorcentagemDeComicao {

	public static void main(String[] args) {
		
	Scanner Input = new Scanner(System.in);	
	String name;
	int codigoPeça;
	double precoPeca;
	int quantidadesVendida;
	int porcentagem =15;
	
	System.out.println("Digite o nome do vendedor: " );
	name = Input.nextLine();
	
	System.out.println("Qual é o código da Peça: ");
	codigoPeça = Input.nextInt();

	System.out.println("Qual é o preço da peça: ");
	precoPeca = Input.nextDouble();
	
	System.out.println("Quantas Peças foram vendidas: ");
	quantidadesVendida = Input.nextInt();
	
	double comicao =((quantidadesVendida * precoPeca) * porcentagem)/100;
	
	System.out.println(name  +", O pagamento comissionado foi de: R$" + comicao);
	
	}

}
