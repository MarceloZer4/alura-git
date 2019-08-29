//Gerente é um funcionario, Gerente Herda da class Funcionario
public class Gerente extends Funcionario{

	private int senha;
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Senha autenticada, Seja Bem vindo(a) " + getNome());
			return true;
		}else {
			System.out.println("Esquece, você não sabe a senha");
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario(); //super não eh um atributo definido nessa class, ele é da mãe (super class)
	}	
	
	
}
