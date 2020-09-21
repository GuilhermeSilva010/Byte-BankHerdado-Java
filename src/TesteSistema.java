
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(1001);
		
		Administrador adm = new Administrador();
		adm.setSenha(1001);
		
		Gerente g2 = new Gerente();
		g2.setSenha(1001);
		
		Sistemainterno si = new Sistemainterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(g2);
	}

}
