package modelo;

import java.util.ArrayList;

public class FlyweightFactory {

	protected ArrayList<SpriteFlyweight> flyweights;

	public enum Sprites {
		jogador, npc_1, npc_2, npc_3
	}

	public FlyweightFactory() { // Cria varios objetos a serem compartilhados
		flyweights = new ArrayList<SpriteFlyweight>();
		flyweights.add(new Sprite("Jogador"));
		flyweights.add(new Sprite("Inimigo_1"));
		flyweights.add(new Sprite("Npc_1"));
		flyweights.add(new Sprite("Inimigo_2"));
	}

	public SpriteFlyweight getFlyweight(Sprites jogador) { // Método para obter o objeto
		switch (jogador) {
		case jogador:
			return flyweights.get(0);
		case npc_1:
			return flyweights.get(1);
		case npc_2:
			return flyweights.get(2);
		case npc_3:
			return flyweights.get(3);
		default:
			return flyweights.get(4);
		}
	}
}
