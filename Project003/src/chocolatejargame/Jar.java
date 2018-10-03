package chocolatejargame;

public interface Jar {
	public int getItem();
	public int getChocolate();
	public void takeItem(int hand);
	public String status();
	public boolean isEmpty();
}
