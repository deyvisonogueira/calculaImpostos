package model;

public class ISS extends Imposto {
	private double valorServico;

	public ISS(String nome, String esfera) {
		super(nome,esfera);
	}

	@Override
	public double calculaImposto()	{
		return this.getAliquota()*valorServico;
	}

	public double getValorServico() {
		return valorServico;
	}

	public void setValorServico(double valorServico) {
		this.valorServico = valorServico;
	}
}

