package extend.practice;

public class Fighter extends Human {
	
	public String weppon;
	
	public Fighter() {
		this.name = "戦士";
		this.hp = 999;
		this.offensive = 100;
		this.weppon = "斧";
	}

	@Override
	public void attack(Living target) {
		// TODO 自動生成されたメソッド・スタブ
		int damage = this.offensive*Rand.get(10);
		target.hp -= damage;
		System.out.println(this.name+"が"+this.weppon+"で攻撃！"+target.name+"に"+damage+"のダメージを与えた。");
	}
}	
