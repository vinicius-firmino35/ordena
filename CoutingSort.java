public static int[] countingSort(int[] A, int k) {
	    
        int[] C = new int[k];

        // frequência
        for (int i = 0; i < A.length; i++) {
            C[A[i] - 1] += 1;
        }
        
        // cumulativa
        for (int i = 1; i < C.length; i++) {
            C[i] += C[i-1];
        }

        int[] B = new int[A.length];

        for (int i = A.length - 1; i >= 0; i--) {
            B[C[A[i] - 1] -1] = A[i];
            C[A[i] - 1] -= 1;
        }

        return B;
    
}
