// nao pode instaciar objeto dessa classe, pq � abstrata
public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;

	public Funcionario() {

	}

	// metodo sem corpo, n�o h� implementa��o
	public abstract double getBonificacao();

//	public abstract boolean autentica(int senha);
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}