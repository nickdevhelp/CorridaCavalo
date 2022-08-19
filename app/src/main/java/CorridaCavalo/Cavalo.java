package CorridaCavalo;

public class Cavalo {
	String cor;
	iFerradura cavalinho;
	
	public Cavalo(iFerradura c) {
		this.cavalinho = c;
	}
	
	public String Acelerar(int intensidade) {
		return this.cavalinho.Acelerar(intensidade);
	}

}
