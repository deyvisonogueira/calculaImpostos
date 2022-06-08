package model;

public class ICMS extends Imposto {
	private double valor;
	private String destino;
	
	public ICMS(String nome, String esfera){
		super(nome,esfera);
	}

	@Override
	public double calculaImposto(){
		return valor*this.getAliquota();
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}


}
