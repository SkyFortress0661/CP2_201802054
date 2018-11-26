package practice;

public class ProducerCustomerTest {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		(new Thread(new Producer(buffer))).start();
		(new Thread(new Customer(buffer))).start();
	}
}
