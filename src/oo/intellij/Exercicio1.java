package oo.intellij;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
//	exercicio1();
//	exercico2();
//  exercicio3();
// exercicio4();
// exercicio5();
// exercicio6();
    exercicio7();

    }

    public static void exercicio1() {
        // write your code here
        String nome = "Julia";
        long telefone = 975527995;
        String cidade = "Santana de Parnaíba";

        System.out.printf("%s seu número de celular é %d e você mora na cidade de %s.", nome, telefone, cidade);
    }

    public static void exercico2() {
        int idade = 24;
        double altura = 1.58;
        double peso = 90.5;

        System.out.printf(" Idade:%d\n Altura:%.2f\n Peso:%.2fkg", idade, altura, peso);
    }

    public static void exercicio3() {
        double salario = 1.500;
        double valerefeicao = 500;

        System.out.printf(" O meu Salario é %.4f reais e meu vale-refeição é %.0f reais", salario, valerefeicao);

    }

    public static void exercicio4() {

        String nome = "Julia Cristina do Nascimento";
        long telefone = 11975527995;
        String cidade = "Santana de Parnaíba";

        System.out.printf("Nome:%s\nTelefone:%d\nCidade:%s", nome, telefone, cidade);

    }

    public static void exercicio5() {

        int idade = 51;
        double altura = 1.80;
        double peso = 110;
        System.out.printf("Idade:%danos\nAltura:%.2fcm\nPeso=%.0fkg", idade, altura, peso);

    }

    public static void exercicio6() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scan.nextLine();

        System.out.println("Digite seu celular:");
        String celular = scan.nextLine();

        System.out.println("Digite sua cidade:");
        String cidade = scan.nextLine();

        scan.close();
    }
    public static void exercicio7(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua Idade:");
        String idade = scan.nextLine();

        System.out.println("Digite  sua Altura:");
        double altura =scan.nextDouble();

        System.out.println("Digite seu Peso:");
        double peso = scan.nextDouble();

    }
}