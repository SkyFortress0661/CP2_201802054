package linkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addFirst(40);
		numbers.addFirst(50);
		numbers.add(4, 60);
		numbers.removeFirst();
		numbers.removeLast();
		numbers.remove(2);
		System.out.println(numbers);
	}
}
