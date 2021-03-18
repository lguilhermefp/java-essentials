package atividade_b2_5;

import java.util.Random;

public class E6_AlgoritmosOrdenacao {
    public static void bubbleSort(int[] a) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    private static void merge(int[] array, int left, int mid, int right) {
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        int leftArray[] = new int [lengthLeft];
        int rightArray[] = new int [lengthRight];

        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left+i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid+i+1];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i < right + 1; i++) {
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
    public static void mergeSort(int[] array, int start, int end) {
        if (end <= start) return;
        int mid = (start+end)/2;
        mergeSort(array, start, mid);
        mergeSort(array, mid+1, end);
        merge(array, start, mid, end);
    }
    
    static int tamanhoVetor = 1000;
	static int A[] = new int[tamanhoVetor];
	
	static int[] CriaçãoArrays(int intervalo) {
		Random rand = new Random();
	    int sinal = 0;
	    
//	    System.out.println("Vetor:");
	    
	    for(int i=0; i<tamanhoVetor; i++) {
	    	//Sinal
	    	int x = rand.nextInt(intervalo);
	    	if(x>(intervalo/2)) {
	    		sinal = -1;
	    	}else{
	    		sinal = 1;
	    	}
	    	
	    	A[i] = rand.nextInt(intervalo) * sinal;
//	    	System.out.printf("%d, ",A[i]);
	    }
	    return A;
	}
	static int tamanhoVetor2 = 10000;
	static int B[] = new int[tamanhoVetor2];
		
		static int[] CriaçãoArrays2(int intervalo) {
			Random rand = new Random();
		    int sinal = 0;
		    
//		    System.out.println("Vetor:");
		    
		    for(int i=0; i<tamanhoVetor; i++) {
		    	//Sinal
		    	int x = rand.nextInt(intervalo);
		    	if(x>(intervalo/2)) {
		    		sinal = -1;
		    	}else{
		    		sinal = 1;
		    	}
		    	
		    	B[i] = rand.nextInt(intervalo) * sinal;
//		    	System.out.printf("%d, ",A[i]);
		    }
		    return B;
		}
		
		static int tamanhoVetor3 = 100000;
		static int C[] = new int[tamanhoVetor2];
			
			static int[] CriaçãoArrays3(int intervalo) {
				Random rand = new Random();
			    int sinal = 0;
			    
//			    System.out.println("Vetor:");
			    
			    for(int i=0; i<tamanhoVetor; i++) {
			    	//Sinal
			    	int x = rand.nextInt(intervalo);
			    	if(x>(intervalo/2)) {
			    		sinal = -1;
			    	}else{
			    		sinal = 1;
			    	}
			    	
			    	C[i] = rand.nextInt(intervalo) * sinal;
//			    	System.out.printf("%d, ",A[i]);
			    }
			    return C;
			}

	
    public static void main(String[] args) {
    	
    	// criando os objetos necessarios
    	E6_Temporizador temporizador1 = new E6_Temporizador();
    	
    	var A = CriaçãoArrays(1000);
    	var B = CriaçãoArrays(1000);
    	var C = CriaçãoArrays(1000);
    	var D = CriaçãoArrays(1000);
    	
    	temporizador1.start();
    	bubbleSort(A);
    	temporizador1.stop();
    	System.out.println("\nOrdenação de vetor com 1000 elementos por bubbleSort demorou "+temporizador1.tempoDecorrido()+" ms ("+temporizador1.tempoDecorrido()/1000.+" s)");
    	long a = temporizador1.tempoDecorrido();
    	
    	temporizador1.start();
    	insertionSort(B);
    	temporizador1.stop();
    	System.out.println("\nOrdenação de vetor com 1000 elementos por insertionSort demorou "+temporizador1.tempoDecorrido()+" ms ("+temporizador1.tempoDecorrido()/1000.+" s)");
    	long b = temporizador1.tempoDecorrido();
    	
    	temporizador1.start();
    	selectionSort(C);
    	temporizador1.stop();
    	System.out.println("\nOrdenação de vetor com 1000 elementos por selectionSort demorou "+temporizador1.tempoDecorrido()+" ms ("+temporizador1.tempoDecorrido()/1000.+" s)");
    	long c = temporizador1.tempoDecorrido();
    	
    	temporizador1.start();
    	mergeSort(D, 0, 999);
    	temporizador1.stop();
    	System.out.println("\nOrdenação de vetor com 1000 elementos por mergeSort demorou "+temporizador1.tempoDecorrido()+" ms ("+temporizador1.tempoDecorrido()/1000.+" s)");
    	long d = temporizador1.tempoDecorrido();
    	
    	//tamanhoVetor = 10000;
    	var E = CriaçãoArrays2(1000);
    	var F = CriaçãoArrays2(1000);
    	var G = CriaçãoArrays2(1000);
    	var H = CriaçãoArrays2(1000);
    	
    	temporizador1.start();
    	bubbleSort(E);
    	temporizador1.stop();
    	System.out.println("\nOrdenação de vetor com 10000 elementos por bubbleSort demorou "+temporizador1.tempoDecorrido()+" ms ("+temporizador1.tempoDecorrido()/1000.+" s)");
    	long e = temporizador1.tempoDecorrido();
    	
    	temporizador1.start();
    	insertionSort(F);
    	temporizador1.stop();
    	System.out.println("\nOrdenação de vetor com 10000 elementos por insertionSort demorou "+temporizador1.tempoDecorrido()+" ms ("+temporizador1.tempoDecorrido()/1000.+" s)");
    	long f = temporizador1.tempoDecorrido();
    	
    	temporizador1.start();
    	selectionSort(G);
    	temporizador1.stop();
    	System.out.println("\nOrdenação de vetor com 10000 elementos por selectionSort demorou "+temporizador1.tempoDecorrido()+" ms ("+temporizador1.tempoDecorrido()/1000.+" s)");
    	long g = temporizador1.tempoDecorrido();
    	
    	temporizador1.start();
    	mergeSort(H, 0, 999);
    	temporizador1.stop();
    	System.out.println("\nOrdenação de vetor com 10000 elementos por mergeSort demorou "+temporizador1.tempoDecorrido()+" ms ("+temporizador1.tempoDecorrido()/1000.+" s)");
    	long h = temporizador1.tempoDecorrido();
    	
    	//tamanhoVetor = 100000;
    	var I = CriaçãoArrays3(1000);
    	var J = CriaçãoArrays3(1000);
    	var K = CriaçãoArrays3(1000);
    	var L = CriaçãoArrays3(1000);
    	
    	temporizador1.start();
    	bubbleSort(I);
    	temporizador1.stop();
    	System.out.println("\nOrdenação de vetor com 100000 elementos por bubbleSort demorou "+temporizador1.tempoDecorrido()+" ms ("+temporizador1.tempoDecorrido()/1000.+" s)");
    	long i = temporizador1.tempoDecorrido();
    	
    	temporizador1.start();
    	insertionSort(J);
    	temporizador1.stop();
    	System.out.println("\nOrdenação de vetor com 100000 elementos por insertionSort demorou "+temporizador1.tempoDecorrido()+" ms ("+temporizador1.tempoDecorrido()/1000.+" s)");
    	long j = temporizador1.tempoDecorrido();
    	
    	temporizador1.start();
    	selectionSort(K);
    	temporizador1.stop();
    	System.out.println("\nOrdenação de vetor com 100000 elementos por selectionSort demorou "+temporizador1.tempoDecorrido()+" ms ("+temporizador1.tempoDecorrido()/1000.+" s)");
    	long k = temporizador1.tempoDecorrido();
    	
    	temporizador1.start();
    	mergeSort(L, 0, 999);
    	temporizador1.stop();
    	System.out.println("\nOrdenação de vetor com 100000 elementos por mergeSort demorou "+temporizador1.tempoDecorrido()+" ms ("+temporizador1.tempoDecorrido()/1000.+" s)");
    	long l = temporizador1.tempoDecorrido();
    	
//    	System.out.println("\nVetor:");
//	    for(int i=0; i<tamanhoVetor; i++) {
//	    	System.out.printf("%d, ",A[i]);
//	    }
    	
    	System.out.println("\n--------------|-------Tempo(ms)----------");
    	System.out.println("--Algoritmo---|-1000----|-10000-|-100000-");
    	System.out.println("  Bubble Sort | "+a+"	| "+e+"	| "+i);
    	System.out.println("Selection Sort| "+b+"	| "+f+"	| "+j);
    	System.out.println("Insertion Sort| "+c+"	| "+g+"	| "+k);
    	System.out.println("  Merge Sort  | "+d+"	| "+h+"	| "+l);
    }
}