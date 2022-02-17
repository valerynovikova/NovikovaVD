
public class LinkList<T> {
	public T data;
	public LinkList<T> next;
	
	public LinkList(T data, LinkList next) {
		this.data = data;
		this.next = next;
	}
	
}