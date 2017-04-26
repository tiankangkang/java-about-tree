package ch03;
interface IStack{
	public void clear();
	public boolean isEmpty();
	public int length();
	public Object peek();
	public void push(Object x);
	public Object pop();
	public void display();
		
	
}
class Node{
public Object data;
public Node next;
 public Node(){
	 this(null,null);
 }
 public Node(Object data){
	 this(data,null);
 }
 public Node(Object data,Node next){
	 this.data=data;
	 this.next=next;
 }
}
public class LinkStack implements IStack{
	private Node top;
	public  LinkStack(){
		top=null;
	}
	public void clear(){
		top=null;
	}
	public boolean isEmpty(){
		return top==null;
	}
	public int length(){
		int length=0;
		Node p=top;
		while(p!=null){
			length++;
			p=p.next;
		}
		return length;
	}
	public Object peek(){
		if(!isEmpty()){
			return top.data;
		}
		else
			return null;
	}
	public void push(Object x){
		Node p=new Node(x);
		p.next=top;
		top=p;
		
	}
	public Object pop(){
		if(!isEmpty()){
			Node p=top;
			top=top.next;
			return p.data;
		}
		else
			return null;
	}
	public void display(){
		Node p=top;
		while(p!=null){
			System.out.print(p.data+" ");
			p=p.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("链栈实验开始");
		LinkStack ls=new LinkStack();
		for(int i=0;i<10;i++)
			ls.push(i);
		ls.display();
		ls.pop();
		ls.push('a');
		ls.display();
		ls.clear();
		System.out.println("是否为空"+ls.isEmpty());
		System.out.println("链栈实验结束");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}