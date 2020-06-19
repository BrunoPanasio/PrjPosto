
public class Bomba {
	private String combustivel;
	private double preco;

	public Bomba(String combustivel, double preco) {
		super();
		this.combustivel = combustivel;
		this.preco = preco;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
		
	public double abasteceLitros(double litros) {
		return this.preco*litros;
	}
	public double abasteceReais(double reais) {
		return reais / this.preco;
	}
	
}
