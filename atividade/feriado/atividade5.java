package feriado;

import java.util.*;

public class atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double saldo, reajuste;
		
		Scanner leia = new Scanner(System.in); 
		System.out.println("Informe seu saldo: R$");
		saldo = leia.nextDouble();
		
    reajuste = (saldo * 101)/100;
	System.out.printf("\nO saldo com reajuste de um por cento é de R$ %2.2f" ,reajuste);

	}

}
