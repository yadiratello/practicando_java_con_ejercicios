package metodos;

public class ejercicios_metodosVII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Datos dat = new Datos();

		dat.llenaArreglo(5);
		
		
		int miArreglo[] = Datos.llenaArreglo2(5);
		Datos.mostrarArreglo2(miArreglo);

	}

}

class Datos {

	// metodo
	public void llenaArreglo(int numero) {

		int arregloDeNum[] = new int[10];

		for (int i = 0; i < arregloDeNum.length; i++) {

			arregloDeNum[i] = numero;

			numero += 5;

			System.out.println(arregloDeNum[i]);
		}
	}

	
	
	// metodo estatico que retorna un array de tipo entero 
	public static int[] llenaArreglo2(int numero) {

		int arregloDeNum[] = new int[10];//arreglo numerico de 10 elementos

		for (int i = 0; i < arregloDeNum.length; i++) {

			arregloDeNum[i] = numero;

			numero += 5;
		}
		return arregloDeNum;
	}
	
	//mostrar el arreglo del metodo estatico
	public static void mostrarArreglo2(int array[]){
		System.out.println("Imprimir datos: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	

}