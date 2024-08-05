import java.util.Arrays;
import java.util.Random;


public class vetores {
    public static void main(String args[]) {
        int[] vetor = new int[10];
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100); 
        }
        
        System.out.println("Vetor original: " + Arrays.toString(vetor));
        
        for (int i = vetor.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = temp;
        }
        
        System.out.println("Vetor embaralhado: " + Arrays.toString(vetor));
        
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j+1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
            }
        }
        
        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
        
    }
}


