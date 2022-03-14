
public class Linked_List {
	public static void main(String[] args) {
		List_Method sll = new List_Method();
		List_Method dll = new List_Method();
		sll.add5(5, -4, 7, 9, 7);
		sll.add5(8, 3, 24, 7, 3);
		
		sll.print();
		
		sll.quick_change(9, 100);
		
		sll.print();
	}
}