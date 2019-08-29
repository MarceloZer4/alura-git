package unip;

public class cc4a30 {

	public static void main(String[] args) {
	
		System.out.println("hello world"); //ola mundo

		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		int repetir = 0;
		String piramide = "I" ;
		
		System.out.println(gastosTrimestre);
		
		for (int i = 0; i < 10; i = i + 1) {	// for (inicializacao; condicao; incremento)
			//estrutura de repetição, fez com que o olá partindo do 0, se repetisse 10x, um por 1
			System.out.println("olá!");
			}

		for (int i = 0; i < 10; i++){
			
		//System.out.println(repetir);
		repetir = repetir + 1;
		System.out.println(piramide);
		piramide = piramide + piramide;
		}
	}
}