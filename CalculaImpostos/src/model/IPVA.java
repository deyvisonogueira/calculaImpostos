package model;

public class IPVA extends Imposto {
private double valor;
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public IPVA(String nome, String esfera)
	{
		super(nome,esfera);
	}
	
	@Override
	public double calculaImposto()
	{
		return valor*this.getAliquota();
	}
}