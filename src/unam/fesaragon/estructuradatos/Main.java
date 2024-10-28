package unam.fesaragon.estructuradatos;

import java.util.Arrays;

public class Main {

    public static int[] mergeSort(int[] data) {
        if (data.length > 1) {
            int mitad = data.length / 2;

            int[] izquierda = Arrays.copyOfRange(data, 0, mitad);
            int[] derecha = Arrays.copyOfRange(data, mitad, data.length);

            mergeSort(izquierda);
            mergeSort(derecha);

            int i = 0, d = 0, k = 0;
            while (i < izquierda.length && d < derecha.length) {
                if (izquierda[i] < derecha[d]) {
                    data[k] = izquierda[i];
                    i++;
                } else {
                    data[k] = derecha[d];
                    d++;
                }
                k++;
            }

            while (i < izquierda.length) {
                data[k] = izquierda[i];
                i++;
                k++;
            }

            while (d < derecha.length) {
                data[k] = derecha[d];
                d++;
                k++;
            }
        }
        return data;
    }
    public static void main(String[] args) {
        System.out.println(".-.-.-.-.-.- PROBANDO MERGE --.-.-.-.-");
        int[] info = {87, 345, 3, 100, 35, 82, 4, 1, 67, 23};
        System.out.println(Arrays.toString(mergeSort(info)));
    }

}
