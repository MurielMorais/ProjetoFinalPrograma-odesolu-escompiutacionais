package projetofinalpsc;

public class proprietário {
	// nome ,email, peso, sexo,cnh
	private String nome;
	private String email;
	private float peso;
	private String sexo;
	private int cnh;

	public proprietário(String nome, String email, float peso, String sexo, int cnh) {
		this.nome = nome;
		this.email = email;
		this.peso = peso;
		this.sexo = sexo;
		this.cnh = cnh;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getCnh() {
		return cnh;
	}

	public void setCnh(int cnh) {
		this.cnh = cnh;
	}

}
