package practice;

public class SleepTest {
	
	public static void main(String[] args) throws InterruptedException{
		String kay[] = {"KAID", "NOMAD", "CLASH", "MAVERICK", "MAESTRO","ALIBI", "LION", "FINKA"};
		for(int i = 0;i<kay.length;i++) {
			Thread.sleep(1000);
			System.out.println(kay[i]);
		}

	}

}
