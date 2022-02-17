public class List {
	private LinkList head;
	
	public static LinkList inputList(int k) {
		LinkList head = null;
		for (int i = 0; i < k; i++) {
			LinkList temp = new LinkList(i,head);
			head = temp;
		}
		return head
		
	}
	
	public static LinkList inputListDirect(int k) {
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
	//dbjsbgdbcgs
	
	public static void outputList(LinkList head){
		while(head!=null) {
			System.out.println(head.data + "->");
			head = head.next;
		}
		System.out.println("null");
	}
	
}