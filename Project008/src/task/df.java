package task;

import java.util.Scanner;

public class df {
	private Node[] clean;
	private int size = 0;
	private String converse = "";
	Scanner scan;

	df() {
		clean = new Node[9999];
		scan = new Scanner(System.in);
		for(int i = 0;i<9999;i++) {
			clean[i].data=""+i;
			if(clean[i].data.length()!=4) {
				if(clean[i].data.length()==1) {
					clean[i].data="000"+i;
				}
				else if(clean[i].data.length()==2) {
					clean[i].data="00"+i;
				}
				else if(clean[i].data.length()==3) {
					clean[i].data="0"+i;
				}
			}
		}
	}

	private class Node {
		private String data;
		private Node next;

		public Node() {
			this.next = null;
		}
	}

	public void connect(String input, String input2) {
		int i = Integer.parseInt(input)-1;
		int j = Integer.parseInt(input2)-1;
		clean[i].next = clean[j];
	}

/*	public String toString() {
		if (head == null) {
			return "[]";
		}
		Node temp = head;
		String str = "[";
		while (temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		str += temp.data;
		return str + "]";
	}*/

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
				if (adata < 1 || adata > 9999 || bdata < 1 || bdata > 9999 || fdata.length() != 4
						|| tdata.length() != 4) {
					System.out.println("다시 입력하시오.");
					fdata = "";
					tdata = "";
					continue;
				}
			}
			if (!odata.equals("")) {
				connect(fdata, tdata);
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
	
	/*public void check() {
		while (temp.next != null) {
			if(converse==temp.prevdata) {
				Node temp1 = temp;
				while (temp1.next != null) {
					if(temp1.nextdata!=temp1.next.prevdata) {
						break;
					}
					temp1 = temp1.next;
				}
			}
			temp = temp.next;
		}
	}*/
}
