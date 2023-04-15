package poo.ejc1;

import java.util.Scanner;

public class FigurasPrincipal {

	public static void main(String[] args) {
		// clase Scanner
		Scanner sc = new Scanner(System.in);

		// instanciando las clases Perimetros, Areas y Heron
		Perimetros perimetro = new Perimetros();
		Areas area = new Areas();
		Heron heron = new Heron();

		// opcion para el menu
		int opcion;

		do {
			System.out.println("\n\tMENU");
			System.out.println("1. Areas\n2. Perimetros\n3. Ley de Herón\n4. Salir");

			System.out.print("Digite una opcion: ");
			opcion = sc.nextInt();

			// switch case de opcion
			switch (opcion) {
			// SUBMENU de Areas
			case 1:

				System.out.println("\n\tMENÚ DE AREAS");
				System.out.println("1. Cuadrado\n2. Circulo\n3. Triangulo\n4. Rectangulo");

				System.out.print("Digite una opción: ");
				int eleccionArea = sc.nextInt();

				// switch de areas
				switch (eleccionArea) {
				case 1:// AREA del CUADRADO
					System.out.print("Digite un lado: ");
					float lado = sc.nextFloat();
					float areaCuadrado = area.calcularAreaCuadrado(lado);
					System.out.println("EL area del cuadrado es : " + areaCuadrado);
					break;
				case 2:// AREA del CIRCULO
					System.out.print("\nDigite el radio: ");
					float radio = sc.nextFloat();
					float areaCirculo = area.calcularAreaCirculo(radio);
					System.out.println("EL area del circulo es : " + areaCirculo);
					break;
				case 3:// AREA del TRIANGULO
					System.out.print("\nDigite la base: ");
					float base = sc.nextFloat();
					System.out.print("\nDigite la altura: ");
					float altura = sc.nextFloat();
					float areaTriangulo = area.calcularAreaTriangulo(base, altura);
					System.out.println("EL area del triangulo es : " + areaTriangulo);
					break;
				case 4:// AREA del RECTANGULO
					System.out.print("Digite la base: ");
					float base2 = sc.nextFloat();
					System.out.println("Digite la altura:");
					float altura2 = sc.nextFloat();
					float areaRectangulo = area.calcularAreaRectangulo(base2, altura2);
					System.out.println("EL area del rectangulo es : " + areaRectangulo);
					break;
				default:
					System.out.println("La opcion no existe, vuelva a digitar\n");
					break;
				}

				break;

			// SUBMENU PERIMETROS
			case 2:
				System.out.println("MENÚ DE PERIMETROS");
				System.out.println("1. Cuadrado\2. Circulo\3. Triangulo\n4. Rectangulo");

				System.out.println("Digite una opción: ");
				int eleccionPerimetro = sc.nextInt();

				// switch de perimetros
				switch (eleccionPerimetro) {
				case 1:// PERIMETRO del CUADRADO
					System.out.println("Digite un lado:");
					float lado = sc.nextFloat();
					float areaCuadrado = perimetro.calcularPerimetroCuadrado(lado);
					System.out.println("EL perimetro del cuadrado es : " + areaCuadrado);
					break;
				case 2:// PERIMETRO del CIRCULO
					System.out.println("\nDigite el diametro:");
					float diametro = sc.nextFloat();
					float areaCirculo = perimetro.calcularPerimetroCirculo(diametro);
					System.out.println("EL perimetro del circulo es : " + areaCirculo);
					break;
				case 3:// PERIMETRO del TRIANGULO
					System.out.println("\nDigite el primer lado:");
					float lado1 = sc.nextFloat();
					System.out.println("\nDigite el segundo lado:");
					float lado2 = sc.nextFloat();
					System.out.println("\nDigite el tercer lado:");
					float lado3 = sc.nextFloat();
					float perimetroTriangulo = perimetro.calcularPerimetroTriangulo(lado1, lado2, lado3);
					System.out.println("EL perimetro del triangulo es : " + perimetroTriangulo);
					break;
				case 4:// PERIMETRO del RECTANGULO
					System.out.println("\nDigite la base:");
					float base2 = sc.nextFloat();
					System.out.println("\nDigite la altura:");
					float altura2 = sc.nextFloat();
					float perimetroRectangulo = perimetro.calcularPerimetroRectangulo(base2, altura2);
					System.out.println("EL perimetro del rectangulo es : " + perimetroRectangulo);
					break;
				default:
					System.out.println("La opcion no existe, vuelva a digitar\n");
					break;
				}
				break;

			// SUBMENU DE HERON
			case 3:
				float a, b, c;
				System.out.println("Digite el primer lado: ");
				a = sc.nextInt();
				
				System.out.print("\nDigite el segundo lado: ");
				b = sc.nextInt();
				
				System.out.print("\nDigite el tercer lado: ");
				c = sc.nextInt();
				
				float leyHeron = heron.calcularLeyHeron(a, b, c);
				System.out.println("La ley de Heron es: "+leyHeron);
				break;
			//	
			case 4:
				opcion = 4;
				System.out.println("Gracias por participar!!");
				break;
			default:
				System.out.println("Opcion no disponible\n");
				break;
			}

		} while (opcion != 4);

	}

}
