package model;

public abstract class Imposto {
	private String nome;
	private String esfera;
	private double aliquota;
	
	public Imposto(String pNome, String pEsfera, double pAliquota) {
		this.nome = pNome;
		this.esfera = pEsfera;
		this.aliquota = pAliquota;
	}

}
