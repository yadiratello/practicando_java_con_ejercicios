package matriz;

public class matricesIrregularesI {

	public static void main(String[] args) {
		//creando matriz de 3 filas y N columnas 
		int matriz[][] = new int[3][];
		
		//una matriz irregular puede tener un numero especifico de filas y las columnas pueden variar
		
		matriz[0] = new int[2];//en la fila 0 tendra 2 columnas
		matriz[1] = new int[4];//en la fila 1 tendra 4 columnas
		matriz[2] = new int[3];
		
		
		//impirmiendo
		System.out.println("la cantiidad de columnas que tiene la fila 0 es: "+matriz[0].length);
		System.out.println("la cantiidad de columnas que tiene la fila 1 es: "+matriz[1].length);
		System.out.println("la cantiidad de columnas que tiene la fila 2 es: "+matriz[2].length);

		
	}

}
