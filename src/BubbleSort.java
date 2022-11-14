
public class BubbleSort implements IAlgoritmoOrdencao {

	@Override
	public int[] ordenarVetor(int[] vetor) {
		boolean trade;
		
		do {
			trade = false;
		
			for(int i = 0; i < vetor.length -1; i++) {
				if(vetor[i] > vetor[i+ 1]) {
					int aux = vetor[i];
					vetor[i] = vetor [i+1];
					vetor[i+1] = aux;
					trade = true;
				}
			}
		}while(trade);
		return vetor;
	}
	
	
}
