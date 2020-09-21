
//Contrato Autenticavel
//quem assinar o contrato, precisa implementar todos metodos.
//metodo setSenha
//metodo autentica

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
}
