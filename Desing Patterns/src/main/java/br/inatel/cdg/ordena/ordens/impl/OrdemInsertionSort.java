package br.inatel.cdg.ordena.ordens.impl;

import br.inatel.cdg.ordena.Ordem;

public class OrdemInsertionSort implements Ordem {

	@Override
	public int[] ordenando(int[] vetor) {
		int j;
		int key;
		int i;

		for (j = 1; j < vetor.length; j++)
		{
			key = vetor[j];
			for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
			{
				vetor[i + 1] = vetor[i];
			}
			vetor[i + 1] = key;
		}
		return vetor;
	}
}