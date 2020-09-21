
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario gui = new Gerente();
		gui.setNome("Guilherme");
		gui.setCpf("526899999999");
		gui.setSalario(2600.00);
		
		System.out.println(gui.getNome());
		System.out.println(gui.getBonificacao());

	}

}
