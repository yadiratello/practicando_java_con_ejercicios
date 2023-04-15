package arreglos;

import javax.swing.JOptionPane;

public class ejc3 {

	public static void main(String[] args) {
		/*definir un arreglo de N componentes de tipo float q representen 
		 * las alturas de 5 personas.
		 * Obtener el promedio de las mismas. Contar cuantas personas son mas altas
		 * que el promedio y cuantas mas bajas.
		 */
		float suma=0, promedio=0;
		float alturas[];
		int elementos, mayor=0,menor=0;
		
		elementos = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño del arreglo:"));

		alturas= new float [elementos];
		
		//rellenear los elementos de mi arreglo alturas[]
		for (int i = 0; i < alturas.length; i++) {
			alturas[i] = Float.parseFloat(JOptionPane.showInputDialog("ingrese la altura para el elemento "+i+": "));
			//sumar las alturas
			suma += alturas[i];
		}
		
		System.out.println("**** Las Alturas son: ****");
		for (int i = 0; i < alturas.length; i++) {
			System.out.println(alturas[i]);
		}
		
		//calcular promedio
		promedio = suma /elementos;
		
		for (int i = 0; i < alturas.length; i++) {
			if(alturas[i]>promedio){
				mayor++;
			}else{
				menor++;
			}
		}
		
		System.out.println("El promedio de alturas es : "+promedio);
		System.out.println("La cantidad de elementos mayores al promedio es : "+mayor);
		System.out.println("La cantidad de elementos menores al promedio es : "+menor);
	}

}
