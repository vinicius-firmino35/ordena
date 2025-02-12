public static int[] mergeOrdenadosDistintos(int[] a, int[] b) {
	    int[] helper = new int[a.length + b.length];

	    int i = 0; 
	    int j = b.length - 1; 
	    int k = 0; 

	    while (i < a.length && j >= 0) {
	        if (a[i] <= b[j]) {
	            helper[k++] = a[i++];
	        } else {
	            helper[k++] = b[j--];
	        }
	    }
	    
	    while (i < a.length) {
	        helper[k++] = a[i++];
	    }
	    
	    while (j >= 0) {
	        helper[k++] = b[j--];
	    }

	    return helper;	
}
	
	public static void sort(int[] v, int ini, int fim) {
        if (ini < fim) {
            int meio = (ini + fim) / 2;

            // Recursivamente ordena a metade esquerda
            sort(v, ini, meio);

            // Recursivamente ordena a metade direita
            sort(v, meio + 1, fim);

            // Mescla as duas metades ordenadas
            merge(v, ini, meio, fim);
        }
    }
	
	public static void merge(int[] v, int ini, int meio, int fim) {
        int n1 = meio - ini + 1;
        int n2 = fim - meio;

        // Arrays temporários para armazenar as metades
        int[] esquerda = new int[n1];
        int[] direita = new int[n2];

        // Copia os elementos para os arrays temporários
        for (int i = 0; i < n1; i++) {
            esquerda[i] = v[ini + i];
        }
        for (int j = 0; j < n2; j++) {
            direita[j] = v[meio + 1 + j];
        }

        // Índices para percorrer os arrays temporários
        int i = 0;
        int j = 0;
        int k = ini;

        // Mescla as duas metades ordenadas
        while (i < n1 && j < n2) {
            if (esquerda[i] <= direita[j]) {
                v[k++] = esquerda[i++];
            } else {
                v[k++] = direita[j++];
            }
        }

        // Copia os elementos restantes de 'esquerda', se houver
        while (i < n1) {
            v[k++] = esquerda[i++];
        }

        // Copia os elementos restantes de 'direita', se houver
        while (j < n2) {
            v[k++] = direita[j++];
        }
    }
