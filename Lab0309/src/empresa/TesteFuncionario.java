package empresa;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario f = new Funcionario("Paulo","2",1500);
		f.setSalario(5000.0);
		System.out.println(f.getBonificacao());
		
		Gerente g = new Gerente("Evandro","2",4500,0327,5);
		g.setSalario(5000.0);
		System.out.println(g.getBonificacao());
	}

}
