package doublyLinkedList;

public class Main {
	public static void main(String[] args) {
		doublyLinkedList numbers = new doublyLinkedList();
		numbers.addFirst(10);
		numbers.addFirst(40);
		numbers.addFirst(50);
		numbers.addLast(30);
		numbers.add(1,20);
		numbers.remove(4);
		numbers.removeFirst();
		numbers.removeLast();
		System.out.println(numbers);
	}
}
