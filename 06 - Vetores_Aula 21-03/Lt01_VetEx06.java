/*
Objetivo:		Criar e coletar em um vetor[20]. Classificar este vetor em ordem crescente.
Programador:	Kesia Amanda
Data: 			21/03/2019
*/

import javax.swing.JOptionPane;

public class Lt01_VetEx06 {
	public static void main (String[] args) {
		int valorBusca;
		int vetValores[] = new int[20];
		lerValores(vetValores);
		classValores(vetValores);
		mostraOrdem(vetValores);
		valorBusca = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para busca:"));
		JOptionPane.showMessageDialog(null, BuscaValor(valorBusca,19,vetValores[]));
		
		
	}
	
	static int[] lerValores(int vet[]) {
		for (int cont=0;cont<=19;cont++) {
			vet[cont]=Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(cont+1)+"� valor:"));
		}
		return vet;
	}
	
	static int[] classValores(int vet[]) {
		int i;
		for (int cont=0;cont<=18;cont++) {
			for (int aux=(cont+1);aux<=19;aux++) {
				if (vet[cont]>=vet[aux]) {
					i = vet[cont];
					vet[cont] = vet[aux];
					vet[aux] = i;
				}
			}
		}
		return vet;
	}
	
	static void mostraOrdem(int vet[]) {
		String result = "Vetor em Ordem: ";
		for (int cont=0;cont<=19;cont++) {
			result+= vet[cont]+" ";
		}
		JOptionPane.showMessageDialog(null, result);
	}
	
	static String BuscaValor(int busca, int maior, int vet[]) {
		int meio , menor = 0; string result;
		do {
			meio = (menor+maior)/2;
			if (valorBusca==vetValores[meio]) {
				return result = ("Valor encontrado!");
			}else if (valorBusca>vetValores[meio]) {
				menor=meio+1;
			}else if (valorBusca<vetValores[meio]){
				maior=meio-1;
			}
		}while(maior>menor);
		return result = ("Valor n�o encontrado!");
	}
}
