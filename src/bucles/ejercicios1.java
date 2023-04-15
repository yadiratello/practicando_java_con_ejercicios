package bucles;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class ejercicios1 {

	public static void main(String[] args) {
		// imprimir del 1 al 1000
		/*
		 * int numero ;
		 * 
		 * numero = Integer.parseInt(JOptionPane.showInputDialog(
		 * "Ingrese numero:"));
		 * 
		 * int contador=1;
		 * 
		 * //con while while(numero>=contador){ System.out.println(contador);
		 * contador++; } //con for for (int i = 1; i <= numero; i++) {
		 * System.out.println(i); }
		 */

		// pedir 10 numeros y mostrar la suma de estos numeros y el promedio
		/*
		 * int n , suma = 0, prom;
		 * 
		 * for (int i = 1; i <= 10; i++) { n =
		 * Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero "+i+" :"
		 * )); suma = suma + n; } prom = suma /10;
		 * 
		 * System.out.println("La suma de los numeros es: "+suma);
		 * System.out.println("El promedio es: "+prom);
		 */

		/*
		 * Se ingresan un conjunto de n piezas por teclado. contar el número de
		 * piezas aptas que son de longitud entre 1.20 y 1.30. Mostrar la
		 * cantidad de piezas aptas
		 */

		/*
		 * int cantPiezas, piezasAptas = 0; double longitud;
		 * 
		 * cantPiezas = Integer.parseInt(JOptionPane.showInputDialog(
		 * "Ingre la cantidad de piezas:"));
		 * 
		 * // bucle for (int i = 1; i <= cantPiezas; i++) { // pedir que ingrese
		 * la longitud longitud =
		 * Double.parseDouble(JOptionPane.showInputDialog(
		 * "Ingrese la longitud de la pieza " + i + " :"));
		 * 
		 * // validar si estan en el rango if (longitud >= 1.20 && longitud <=
		 * 1.30) { piezasAptas++; } }
		 * 
		 * System.out.println("Piezas aptas: " + piezasAptas);
		 */

		// ingresar 10 notas de alumnos y nos informe cuantas tienen notas
		// mayores o iguales a 7 y cuantos menores.
		/*
		 * int nota, notasMayores = 0,notasMenores = 0;
		 * 
		 * for (int i = 1; i <= 10 ; i++) { nota =
		 * Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota "+i+" :"
		 * ));
		 * 
		 * if(nota >= 7){ notasMayores++; }else{ notasMenores++; } }
		 * 
		 * System.out.println("Notas mayores a 7: "+notasMayores);
		 * System.out.println("Notas menores que 7: "+notasMenores);
		 */

		/*
		 * int numero, multiploDe3 = 0;
		 * 
		 * for (int i = 1; i <= 10; i++) { numero =
		 * Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero " + i +
		 * " :"));
		 * 
		 * if (numero %3 == 0) { multiploDe3++; System.out.println(numero); } }
		 * 
		 * System.out.println("Cantidad de numeros multiplos de 3 : " +
		 * multiploDe3);
		 */

		// realizar un programa que imprima 25 terminos(veces) de la serie
		// 11-22-33-44
		/*
		 * int cant = Integer.parseInt(JOptionPane.showInputDialog(
		 * "Ingrese la cantidad de terminos:")); int num = 0;
		 * 
		 * for (int j = 1; j <= cant; j++) { num += 9; System.out.println(num);
		 * }
		 */

		// mostrar los multiplos de 5 hasta el valor n ingresado
		/*
		 * int n = Integer.parseInt(JOptionPane.showInputDialog(
		 * "Ingrese numero:"));
		 * 
		 * for (int i = 1; i <= n; i++) {
		 * 
		 * if(i % 5 == 0){ System.out.println(i); }
		 * 
		 * }
		 */

		// ingresar n numero y calcular cuales son pares e impares
		/*
		 * int cant, num, pares = 0, impares = 0;
		 * 
		 * cant = Integer.parseInt(JOptionPane.showInputDialog(
		 * "Ingrese cantidad de numeros:"));
		 * 
		 * 
		 * for (int i = 1; i <= cant; i++) {
		 * 
		 * num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero "
		 * +i+" :"));
		 * 
		 * if(num % 2 ==0){ pares++; System.out.println("Par: "+num); }else{
		 * impares++; } }
		 * 
		 * System.out.println("Numero Pares: "+pares); System.out.println(
		 * "Numero Impares: "+impares);
		 */

		// crear 2 listas de 15 valores c/u
		/*
		 * int[] lista1 = new int[15]; int[] lista2 = new int[15]; int suma1 =
		 * 0; int suma2 = 0;
		 * 
		 * JOptionPane.showMessageDialog(null,
		 * "Ingrese los valores de la lista 1:"); for (int i = 0; i < 15; i++) {
		 * lista1[i] = Integer.parseInt(JOptionPane.showInputDialog(
		 * "Ingrese numero "+i+" :")); suma1 += lista1[i]; }
		 * 
		 * JOptionPane.showMessageDialog(null,
		 * "Ingrese los valores de la lista 2:"); for (int i = 0; i < 15; i++) {
		 * lista2[i] = Integer.parseInt(JOptionPane.showInputDialog(
		 * "Ingrese numero "+i+" :")); suma2 += lista2[i]; }
		 * 
		 * if (suma1 > suma2) { System.out.println(
		 * "La lista 1 tiene un valor acumulado mayor."); } else if (suma2 >
		 * suma1) { System.out.println(
		 * "La lista 2 tiene un valor acumulado mayor."); } else {
		 * System.out.println("Las listas tienen un valor acumulado igual."); }
		 */

		// programa q solicite la carga de 10 numeros e imprima la suma de los
		// ultimos 5 valores
		/*
		 * int num, suma=0 ;
		 * 
		 * 
		 * for (int j = 1; j <= 10; j++) { num =
		 * Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero "+j));
		 * 
		 * if(j>5){ suma += num; System.out.println(j); } } System.out.println(
		 * "La suma de los ultimos 5 valores ingresados es: "+suma);
		 */

		/*
		 * Confeccionar un programa que lea n pares de datos, cada par de datos
		 * corresponde a la medida de la base y la altura de un triangulo. El
		 * programa debera informar:
		 * 
		 * a) De cada triangulo la medida de su base, su altura y superficie. b)
		 * La cantidad de triangulos cuya superficie (Area) es mayor a 12
		 */
		/*
		 * int base, altura, area, mayorA12 = 0;
		 * 
		 * int cantDatos = Integer.parseInt(JOptionPane.showInputDialog(
		 * "Ingrese cantidad de pares de datos:"));
		 * 
		 * for (int i =1; i <= cantDatos; i++) { base =
		 * Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base:"));
		 * altura = Integer.parseInt(JOptionPane.showInputDialog(
		 * "Ingrese la altura:")); area = base * altura / 2; //mostrar base,
		 * altura y superficie System.out.println("La Base del triangulo "+i+
		 * " es: "+base); System.out.println("La Altura del triangulo "+i+
		 * " es: "+altura); System.out.println("Superficie del triangulo "+ i +
		 * " es: "+area); //validar los triangulos cuya superficie sea mayor a
		 * 12 if(area>12){ mayorA12++; } } System.out.println(
		 * "La cantidad de triangulos cuya superficie (Area) es mayor a 12: "
		 * +mayorA12);
		 * 
		 */

		// mostrar la tabla de multiplicacion de un numero desde el 1 hasta el
		// 12
		/*
		 * int num = Integer.parseInt(JOptionPane.showInputDialog(
		 * "Ingrese numero que desea mostrar la tabla de multiplicar:"));
		 * 
		 * System.out.println(
		 * "***Tabla de multiplicar del 1 hasta el 12 del numero "+num+" ****");
		 * for (int i = 1; i <= 12; i++) { System.out.println(num+" x "+i+" = "
		 * +(num*i)); }
		 */

		/*
		 * Escribir un programa que pida ingresar coordenadas (x, y) que
		 * representan puntos en el plano. Informar cuántos puntos se han
		 * ingresado en el primer, segundo, tercer y cuarto cuadrante. Al
		 * comenzar el programa se pide que se ingrese la cantidad de puntos a
		 * progresar.
		 */
		/*
		 * int puntos = Integer.parseInt(JOptionPane.showInputDialog(
		 * "Ingrese cantidad de puntos a ingresar:"));
		 * 
		 * int cuadrante1 = 0, cuadrante2=0,cuadrante3=0,cuadrante4 = 0, x, y;
		 * 
		 * for (int i = 1; i <= puntos; i++) { x =
		 * Integer.parseInt(JOptionPane.showInputDialog(
		 * "Ingrese la coordenada x del punto "+i+" :")); y =
		 * Integer.parseInt(JOptionPane.showInputDialog(
		 * "Ingrese la coordenada y del punto "+i+" :"));
		 * 
		 * //validar x y y if(x>0 && y>0){ cuadrante1++; }else if(x<0 && y>0){
		 * cuadrante2++; }else if(x<0 && y<0){ cuadrante3++; }else if(x>0 &&
		 * y<0){ cuadrante4++; } } //mostrar la cantid de puntos de cada
		 * cuadrante System.out.println(
		 * "Cantidad de puntos en el primer cuadrante: "+cuadrante1);
		 * System.out.println("Cantidad de puntos en el segundo cuadrante: "
		 * +cuadrante2); System.out.println(
		 * "Cantidad de puntos en el tercer cuadrante: "+cuadrante3);
		 * System.out.println("Cantidad de puntos en el cuarto cuadrante: "
		 * +cuadrante4);
		 */

		/*
		 * ingresar 10 numeros enteros y calcular: cant de valores negativos
		 * cant de valores positivos cant de multiplos de 15 el valor acumulado
		 * de los numeros ingresados que son pares
		 */
		/*
		 * int num, negativos = 0,positivos = 0,multiplosDe15 = 0,sumaPares = 0;
		 * 
		 * for (int i = 1; i <= 10; i++) { num =
		 * Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero "+i+" :"
		 * ));
		 * 
		 * //validar la cantidad de numeros positivos y negativos if(num > 0){
		 * positivos++; }else if(num < 0){ negativos++; } //cant de multiplos de
		 * 15 if(num % 15 == 0){ multiplosDe15++; } if(num % 2 == 0){ sumaPares
		 * += num; } } //mostrar System.out.println("Numeros positivos: "
		 * +positivos); System.out.println("Numeros negativos: "+negativos);
		 * System.out.println("Numeros multiplos de 5: "+multiplosDe15);
		 * System.out.println("Suma de numeros pares: "+sumaPares);
		 */

		// programa que pida ingresar n numeros, calcular el promedio y
		// finalizar cuando ingrese 0

		/*
		 * int n,cont = 0, sum = 0, prom;
		 * 
		 * do{ n = Integer.parseInt(JOptionPane.showInputDialog(
		 * "Ingrese numero:\n0 = Finaliza el programa.")); sum += n; cont++;
		 * 
		 * }while(n!=0); System.out.println("Fin del programa.");
		 * 
		 * prom = sum / cont;
		 * 
		 * System.out.println("La suma es: "+sum); System.out.println(
		 * "El promedio es: "+prom);
		 */

		
	}
}
