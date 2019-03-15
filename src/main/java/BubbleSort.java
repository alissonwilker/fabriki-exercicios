
public class BubbleSort
{
   
    public static int[] Ordernar(int[] vetor)
    {
        //Variável auxiliar que irá armazenar temporariamente um valor do vetor
        int numeroAuxiliar = 0;
        //Variável para informar se houve alguma troca no algoritmo, caso não houver troca significa que o vetor já está ordenado, então não precisamos continuar o processamento.
        bool trocou = false;

        // i determina o número de etapas para a ordenação
        for (int i = 0; i < vetor.Length - 1; i++) 
        {
            trocou = false;

            // j determina o número de comparações em cada etapa e os índices a serem pesquisados para a comparação. 
            for (int j = 0; j < vetor.Length - (i + 1); j++)
            {
                if (vetor[j] > vetor[j + 1])
                {
                    trocou = true;
                    numeroAuxiliar = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = numeroAuxiliar;
                }
            }

            //Se não houve troca podemos parar a execução do algoritmo de ordenação para evitarmos o processamento desnecessário
            if (!trocou)
                break;
        }

        return vetor;
    }
