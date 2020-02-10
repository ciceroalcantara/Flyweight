package modelo;

// Essa classe é o flyweight concreto onde é criado 1 NPC em determinado ponto

public class Sprite extends SpriteFlyweight {

	private Npc npc;

	public Sprite(String nomeDoNpc) {
		npc = new Npc(nomeDoNpc);
	}

	public void desenharNpc(Ponto ponto) {
		npc.desenharNpc();
		System.out.println("No ponto (" + ponto.x + "," + ponto.y + ")!");
	}
}
