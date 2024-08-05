public class pesquisabinária {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] vetor = {1, 3, 5, 7, 9, 11, 13, 15};
        int elemento = 7;
        
        int posicao = pesquisaBinaria(vetor, elemento);
        
        if (posicao == -1) {
            System.out.println("Elemento não encontrado!");
        } else {
            System.out.println("Posição do elemento: " + posicao);
        }
    }
    
    public static int pesquisaBinaria(int[] vetor, int elemento) {
        int esquerda = 0;
        int direita = vetor.length - 1;
        int meio;
        int contador = 0;
        
        while (esquerda <= direita) {
            meio = (esquerda + direita) / 2;
            
            if (vetor[meio] == elemento) {
                contador++;
                System.out.println("Quantidade de pesquisas realizadas: " + contador);
                return meio;
            } else if (vetor[meio] < elemento) {
                contador++;
                esquerda = meio + 1;
            } else {
                contador++;
                direita = meio - 1;
            }
        }
        
        return -1;
    }
}

