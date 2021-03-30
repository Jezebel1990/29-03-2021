package feriado;

import java.util.*;

public class atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float valor = 0,reajuste;
		
		
	    try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Digite qualquer valor do teclado: ");
			valor = leia.nextFloat();
		}
	    reajuste = (valor * 110)/100;
		System.out.printf("\nValor com dez por cento de  reajuste:  %2.2f" ,reajuste);
	}

}
