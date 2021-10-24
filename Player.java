package mainProject;
public class Player {
	private String name;
	private int points;
	
	public Player(String name) {
		this.setName(name);
		this.points = 0;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
