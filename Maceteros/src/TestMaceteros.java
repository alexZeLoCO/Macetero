
public class TestMaceteros {

	public static void main(String[] args) {
		
		Macetero Einstein = new Macetero ();
		Einstein.setAltura(10);
		Einstein.setRinferior(6);
		Einstein.setRsuperior(12);
		
		Macetero Jackson = new Macetero ();
		Jackson.setAltura(14);
		Jackson.setRinferior(6);
		Jackson.setRsuperior(6);
		
		System.out.printf("Generatriz, volumen y área de Einstein: %f, %f, %f.\n",Einstein.generatriz(),Einstein.volumen(),Einstein.area());
		System.out.printf("Generatriz, volumen y área de Jackson: %f, %f, %f.\n",Jackson.generatriz(),Jackson.volumen(),Jackson.area());
	
		if (Einstein.mayorVolumen(Jackson)) {
			System.out.print("El volumen de Einstein es mayor al de Jackson.");
		} else {
			System.out.print("El volumen de Einstein es menor o igual al de Jackson");
		}
	}
}
