//Gerente � um funcionario, Gerente Herda da class Funcionario
public class EditorVideo extends Funcionario{
	
	public double getBonificacao() {
		return super.getBonificacao() + 100; //super n�o eh um atributo definido nessa class, ele � da m�e (super class)
	}	
	
	
}
