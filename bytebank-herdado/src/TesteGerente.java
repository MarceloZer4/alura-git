public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 =  new Gerente();
		g1.setNome("Marcelo");
		g1.setCpf("05782982101");
		g1.setSalario(5000.0);
		
		System.out.println("Nome Gerente: "+g1.getNome());
		System.out.println("CPF do Gerente: "+g1.getCpf());
		System.out.println("Salario do gerente é "+(g1.getBonificacao()+g1.getSalario()) 
				+ ", com o Base de: " + g1.getSalario());
		
		g1.setSenha(2222);
		
		boolean autenticou = g1.autentica(2222);
		System.out.println(autenticou);
		
		System.out.println("Bonificação de: " + g1.getBonificacao());
		
	}

}
