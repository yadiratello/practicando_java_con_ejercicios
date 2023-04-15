package bucles;

public class ejc26 {

	public static void main(String[] args) {
		// imprime el abecedario usando for
		
		char letra = 'a';
		//array que se recorra 26 veces(cant de letras del alfabeto)
		for (int i = 0; i < 26; i++) {
			System.out.print(letra+", ");
			letra++;//incrementa a: b,c,d....
		}
		
	}

}
