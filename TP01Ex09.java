/*Nomes: Eduarda Vit�ria Cunha Matias e Rafael de Oliveira Fonseca 

9. Calcular e exibir a tens�o de um determinado circuito eletr�nico a partir dos
valores da resist�ncia e corrente el�trica que ser�o digitados. Utilize a lei de Ohm.*/

package exercicios;

import java.util.Scanner;

public class TP01Ex09 {
	public static void main(String[] args) {

		double resistencia, corrente, tensao;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor da resist�ncia: ");
		resistencia = scan.nextDouble();
		System.out.print("Digite o valor da corrente el�trica: ");
		corrente = scan.nextDouble();
		
		tensao = resistencia * corrente;
		
		System.out.println("A tens�o do circuito eletr�nico � igual a " + tensao);
		
		scan.close();
	}
}
