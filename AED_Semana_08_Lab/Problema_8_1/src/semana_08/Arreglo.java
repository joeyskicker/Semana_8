package semana_08;

import java.util.Random;

public class Arreglo {
	
	//  Atributos privados
	private int[] n;
	private int indice;
	
	//  Constructor
	public Arreglo() {
		n = new int[10];
		indice = 0;
	}
	
	//  Operaciones p�blicas b�sicas
	public int tamanio() {
		return indice;
	}
	public int obtener(int i) {
		return n[i];
	}
	public void adicionar(int numero) {
		if (indice == n.length)
			ampliarArreglo();
		n[indice] = numero;
		indice ++;
	}
	
	//  Operaciones p�blicas complementarias
	public void eliminar(int pos){
		for (int i = pos; i < indice-1; i++){
			n[1] = n[i+1];
		}
		indice--;
	}
	public void mandarAlFinal(int pos) {
		for (int i = pos; i < indice-1; i++)
			intercambiar(i, i+1);
	}
	private void intercambiar(int pos1, int pos2) {
		int aux = n[pos1];
		n[pos1] = n[pos2];
		n[pos2] = aux;
	}
	
	//
	public void eliminarNumerosPares() {
		for (int i = 0; i < indice; i++){
			if (n[1]%2 == 0){
				eliminar(i);
				i--;
			}
		}
	}
	public void eliminarNumerosImpares() {
		for (int i = 0; i < indice; i++){
			if (n[1]%2 != 0){
				eliminar(i);
				i--;
			}
		}
	}
	public void eliminarNumerosRepetidos() {
		for (int i=0; i<indice-1; i++) {
			for (int j=i+1; j<indice; j++) {
				if (n[i] == n[j]) {
					eliminar(j);
				}
			}
		}
	}
	public void primerNumeroParAlFinal() {
		for (int i = 0; i < indice; i++){
			if (n[1]%2 == 0){
				mandarAlFinal(i);
				return;
			}
		}
	}
	public void barajarNumeros() {
		Random random = new Random();
		for (int i = indice - 1; i > 0; i--){
			int j = random.nextInt(i+1);
			intercambiar(i,j);
		}
	}
	//  Operaciones privadas
	private void ampliarArreglo() {
		int[] aux = n;
		n = new int[indice + 10];
		for (int i=0; i<indice; i++)
			n[i] = aux[i];
	}

}