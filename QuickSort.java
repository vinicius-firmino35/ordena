public void quickSort (int v [],int ini ,int fim) {
		if (ini < fim) {
			int index_pivot = particiona(v,ini,fim);
			quickSort(v,ini,index_pivot -1);
			quickSort(v,index_pivot + 1,fim);
		}
	}
	
	public int particiona(int v[], int ini, int fim) {
		
		int pivot = v[ini];
		int i = ini;
		
		for (int j = ini + 1 ; j <= fim; j++) {
			if (v[j] <= pivot) {
				i++;
				
				int aux = v[i];
				v[i] = v[j];
				v[j] = aux;
 			}	
		}
		
		int aux = v[i];
		v[i] = v[ini];
		v[ini] = aux;
		
		return i;
		
	}
