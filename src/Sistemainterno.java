
public class Sistemainterno {

	private int senha = 1001;

	
	public void autentica(Autenticavel f) {
		boolean autenticou = f.autentica(this.senha);
		if (autenticou) {
			System.out.println("Pode entrar");
		} else {
			System.out.println("Senha incorreta");
		}
	}
	
}
