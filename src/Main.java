import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        metodos met = new metodos();
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int loop = 1;

        while (loop != 0) {

            System.out.println("escolha: \n 1-Soma \n 2-Subtração \n 3-Multiplicação \n 4-Divisão \n 5-Sair");
            int escolha = input.nextInt();

            switch (escolha) {
                case 1:

                    ArrayList<Double> lista1 = new ArrayList<Double>();

                    System.out.println("Digite o primeiro numero");
                    double escolha11 = Double.parseDouble(input2.nextLine());

                    System.out.println("Digite o segundo numero");
                    double escolha12 = Double.parseDouble(input2.nextLine());

                    lista1.add(escolha11);
                    lista1.add(escolha12);

                    met.somar(lista1);

                     break;

                case 2:
                    ArrayList<Double> lista2 = new ArrayList<Double>();

                    System.out.println("Digite o primeiro numero");
                    double escolha21 = Double.parseDouble(input2.nextLine());

                    System.out.println("Digite o segundo numero");
                    double escolha22 = Double.parseDouble(input2.nextLine());

                    lista2.add(escolha21);
                    lista2.add(escolha22);

                    met.subtracao(lista2);

                    break;

                case 3:
                    ArrayList<Double> lista3 = new ArrayList<Double>();

                    System.out.println("Digite o primeiro numero");
                    double escolha31 = Double.parseDouble(input2.nextLine());

                    System.out.println("Digite o segundo numero");
                    double escolha32 = Double.parseDouble(input2.nextLine());

                    lista3.add(escolha31);
                    lista3.add(escolha32);

                    met.multiplicacao(lista3);


                    break;

                case 4:
                    ArrayList<Double> lista4 = new ArrayList<Double>();

                    System.out.println("Digite o primeiro numero");
                    double escolha41 = Double.parseDouble(input2.nextLine());

                    System.out.println("Digite o segundo numero");
                    double escolha42 = Double.parseDouble(input2.nextLine());

                    lista4.add(escolha41);
                    lista4.add(escolha42);

                    met.divisao(lista4);


                    break;

                case 5:
                    System.out.println("bye bye");
                    loop = 0;
                    break;
            }
        }
    }
}