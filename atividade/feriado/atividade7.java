package feriado;

import java.util.*;

public class atividade7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float salario,valorhora, numaulas, INSS;
		
		Scanner leia = new Scanner(System.in); 
		System.out.println("Informe o quanto você cobra por hora: : R$");
		valorhora = leia.nextFloat();
		System.out.println("Informe o numero de aulas dadas ao mês: ");
		numaulas = leia.nextFloat();
		System.out.println("Informe o % de desconto do INSS: ");
		INSS = leia.nextFloat();
		
		salario = (valorhora*numaulas)-INSS/100;
		
		System.out.printf("O salário líquido é: R$ "+salario);
		
	}

}
