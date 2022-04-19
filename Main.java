import java.util.Scanner;

public class Main {
    static Scanner myObj1 = new Scanner(System.in);

    static void atividade1() {
        System.out.println("Entre com o número fatorial");
        int fatorial = myObj1.nextInt();
        int cont = 1;

        for (int i = 1; i <= fatorial; i++) {
            cont = cont * i;
        }
        System.out.println("O fatorial de " + fatorial + " é " + cont);

    }

    static void atividade2() {
        int soma = 0;
        for (int i = 0; i < 1000; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                soma = soma + i;
            }
        }
        System.out.println("O valor da soma é " + soma);
    }

    static void atividade3() {
        double n, a1, an, somaTermos;
        System.out.println("Entre com a quantidade de termos (n)");
        n = myObj1.nextDouble();
        System.out.println("Entre com o valor inicial (a1)");
        a1 = myObj1.nextDouble();
        System.out.println("Entre com o valor final (an)");
        an = myObj1.nextDouble();
        somaTermos = (n * (a1 + an)) / 2;
        System.out.println("O valor da soma é " + somaTermos);
    }

    static void atividade4() {
        double a1, q, n, somaTermos, numeroRazao;
        numeroRazao = 1;
        System.out.println("Entre com o valor inicial (a1)");
        a1 = myObj1.nextDouble();
        System.out.println("Entre com a razão (q)");
        q = myObj1.nextDouble();
        System.out.println("Entre com a quantidade de termos (n)");
        n = myObj1.nextDouble();
        // calcular qn
        if (q >= 2) {
            for (int i = 0; i < n; i++) {
                numeroRazao = numeroRazao * q;
            }
            somaTermos = (a1 * (numeroRazao - 1)) / (q - 1);
            System.out.println("O valor da soma é " + somaTermos);
        } else {
            System.out.println("O valor de q é menor que 2. Tente novamente com um valor maior ou igual a 2");
        }
    }

    static void atividade5() {
        double valoInicial, valorFinal, velocidadeInicial, aceleracao, tempo;
        System.out.println("Entre com o espaço inicial:");
        valoInicial = myObj1.nextDouble();
        System.out.println("Entre com a velocidade inicial:");
        velocidadeInicial = myObj1.nextDouble();
        System.out.println("Entre com a aceleração:");
        aceleracao = myObj1.nextDouble();
        System.out.println("Entre com o tempo:");
        tempo = myObj1.nextDouble();
        valorFinal = valoInicial + velocidadeInicial * tempo + (aceleracao * tempo * tempo) / 2;
        System.out.println("O espaço final será: " + valorFinal);
    }

    static void verifica(int atividade) {
        if (atividade == 1) {
            atividade1();
        }
        if (atividade == 2) {
            atividade2();
        }
        if (atividade == 3) {
            atividade3();
        }
        if (atividade == 4) {
            atividade4();
        }
        if (atividade == 5) {
            atividade5();
        }
    }

    static void listaAtividades() {
        System.out.println("Entre com o programa desejado.");
        System.out.println("1 para atividade a");
        System.out.println("2 para atividade b");
        System.out.println("3 para atividade c");
        System.out.println("4 para atividade d");
        System.out.println("5 para atividade e");
        int atividade = myObj1.nextInt();
        verifica(atividade);
    }

    public static void main(String[] args) {
        listaAtividades();
    }
}