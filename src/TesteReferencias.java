
public class TesteReferencias {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Romario");
		g1.setCpf("59656565656");
		g1.setSalario(2500);

		Funcionario f1 = new Design();
		f1.setNome("jao");
		f1.setSalario(1200);
		
		Design n1 = new Design();
		n1.setSalario(9000);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(n1);

		System.out.println(controle.getSoma());
	}

}
