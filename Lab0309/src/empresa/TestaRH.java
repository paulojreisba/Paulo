package empresa;

public class TestaRH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario Func = new Funcionario ("Paulo", "200",1500);
		Gerente Ger = new Gerente ("Evandro", "300", 5500, 0327,5);
		
		System.out.println("Funcionario: " + Func.getNome());
		System.out.println("Gerente: " + Ger.getNome());
		
		System.out.println (Ger.autentica(0114));
	}

}
