
public class List_Method {
	public Node head;
	
	public List_Method() {
		head = null;
	}
	public void add(int num) {
		if (head == null) {
			head  = new Node(num);
		}
		else {
			Node current = head;
			while (current.getNext() != null) 
				current = current.getNext();
			current.setNext( new Node(num));
		}
		
	}
	public boolean isEmpty() {
		if (head == null) {
			System.out.print("Is Empty Linked");
			return true;
		}
		return false;
	}
	public void print () {
		System.out.println();
		Node current = head;
		if (isEmpty() == true);
		while (current != null) {
			// grab the value and print it
			System.out.print(current.getData() + "  ");
			
			// advance to the next node
			current = current.getNext();
		}
	}
	public void addFirst(int num) {
		if (head == null) {
			head  = new Node(num);
		}
		else{
			head = new Node(num, head);
		}
	}
	public int len() {
		// TODO Auto-generated method stub
		Node current = head;
		int len = 0;
		while (current != null) {
			len += 1;
			
			// advance to the next node
			current = current.getNext();
		}
		return len;
	}
	public int find(int target) {
		Node current = head;
		int len = 0;
		while (current != null) {
			len += 1; 
			if (current.getData() == target) {
				return len;
			}
			current = current.getNext();
		}
		return -1;
	}
	public int findkth(int k) {
		Node current = head;
		int len = 0;
		while (current != null) {
			len += 1; 
			if (len == k) {
				return len;
			}
			current = current.getNext();
		}
		return -1;
	}
	public void thrown(int num) {
		Node current = head;
		Node next = head.getNext();
		int loc = find(num);
		if (loc == -1) {
			System.out.println("Number Not Found");
			return;
		}
		if (loc == 1) {
			head = null;
		}
		while(loc != 2 && loc >= 2) {
			loc -= 1;
			next = next.getNext();
			current = current.getNext();
		}
		next = next.getNext();
		current.setNext(next);
	}
	public void cut_off(int num) {
		Node current = head;
		int loc = find(num);
		if (loc == -1) {
			System.out.println("Number Not Found");
			return;
		}
		if (loc == 1) {
			head = null;
		}
		while(loc != 2 && loc >= 2) {
			loc -= 1;
			current = current.getNext();	
		}
		Node temp = current;
		temp.setNext(null);
	}
	public void quick_change(int before, int after) {
		Node current = head;
		int loc = find(before);
		if (loc == -1) {
			System.out.println("Number Not Found");
			return;
		}
		if (loc == 1) {
			head.setData(after);
		}
		while(loc != 1) {
			loc -= 1;
			current = current.getNext();	
		}
		current.setData(after);
	}
	public void slash() {
		head = head.getNext();
	}
	public int min() {
		Node current = head;
		int min = head.getData(); 
		while(current != null) {
			if(min > current.getData()) {
				 min = current.getData();
			}
			current = current.getNext();
		}
		return min;
	}
	public int max() {
		Node current = head;
		int max = head.getData(); 
		while(current != null) {
			if(max < current.getData()) {
				 max = current.getData();
			}
			current = current.getNext();
		}
		return max;
	}
	public void bubble_sort() {
		int n = len();
		for(int i = 0; i < n; i ++) {
			Node current = head;
			Node next = head.getNext();
            for (int j = 0; j < n - 1; j++) {
                if (current.getData() > next.getData()){
                    // swap arr[j+1] and arr[j]
                    int temp = current.getData();
                    int temp2 = next.getData();
                    next.setData(temp);
                    current.setData(temp2);
                }
                current = next;
                next = next.getNext();
            }
		}
	}
	public void add5(int first, int second, int third, int fourth, int fifth) {
		add(first);
		add(second);
		add(third);
		add(fourth);
		add(fifth);
	}
	public void Biggest_to_Smallest() {
		int n = len();
		for(int i = 0; i < n; i ++) {
			Node current = head;
			Node next = head.getNext();
            for (int j = 0; j < n - 1; j++) {
                if (current.getData() < next.getData()){
                    // swap arr[j+1] and arr[j]
                    int temp2 = current.getData();
                    int temp = next.getData();
                    next.setData(temp2);
                    current.setData(temp);
                }
                current = next;
                next = next.getNext();
            }
		}
	}
	public void pop() {
		Node current = head;
		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}
		current.setNext(null);
	}
	public void delete() {
		Node why = head;
		while(why != null) {
			why.setNext(null);
			why = why.getNext();
		}
		head = null;
	}
	public boolean same(List_Method a, List_Method b) {
		Node one = a.head;
		Node two = b.head;
		while(one != null && two != null) {
			if(one.getData() != two.getData()) {
				return false;
			}
			one = one.getNext();
			two = two.getNext();
		}
		return true;	
	}
}
	
