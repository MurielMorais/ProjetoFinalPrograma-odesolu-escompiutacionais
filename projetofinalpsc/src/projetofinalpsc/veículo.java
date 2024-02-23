package projetofinalpsc;

public class veículo {
	// placa, cor, descrição, quantidade de portas

	private String placa;
	private String cor;
	private String descrição;
	private int quantidadeDePortas;

	public veículo(String placa, String cor, String descrição, int quantidadeDePortas) {
		this.placa = placa;
		this.cor = cor;
		this.descrição = descrição;
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

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public int getQuantidadeDePortas() {
		return quantidadeDePortas;
	}

	public void setQuantidadeDePortas(int quantidadeDePortas) {
		this.quantidadeDePortas = quantidadeDePortas;
	}

}
