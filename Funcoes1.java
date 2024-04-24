package aula8;

import java.util.Scanner;

public class Funcoes1 {

    public static float obterMedia() { //para o usuario declarar valor
        System.out.println("Obter Media");
        Scanner input = new Scanner(System.in);
        System.out.println("Média: ");
        float media = input.nextFloat(); //esse numero será calculado como float
        return media; //peço retorno da linha acima
    }

    public static String definirStatus(float media) { //se o usuario teve uma nota pode ser aprovado ou reprovado
        System.out.println("Definir Status");
        if (media >= 6) {
            return "Aprovado";
        } else {
           return "Reprovado";
        }
    }
    
    public static void imprimir(String status) { //peço a impressão dos dados
        System.out.println("@-Imprimir@-");
        System.out.println("============");
        System.out.println("Status: "+ status); //informo qual os status do usuario
        System.out.println("============");
    }
    public static void main(String[] args) {
        System.out.println("--MAIN--");
        float media = obterMedia(); 
        String status = definirStatus(media);
        imprimir(status);
    }
}
