package check_group_id.constructorInjections;

public class Player implements Human {

	private String name;
	private String game;
	private int age;

	private Player(String name, String game, int age) {
		this.age = age;
		this.game = game;
		this.name = name;

	}
	public String getName() { return this.name; }
	/*
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; } public String getGame() { return game; } public void
	 * setGame(String game) { this.game = game; } public int getAge() { return age;
	 * } public void setAge(int age) { this.age = age; }
	 * 
	 */
}
