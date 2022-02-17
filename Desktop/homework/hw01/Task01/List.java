public class List <T> {
	private LinkList head;
	static int sum = 0;
	
	public static LinkList inputList(T k) {
		LinkList head = null;
		for (int i = 0; i < k; i++) {
			LinkList temp = new LinkList(i,head);
			head = temp;
		}
		return head
		
	}
	
	public static LinkList inputListDirect(T k) {
		LinkList head = null;
		LinkList end = null;
		if(k > 0) {
			head = new LinkList(0, null);
			end = head;
		}
		for (int i = 1; i < k; i++) {
			LinkList temp = new LinkList(k, null);
			end.next = temp;
			end = temp;
		}
		return head;
	}
	
	
	public static void outputList(LinkList head){
		while(head!=null) {
			System.out.println(head.data + "->");
			head = head.next;
		}
		System.out.println("null");
	}
	
	
	public static void sumOfLinkList(LinkList head) {
		if (head == null)
			return;
		sumOfLinkLists(head.next);//обход след узлов(элем)
		sum = sum + head.data;
		
	}
	public static void sumOfLinkListUtil(LinkList head) {
		sum = 0;
		sumOfLinkList(head);
		return sum;
	}
	
	public static void printMinMax(Node head) {
		if (head == null) { 
		return; 
		}
		LinkList current; 
	    current = head; 
	    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		while (current.next != head) {
			if (current.data < min) { 
			min = current.data; 
		} 
		if (current.data > max) { 
		max = current.data; 
		} 
		current = current.next; 
		} 
	}

  

    

} 
	
	
	
	
}
	
		
	
	
	
	
}