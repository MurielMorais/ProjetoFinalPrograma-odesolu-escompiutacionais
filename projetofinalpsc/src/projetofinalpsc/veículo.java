package projetofinalpsc;

public class ve�culo {
	// placa, cor, descri��o, quantidade de portas

	private String placa;
	private String cor;
	private String descri��o;
	private int quantidadeDePortas;

	public ve�culo(String placa, String cor, String descri��o, int quantidadeDePortas) {
		this.placa = placa;
		this.cor = cor;
		this.descri��o = descri��o;
		this.quantidadeDePortas = quantidadeDePortas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getDescri��o() {
		return descri��o;
	}

	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}

	public int getQuantidadeDePortas() {
		return quantidadeDePortas;
	}

	public void setQuantidadeDePortas(int quantidadeDePortas) {
		this.quantidadeDePortas = quantidadeDePortas;
	}

}
