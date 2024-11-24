package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salMin = 450;
        double salInicial, aux, salFinal, valor;
        int cont, nht, codigo;
        String turno, categoria;

        for (cont = 1; cont <= 10; cont++) {
            System.out.print("Digite o código, o número de horas trabalhadas, o turno (M, V ou N) e a categoria (G ou O): ");
            codigo = scanner.nextInt();
            nht = scanner.nextInt();
            turno = scanner.next();
            categoria = scanner.next();

            while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N")) {
                System.out.print("Turno inválido. Digite novamente (M, V ou N): ");
                turno = scanner.next();
            }

            while (!categoria.equals("G") && !categoria.equals("O")) {
                System.out.print("Categoria inválida. Digite novamente (G ou O): ");
                categoria = scanner.next();
            }

            if (categoria.equals("G")) {
                if (turno.equals("N")) {
                    valor = salMin * 18 / 100.0;
                } else {
                    valor = salMin * 15 / 100.0;
                }
            } else {
                if (turno.equals("N")) {
                    valor = salMin * 13 / 100.0;
                } else {
                    valor = salMin * 10 / 100.0;
                }
            }

            salInicial = nht * valor;

            if (salInicial <= 300) {
                aux = salInicial * 20 / 100.0;
            } else if (salInicial < 600) {
                aux = salInicial * 15 / 100.0;
            } else {
                aux = salInicial * 5 / 100.0;
            }

            salFinal = salInicial + aux;

            System.out.println("Código: " + codigo + ", NHT: " + nht + ", Valor por hora: " + valor + ", Salário inicial: " + salInicial + ", Auxílio: " + aux + ", Salário final: " + salFinal);
        }
    }
}
