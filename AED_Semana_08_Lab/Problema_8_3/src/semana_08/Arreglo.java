package semana_08;

public class Arreglo {
	
	//  Atributos privados
	private int[] n;
	private int indice;
	//  Constructor
	public Arreglo() {
		n = new int[10];
		indice = 0;
	}
	//  Operaciones públicas básicas
	public int tamanio() {
		return indice;
	}
	public int obtener(int i) {
		return n[i];
	}

	//  Operaciones privadas
	private void ampliarArreglo() {
		int[] aux = n;
		n = new int[indice + 10];
		for (int i=0; i<indice; i++)
			n[i] = aux[i];
	}
	public void adicionar(int numero) {
		if (indice == n.length)
			ampliarArreglo();
		n[indice] = numero;
		indice ++;
	}
	
	private void intercambiar (int pos1, int pos2) {
		int aux =  n[pos1];
		n[pos1] = n[pos2];
		n[pos2] = aux;
	}
	public void mandarInicio() {
		for(int i=indice-1; i>0; i--) {
			intercambiar (i,i-1);
		}
	}
	public void adicionarYreubicar(int numero) {
		adicionar(numero);
		if(numero%2 == 0) {
			mandarInicio();
		}
	}
}
