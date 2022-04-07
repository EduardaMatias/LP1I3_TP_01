/*Nomes: Eduarda Vitória Cunha Matias e Rafael de Oliveira Fonseca 

9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.*/

package exercicios;

import java.util.Scanner;

public class TP01Ex09 {
	public static void main(String[] args) {

		double resistencia, corrente, tensao;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor da resistência: ");
		resistencia = scan.nextDouble();
		System.out.print("Digite o valor da corrente elétrica: ");
		corrente = scan.nextDouble();
		
		tensao = resistencia * corrente;
		
		System.out.println("A tensão do circuito eletrônico é igual a " + tensao);
		
		scan.close();
	}
}
