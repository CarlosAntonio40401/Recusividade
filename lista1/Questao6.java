package lista1;

import java.util.Arrays;


public class Questao6 {

    public static void main(String[] args) {
        int[] vet = {1, 20, 2, 6, 56, 8, 9, 6, 4, 5, 2, 3, 4, 9, 6, 11, 66, 98, 37, 4, 5};
        inverteVetor(vet, 0, vet.length - 1);
        System.out.println(Arrays.toString(vet));
    }

    private static void inverteVetor(int[] vet, int i, int j) {
        if (i < j) {
            trocar(vet, i, j);
            inverteVetor(vet, i + 1, j - 1);
        }
    }

    private static void trocar(int[] vet, int i, int j) {
        int aux = vet[i];
        vet[i] = vet[j];
        vet[j] = aux;
    }

}
