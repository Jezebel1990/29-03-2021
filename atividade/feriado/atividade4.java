package feriado;

import java.util.*;

public class atividade4 {
	
	public static void main(String[] args) {
	
	int num1,num2,num3 ,media;
	
	Scanner leia = new Scanner(System.in);
   System.out.println("Entre com o primeiro n�mero: ");
   num1 = leia.nextInt();
   System.out.println("Entre com o segundo n�mero: ");
   num2 = leia.nextInt();
   System.out.println("Entre com o terceiro n�mero: ");
   num3 = leia.nextInt();
   
   media = (num1+num2+num3)/3;
   
   System.out.println("\nM�dia aritm�tica:"+media); 
  } 
}




