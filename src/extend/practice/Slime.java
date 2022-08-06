package extend.practice;

public class Slime extends Monster {
	
	public String weppon;
	
	public Slime() {
		this.name = "スライム";
		this.hp = 999;
		this.offensive = 100;
		this.weppon = "体当たり";
	}


	@Override
	public void attack(Living target) {
		// TODO 自動生成されたメソッド・スタブ
		int damage = this.offensive*Rand.get(10);
		target.hp -= damage;
		System.out.println(this.name+"が"+this.weppon+"で攻撃！"+target.name+"に"+damage+"のダメージを与えた。");
	}
}
