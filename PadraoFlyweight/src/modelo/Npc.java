package modelo;

public class Npc {

	// Atributo
	private String nomeDoNpc;

	// Construtor
	public Npc(String npc) {
		nomeDoNpc = npc;
	}

	// M�todo
	public void desenharNpc() {
		System.out.println(nomeDoNpc + " criado!");
	}

}
