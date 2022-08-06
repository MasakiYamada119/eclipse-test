package extend.practice;

public class Wizard extends Human {
	
	public String weppon;
	
	public Wizard() {
		this.name = "魔法使い";
		this.hp = 999;
		this.offensive = 100;
		this.weppon = "魔法";
	}

	@Override
	public void attack(Living target) {
		// TODO 自動生成されたメソッド・スタブ
		int damage = this.offensive*Rand.get(10);
		target.hp -= damage;
		System.out.println(this.name+"が"+this.weppon+"で攻撃！"+target.name+"に"+damage+"のダメージを与えた。");
	}
}
