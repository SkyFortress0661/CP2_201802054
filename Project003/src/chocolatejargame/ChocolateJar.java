package chocolatejargame;

public class ChocolateJar implements Jar {
	
	private int chocolate;
	private int chilli;

	public ChocolateJar() {
		chocolate = 13;
		chilli = 1;
	}

	public ChocolateJar(int chocolate) {
		this.chocolate = chocolate;
		this.chilli = 1;
	}

	public int getItem() {
		return getChocolate() + getChilli();
	}

	public int getChocolate() {
		return chocolate;
	}

	public int getChilli() {
		return chilli;
	}

	public void takeItem(int hand) {
		if(hand>getChocolate()) {
			hand=getChocolate();
		}
		chocolate -= hand;
		if (getChocolate() == 0) {
			chilli-=1;
		}
	}

	public String status() {
		String chilli = "[ ■";
		String choco = " □";
		for (int i = 0; i < getChocolate(); i++) {
			chilli += choco;
		}
		chilli += " ]";
		return chilli;
	}

	public boolean isEmpty() {
		if (getChocolate() == 0 && getChilli() == 0)
			return true;
		return false;
	}

}
