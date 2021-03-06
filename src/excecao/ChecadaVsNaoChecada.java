package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}
	
	// Exce??o N?O checada ou N?O verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro legal #01");
	}
	
	// Exce??o checada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro legal #02 ");
	}
	
	
}
