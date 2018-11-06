package task;

import java.util.Scanner;

public class CallToPhoneConversion {
	private Node head;
	private Node tail;
	private int size = 0;
	private String converse = "";
	Scanner scan;

	CallToPhoneConversion() {
		scan = new Scanner(System.in);
	}

	private class Node {
		private String prevdata;
		private String nextdata;
		private Node next;

		public Node(String input1, String input2) {
			this.prevdata = input1;
			this.nextdata = input2;
			this.next = null;
		}
	}

	public void addFirst(String input1, String input2) {
		Node newNode = new Node(input1, input2);
		newNode.next = head;
		head = newNode;
		size++;
		if (head.next == null) {
			tail = head;
		}
	}

	public void addLast(String input1, String input2) {
		Node newNode = new Node(input1, input2);
		if (size == 0) {
			addFirst(input1, input2);
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}

	public String toString() {
		if (head == null) {
			return "[]";
		}
		Node temp = head;
		String str = "[";
		while (temp.next != null) {
			str += temp.prevdata + ", " + temp.nextdata + " | ";
			temp = temp.next;
		}
		str += temp.prevdata + ", " + temp.nextdata;
		return str + "]";
	}

	public void Input() {
		String fdata = "";
		String tdata = "";
		String odata = "";
		int count = 0;
		while (true) {
			System.out.print("수신 연결한 전화번호를 입력하시오 : ");
			odata = scan.nextLine();
			odata.trim();
			for (int i = 0; i < odata.length(); i++) {
				if (odata.charAt(i) == ' ')
					break;
				fdata += odata.charAt(i);
				count++;
			}
			for (int i = count + 1; i < odata.length(); i++) {
				tdata += odata.charAt(i);
			}
			count = 0;
			fdata.trim();
			tdata.trim();
			if (!fdata.equals("") && !tdata.equals("")) {
				int adata = Integer.parseInt(fdata);
				int bdata = Integer.parseInt(tdata);
				if (adata < 1 || adata > 9999 && bdata < 1 || bdata > 9999 || fdata.length() != 4
						|| tdata.length() != 4) {
					System.out.println("다시 입력하시오.");
					fdata = "";
					tdata = "";
					continue;
				}
			} else if (!fdata.equals("") && tdata.equals("")) {
				System.out.println("다시 입력하시오.");
				fdata = "";
				tdata = "";
				continue;
			}
			if (!odata.equals("")) {
				addLast(fdata, tdata);
			}
			fdata = "";
			tdata = "";
			if (odata.equals("")) {
				while (true) {
					System.out.print("전화를 걸 번호를 입력하시오(0001~9999) : ");
					converse = scan.next();
					int cdata = Integer.parseInt(converse);
					if (cdata < 1 || cdata > 9999 || converse.length() != 4) {
						System.out.println("다시 입력하시오.");
						continue;
					}
					break;
				}
				break;
			}
		}
	}

	public void check() {
		Node temp = head;
		String result = "";
		int stone = 0;
		Node temp3 = temp;
		Node temp1 = temp;
		Node temp2 = temp1;
		Node temp4 = temp1;
		while (temp != null) {
			if (converse.equals(temp.prevdata)) {
				while (temp1 != null) {
					if (temp1.next == null) {
						result = temp1.nextdata;
						stone = 1;
						break;
					}
					if (!temp1.nextdata.equals(temp1.next.prevdata)) {
						result = temp1.nextdata;
						stone = 1;
						break;
					}
					temp1 = temp1.next;
				}
			}
			while (temp3 != null) {
				int couty=0;
				temp2 = temp3;
				while (temp2 != null) {
					if (temp3.prevdata.equals(temp2.nextdata)) {
						result = "0000";
						stone = 2;
						break;
					}
					temp2 = temp2.next;
				}
				temp3 = temp3.next;
			}
			temp = temp.next;
			if (stone == 1 || stone == 2) {
				break;
			}
		}
		if (stone == 0) {
			result = converse;
		}
		System.out.println("전화 벨이 울릴 번호 : " + result);
	}
}