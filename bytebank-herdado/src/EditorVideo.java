//Gerente é um funcionario, Gerente Herda da class Funcionario
public class EditorVideo extends Funcionario{
	
	public double getBonificacao() {
		return super.getBonificacao() + 100; //super não eh um atributo definido nessa class, ele é da mãe (super class)
	}	
	
	
}
