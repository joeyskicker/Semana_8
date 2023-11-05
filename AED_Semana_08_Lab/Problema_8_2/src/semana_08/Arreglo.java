package semana_08;

public class Arreglo {

	// Atributos privados
	private int[] n;
	private int indice;

	// Constructor
	public Arreglo() {
		n = new int[10];
		indice = 0;
	}

	// Operaciones p�blicas b�sicas
	public int tamanio() {
		return indice;
	}

	public int obtener(int i) {
		return n[i];
	}

	// Operaciones privadas
	private void ampliarArreglo() {
		int[] aux = n;
		n = new int[indice + 10];
		for (int i = 0; i < indice; i++)
			n[i] = aux[i];
	}

	public void adicionar(int numero) {
		if (indice == n.length)
			ampliarArreglo();
		n[indice] = numero;
		indice++;
	}
	
	private void intercambiar(int pos1, int pos2) {
		int aux = n[pos2];
		n[pos1] = n[pos2];
		n[pos2] = aux;
	}

	private void ordenar() {
		for (int i = 0; i < indice - 1; i++)
			for (int j = i + 1; j < indice; j++)
				if (n[i] > n[j])
					intercambiar(i, j);
	}

	private int buscar(int numero) {
		for (int i = 0; i < indice; i++) {
			if (n[i] == numero) {
				return -1;
			}
		}
		return numero;
	}

	public void adicionarDistintoYordenar(int numero) {
		if (buscar(numero) != -1) {
			adicionar(numero) ;
		}
				ordenar();
			}
		
	}



