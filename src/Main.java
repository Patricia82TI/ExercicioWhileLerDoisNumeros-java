import java.util.Scanner;

//Faça um programa que leia dois números e imprima todos os números inteiros entre eles
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o limite inferior:");
        int limiteInferior = sc.nextInt();
        System.out.println("Digite o limite superior:");
        int limiteSuperior = sc.nextInt();

        int i = limiteInferior + 1;
        while(i < limiteSuperior){
            System.out.println(i);
            i++;
        }

    }
}