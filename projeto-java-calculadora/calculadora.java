import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        double x, y;
        funcoes funcoes = new funcoes();

        System.out.println("Qual operação você quer realizar na calculadora?");

        System.out.println("1-Somar");
        System.out.println("2-Subtrair");
        System.out.println("3-Divisao");
        System.out.println("4-Multiplicar");
        System.out.println("5-Sair");
        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();
        System.out.println("Me informe os valores que serão usados");
        System.out.println("Valor de X");
        x = sc.nextInt();
        System.out.println("Valor de Y");
        y = sc.nextInt();

        switch (res) {
            case 1:
                double Somar = funcoes.somar(x, y);
                System.out.println("Resultado: " + Somar);
                break;
            case 2:
                double Subtracao = funcoes.subtracao(x, y);
                System.out.println("Resultado: " + Subtracao);
                break;
            case 3:
                double Divisao = funcoes.divisao(x, y);
                System.out.println("Resultado: " + Divisao);
                break;
            case 4:
                double Multiplicacao = funcoes.multiplicacao(x, y);
                System.out.println("Resultado: " + Multiplicacao);
                 if(){
                     System.out.println("Resultado da divisão de X / Y" + multiplicacao);
                 }else{
                        System.out.println("Impossível dividor por 0");
                 }
                break;
        }

    }

}