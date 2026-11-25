package RPGarena;

public class Character {
	private String name;
	private int health;
	private int baseDmg;
	
	public Character(String name, int health, int baseDmg) {
		this.name = name;
		this.health = health;
		this.baseDmg = baseDmg;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
