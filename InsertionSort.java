public static void insertionSort(int[] v) {
		for(int i = 1; i< v.length; i++) {
			int j = i;
			
			while (j > 00 && v[j] < v[j-1]) {
				int aux = v[j];
				v[j] = v[j-1];
				v[j-1] = aux;
				j--;
				
			}
						
		}
	}
