package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class RPG {
	
	public static void main(String[] args) {
		
		Brave brave = new Brave();
		Fighter fighter = new Fighter();
		Wizard wizard = new Wizard();
		Slime slime = new Slime();
		Oak oak = new Oak();
		Dragon dragon = new Dragon();
		
		List<Human> humans = new ArrayList<>();
		humans.add(brave);
		humans.add(fighter);
		humans.add(wizard);
		
		List<Monster> monsters = new ArrayList<>();
		monsters.add(slime);
		monsters.add(oak);
		monsters.add(dragon);
		
		Human human = humans.get(Rand.get(humans.size()));
		Monster monster = monsters.get(Rand.get(monsters.size()));
	  
	    while(true) {
	    	System.out.println("人間のターン！");
			human.attack(monster);
			if (monster.hp <= 0) {
				System.out.println(monster.name + "は倒れた。");
				monsters.remove(monster);
			}
			if (monsters.isEmpty()) {
			    System.out.println("勇者達は勝利した！");
			    break;
			}
			
			System.out.println("モンスターのターン！");
			monster.attack(human);
			if (human.hp <= 0) {
				System.out.println(human.name + "は倒れた。");
				humans.remove(human);
			}
			if (humans.isEmpty()) {
			    System.out.println("モンスターたちは勝利した！");
			    break;
	        }
	    }
    }
}

