import java.util.Arrays;

public class Estatisticas {

    public static double calcularMedia(Double[] dados, int tamanho) {
        double soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += dados[i];
        }
        return soma / tamanho;
    }

    public static double calcularModa(Double[] dados, int tamanho) {
        double moda = dados[0];
        int maiorFrequencia = 0;

        for (int i = 0; i < tamanho; i++) {
            int frequencia = 0;
            for (int j = 0; j < tamanho; j++) {
                if (dados[i].equals(dados[j])) {
                    frequencia++;
                }
            }
            if (frequencia > maiorFrequencia) {
                maiorFrequencia = frequencia;
                moda = dados[i];
            }
        }

        return moda;
    }

    public static double calcularMediana(Double[] dados, int tamanho) {
        Double[] copia = Arrays.copyOf(dados, tamanho);
        Arrays.sort(copia);
        if (tamanho % 2 == 0) {
            return (copia[tamanho / 2 - 1] + copia[tamanho / 2]) / 2;
        } else {
            return copia[tamanho / 2];
        }
    }

    public static double calcularMaximo(Double[] dados, int tamanho) {
        double max = dados[0];
        for (int i = 1; i < tamanho; i++) {
            if (dados[i] > max) {
                max = dados[i];
            }
        }
        return max;
    }

    public static double calcularMinimo(Double[] dados, int tamanho) {
        double min = dados[0];
        for (int i = 1; i < tamanho; i++) {
            if (dados[i] < min) {
                min = dados[i];
            }
        }
        return min;
    }
}
