package feriado;

import java.util.*;

public class atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n1,n2,n3;
	Scanner leia = new Scanner(System.in);
	System.out.println("Digite um n�mero: ");
	n1 = leia.nextInt();
	n2 = (n1-1);
	n3 = (n1+1);
	System.out.print("\nVoc� digitou " +n1+ ", seu antecessor �: " +n2+ " e seu sucessor �: " +n3);
	
	}

}
