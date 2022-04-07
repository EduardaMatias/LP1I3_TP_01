/*Nomes: Eduarda Vitória Cunha Matias e Rafael de Oliveira Fonseca 

17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o 
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.*/

import java.util.Scanner;

public class TP01Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor de X: ");
        double X = scan.nextDouble();
        System.out.print("Digite o valor de Y: ");
        double Y = scan.nextDouble();
        System.out.println("X ^ Y = " + Math.round(Math.pow(X, Y) * 100.0) / 100.0);
        scan.close();
    }
}