package visao;

import modelo.FlyweightFactory;
import modelo.FlyweightFactory.Sprites;
import modelo.Ponto;

public class Cliente {

	public static void main(String[] args) { // O acesso aos objetos fica centralizado apenas na classe fábrica.

		FlyweightFactory factory = new FlyweightFactory();

		factory.getFlyweight(Sprites.jogador).desenharNpc(new Ponto(10, 10)); // Criacao do jogador
		System.out.println("");
		factory.getFlyweight(Sprites.npc_1).desenharNpc(new Ponto(100, 10));
		factory.getFlyweight(Sprites.npc_1).desenharNpc(new Ponto(101, 10)); // Criacao de 3 inimigo_1
		factory.getFlyweight(Sprites.npc_1).desenharNpc(new Ponto(102, 10));
		System.out.println("");
		factory.getFlyweight(Sprites.npc_2).desenharNpc(new Ponto(110, 10)); // Criacao de 1 npc_1
		System.out.println("");
		factory.getFlyweight(Sprites.npc_3).desenharNpc(new Ponto(120, 10));
		factory.getFlyweight(Sprites.npc_3).desenharNpc(new Ponto(121, 10)); // Criacao de 3 inimigo_2
		factory.getFlyweight(Sprites.npc_3).desenharNpc(new Ponto(122, 10));

	}

}
