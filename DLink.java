package project1;

public class DLink {
	private int data;
	public DLink previous;
	public DLink next;
	public DLink(int data) {
		previous =null;
		this.data =data;
		next =null;
	}

	public DLink(DLink previous, int data ,DLink next) {
		this.previous= previous;
		this.data=data;
		this.next= next;
		
	}
	public int Data() {
		return data;
	}
	}
