/*Nomes: Eduarda Vit�ria Cunha Matias e Rafael de Oliveira Fonseca 

8. Sabendo que uma milha mar�tima equivale a um mil, oitocentos e cinquenta e 
dois metros e que um quil�metro possui mil metros, fazer um programa para
converter milhas mar�timas em quil�metros.*/

package exercicios;

import java.util.Scanner;

public class TP01Ex08 {
	public static void main(String[] args) {
		
		 double mm /*milha mar�tima*/, quilometros;
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("Digite um valor em milha mar�tima: ");
		 mm = scan.nextDouble();
		 
		 quilometros = mm * 1.852;
		 
		 System.out.println(mm + " milha(s) mar�tima(s) equivale(m) a " + quilometros + " quilometros.");
		 
		 scan.close();
	}
}
