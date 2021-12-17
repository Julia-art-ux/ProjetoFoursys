package oo.intellij;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
//exercicio1();
//exercico2();
//exercicio3();
//exercicio4();
//exercicio5();
//exercicio6();
//exercicio7();
//exercicio8();
//exercicio9();
//exercicio10();
//exercicio11();
//exercicio12();
// exercicio13();
//exercicio14();
//exercicio15();
// exercicio16();
// exercicio17();
// exercicio18();
//exercicio19();
// exercicio20();
// exercicio21();
// exercicio22();
exercicio23();
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
        Long celular = 11975527995l;
        String cidade = "Santana de Parnaíba";

        System.out.printf("Nome:%s\nTelefone:%d\nCidade:%s", nome, celular, cidade);

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

    public static void exercicio7() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua Idade:");
        String idade = scan.nextLine();

        System.out.println("Digite  sua Altura:");
        double altura = scan.nextDouble();

        System.out.println("Digite seu Peso:");
        double peso = scan.nextDouble();

    }

    public static void exercicio8() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu Salário:");
        double salario = scan.nextDouble();
        System.out.print("Digite seu Vale-Refeição:");
        double valerefeicao = scan.nextDouble();
        System.out.printf("Seu Salário é %.0f e seu Vale-Refeição é %.0f", salario, valerefeicao);

    }

    public static void exercicio9() { ///Soma

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de X:");
        int x = scan.nextInt();
        System.out.println("Digite o valor de Y:");
        int y = scan.nextInt();
        int soma = x + y;

        System.out.printf("O resultado da soma entre a variável x e y é igual a:" + soma);
    }

    public static void exercicio10() { ///Subtração

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de X:");
        int x = scan.nextInt();
        System.out.println("Digite o valor de Y:");
        int y = scan.nextInt();
        int subtracao = x - y;

        System.out.printf("O resultado da substração entre a variável x e y é igual a:" + subtracao);
    }

    public static void exercicio11() {///Multiplicação

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de x:");
        int x = scan.nextInt();
        System.out.println("Digite o valor de y:");
        int y = scan.nextInt();
        int multi = x * y;

        System.out.printf("O resultado da multiplicação entre a variavel x e y é igual a:" + multi);

    }

    public static void exercicio12() {///Divisão

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de x:");
        int x = scan.nextInt();
        System.out.println("Digite o valor de y:");
        int y = scan.nextInt();
        int div = x / y;

        System.out.printf("O resultado da divisão entre a variável x e y é igual a:" + div);

    }

    public static void exercicio13() {///Exponenciação(Potência)

        double x = 8;
        double y = 2;
        double pon = Math.pow(x, y);

        System.out.printf("O resultado da exponencição entre a variavel x e y é igual a:" + pon);
    }

    public static void exercicio14() {///Modulo(Resto)
        int x = 256;
        int y = 2;
        double resto = Math.floorMod(x, y);

        System.out.printf("O resultado do Resto da divisão entre a variável x e y é igual a:" + resto);

    }

    public static void exercicio15() {//Antecessor da Variável

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de x:");
        int x = scan.nextInt();
        int antecessor = x - 1;

        System.out.printf("O resultado do Antecessor da variável x é igual a:" + antecessor);
    }

    public static void exercicio16() {///Área do Retangulo

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da Base:");
        double Base = scan.nextDouble();
        System.out.println("Digite o valor da Altura:");
        double Altura = scan.nextDouble();
        double Resultado = Base * Altura;

        System.out.println("A área Total do Retangulo é:" + Resultado);
    }

    public static void exercicio17() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();
        System.out.println("Digite quantos meses:");
        int meses = scan.nextInt();
        System.out.println("Digite quantos dias:");
        int dias = scan.nextInt();

        int idadeAno = idade * 365;
        int idademes = meses * 30;
        int idadedia = dias;

        int DiasTotaisdeVida = idadeAno + idademes + idadedia;

        System.out.printf("Sua Idade total em dias vividos são:" + DiasTotaisdeVida);

    }

    public static void exercicio18() {

    }

    public static void exercicio19() {

        Scanner scan = new Scanner(System.in);
        {
            System.out.println("Digite o valor do salário atual:");
            double x = scan.nextDouble();
            System.out.println("Digite o valor do percentual:");
            double y = scan.nextDouble();
            double valorpercentual = (x * y) / 100;
            System.out.println("O valor total do percentual é:" + valorpercentual);
            double salarionovo = x + valorpercentual;
            System.out.printf("O novo salario:" + salarionovo);

        }

    }

    public static void exercicio20() {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite o valor do Dolar:");
        double dolar = scan.nextDouble();
        double ConvReais = dolar * 6.61;
        System.out.printf("O valor convertido de Dolar para Real:" + ConvReais);
    }

    public static void exercicio21() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o Custo de Fábrica:");
        double custofabrica = scan.nextDouble();
        double impostos = 0.45;
        double Distribuidor = 0.28;
        double custoimpostos = custofabrica * 0.45;
        double custodistribuidor = custofabrica * 0.28;
        double custofinal = custoimpostos + custodistribuidor + custofabrica;
        System.out.println("O Valor dos Impostos sobre Custo de Fábrica:" + custoimpostos);
        System.out.println("0 Valor do Distribuidor sobre o Custo de Fábrica:" + custodistribuidor);
        System.out.println("O Custo Final do Carro novo é:" + custofinal);

    }

    public static void exercicio22() {


    }


    public static void exercicio23() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o grau Fahrenheit:");
        float fahrenheit = scan.nextFloat();
        float calculo = ((fahrenheit - 32)*5)/9;
        System.out.println("O resultado da conversão de Fahrenheit para Celsius é:"+ calculo);

    }
}



