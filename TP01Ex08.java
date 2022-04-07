/*Nomes: Eduarda Vitória Cunha Matias e Rafael de Oliveira Fonseca 

8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e 
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.*/

package exercicios;

import java.util.Scanner;

public class TP01Ex08 {
	public static void main(String[] args) {
		
		 double mm /*milha marítima*/, quilometros;
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("Digite um valor em milha marítima: ");
		 mm = scan.nextDouble();
		 
		 quilometros = mm * 1.852;
		 
		 System.out.println(mm + " milha(s) marítima(s) equivale(m) a " + quilometros + " quilometros.");
		 
		 scan.close();
	}
}
