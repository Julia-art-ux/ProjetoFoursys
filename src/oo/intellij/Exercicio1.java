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
//exercicio13();
//exercicio14();
//exercicio15();
//exercicio16();
//exercicio17();
//exercicio18();
//exercicio19();
//exercicio20();
//exercicio21();
//exercicio22();
//exercicio23();
//exercicio24();
//exercicio25();
//exercicio26();
//exercicio27();
//exercicio28();
//exercicio29();
//exercicio30();
//exercicio31();
//exercicio32();
//exercicio33();
//exercicio34();
//exercicio35();
// exercicio36();
// exercicio37();
        exercicio38();
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
        float calculo = ((fahrenheit - 32) * 5) / 9;
        System.out.println("O resultado da conversão de Fahrenheit para Celsius é:" + calculo);

    }

    public static void exercicio24() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da nota 1:");
        double n1 = scan.nextDouble();
        System.out.println("Digite o valor da nota 2:");
        double n2 = scan.nextDouble();
        System.out.println("Digite o valor da nota 3:");
        double n3 = scan.nextDouble();
        double mediafinal = ((n1 * 2 + n2 * 3 + n3 * 5) / 10);
        System.out.printf("A média final do aluno é:" + mediafinal);

    }

    public static void exercicio25() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor em reais para abastecer:");
        double valordinheiro = scan.nextDouble();
        System.out.println("Digite o preço da gasolina:");
        double preçogasolina = scan.nextDouble();
        double litrostotais = valordinheiro / preçogasolina;
        double valorpagamento = litrostotais * preçogasolina;
        System.out.println("Consegui colocar no tanque esta quantidade em Litros de gasolina:" + litrostotais);
        System.out.println("O valor a ser pago é:" + valorpagamento);

    }

    public static void exercicio26() {//////////////////////////////////

    }

    public static void exercicio27() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de camisetas tamanho P:");
        double quantidadeP = scan.nextDouble();
        System.out.println("Informe a quantidade de camisetas tamanho M:");
        double quantidadeM = scan.nextDouble();
        System.out.println("Informe a quantidade de camisetas tamanho G:");
        double quantidadeG = scan.nextInt();
        double totalcamisetas = +quantidadeP + quantidadeM + quantidadeG;

        double precop = 10 * quantidadeP;
        double precom = 12 * quantidadeM;
        double precog = 15 * quantidadeG;
        double totalpagar = precop + precom + precog;

        System.out.printf("A quantidade total de camisetas são %.0f", totalcamisetas);
        System.out.printf("\nO Preço total a pagar é %.0f reais", totalpagar);


    }

    public static void exercicio30() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor Grau Celcius:");
        double celcius = scan.nextDouble();
        double conversao = (celcius * 9 / 5) + 32;
        System.out.printf("Grau fahreinheit:" + conversao + "Fahreinheit");

    }

    public static void exercicio31() {

        Scanner scan = new Scanner(System.in);
        System.out.printf("Informe a quantidade de frangos:");
        int numfrango = scan.nextInt();
        int chipidentificacao = numfrango * 4;
        System.out.printf("O valor do chip de identificão é:" + chipidentificacao);
        double chipalimentacao = numfrango * 3.50;
        System.out.printf("\nO valor total do chip alimentação é:" + chipalimentacao);
        double gastototal = chipalimentacao + chipidentificacao;

        System.out.printf("\nO gasto total da Granja Frangotech é:" + gastototal + "reais");
    }

    public static void exercicio32() {


    }

    public static void exercicio33() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade total de 5 centavos:");
        double centavos5 = scan.nextDouble();
        System.out.println("Informe a quantidade total de 10 centavos:");
        double centavos10 = scan.nextDouble();
        System.out.println("Informe a quantidade total de 25 centavos:");
        double centavos25 = scan.nextDouble();
        System.out.println("Informe a quantidade total de 50 centavos:");
        double centavos50 = scan.nextDouble();
        System.out.println("Informe a quantidade total de 1 real em centavos:");
        double centavos1 = scan.nextDouble();

        double valor5 = centavos5 * 0.05;
        double valor10 = centavos10 * 0.10;
        double valor25 = centavos25 * 0.25;
        double valor50 = centavos50 * 0.50;
        double valor1 = centavos1 * 1.0;

        double somatotal = (valor5 + valor10 + valor25 + valor1 + valor50);

        System.out.println(somatotal);

    }


    public static void exercicio35() {

        Scanner scan = new Scanner(System.in);


        System.out.println("Digite seu ano de Nascimento:");
        int anonascimento = scan.nextInt();
        System.out.println("Digite seu ano atual:");
        int anoatual = scan.nextInt();

        int idadeanos = anoatual - anonascimento;
        System.out.println("Sua idade em anos é:" + idadeanos);
        int idademeses = idadeanos * 12;
        System.out.println("Sua idade em meses é:" + idademeses);
        int idadedias = idadeanos * 365;
        System.out.println("Sua idade em dias é:" + idadedias);
        int idadesemanas = idadeanos * 52;
        System.out.println("Sua idade em semanas é:" + idadesemanas);

    }

    public static void exercicio36() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int x = scan.nextInt();
        if (x > 10) {
            System.out.println("É maior que 10");
        } else {
            System.out.println("Não é maior que 10");
        }

    }

    public static void exercicio37() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int x = scan.nextInt();
        if (x >= 0) {
            System.out.println("Valor Positivo");
        } else {
            System.out.println("Valor Negativo");
        }
    }

    public static void exercicio38() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de maças compradas:");
        int x = scan.nextInt();

        if (x < 12) {
            System.out.println("O preço unitário das maças são R$1,30");
            double valortotal = x * 1.30;
            System.out.printf("O valor total a ser pago é :" + valortotal);
        }
           else if (x==12){
            System.out.println("O preço unitário das maças são R$1,00");
            double valorfinal = x * 1.00;
            System.out.println("O valor final a ser pago é :" + valorfinal);
        }
    }
}
