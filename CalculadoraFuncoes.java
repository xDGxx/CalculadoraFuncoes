package aula8;

import java.util.Scanner;

public class CalculadoraFuncoes {

    static Scanner input; //atributo de classe

    public static float entradaDados() {
        System.out.println("ENTRADA DE DADOS");
        //instacia um objeto do tipo scanner
        input = new Scanner(System.in);
        System.out.println("Numero: ");
        float n = input.nextFloat();
        return n;
    }

    public static int menu() {
        System.out.println("MENU");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplição");
        System.out.println("4 - Divisão");
        input = new Scanner(System.in);
        System.out.println("Opção? ");
        int op = input.nextInt();
        return op;
    }

    public static float adicao(float n1, float n2) {
        System.out.println("ADICAO");
        return n1 + n2;
    }

    public static float subtracao(float n1, float n2) {
        System.out.println("SUBTRACAO");
        return n1 - n2;
    }

    public static float multiplicao(float n1, float n2) {
        System.out.println("MULTIPLICAÇÃO");
        return n1 * n2;
    }

    public static float divisao(float n1, float n2) {
        System.out.println("DIVISAO");
        return n1 / n2;
    }

    public static void imprimir(float result) {
        System.out.println("IMPRIMIR");
        System.out.println("Resultado: " + result);
    }

    public static float controlador(float n1, float n2, int op) {
        float result = 0;
        switch (op) {
            case 1:
                result = adicao(n1, n2);
                break;
            case 2:
                result = subtracao(n1, n2);
                break;
            case 3:
                result = multiplicao(n1, n2);
                break;
            case 4:
                result = divisao(n1, n2);
                break;     
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int op = menu();
        float n1 = entradaDados();
        float n2 = entradaDados();
        float result = controlador(n1, n2, op);
        imprimir(result);
    }
}
