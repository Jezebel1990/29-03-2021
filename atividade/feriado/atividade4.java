package feriado;

import java.util.*;

public class atividade4 {
	
	public static void main(String[] args) {
	
	int num1,num2,num3 ,media;
	
	Scanner leia = new Scanner(System.in);
   System.out.println("Entre com o primeiro número: ");
   num1 = leia.nextInt();
   System.out.println("Entre com o segundo número: ");
   num2 = leia.nextInt();
   System.out.println("Entre com o terceiro número: ");
   num3 = leia.nextInt();
   
   media = (num1+num2+num3)/3;
   
   System.out.println("\nMédia aritmética:"+media); 
  } 
}




