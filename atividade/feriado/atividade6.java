package feriado;

import java.util.*;

public class atividade6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float precoatual;
		double desconto;
		Scanner leia = new Scanner(System.in); 
		System.out.println("Informe o pre�o de um produto : R$");
		precoatual = leia.nextFloat();
		
		desconto = (precoatual *0.91);
		System.out.printf("\nO novo pre�o do produto com desconto de nove por cento � R$ %2.2f" ,desconto);
				
	}

}
