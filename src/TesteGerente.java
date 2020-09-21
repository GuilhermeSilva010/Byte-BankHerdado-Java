
public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Guilhermee");
		g1.setCpf("5261222316");
		g1.setSalario(50000);
		 
		g1.setSenha(2255);
		boolean autenticou = g1.autentica(2222);
		
		System.out.println(autenticou);
		System.out.println(g1.getBonificacao());
	}

}
