package ch03;
interface IQueue{
	public void clear();
	public boolean isEmpty();
	public int length();
	public Object peek();
	public void offer(Object x);
	public Object poll();
	public void display();
}

public class LinkQueue implements IQueue{
 private Node front;
 private Node rear;
 public LinkQueue(){
	 front=rear=null;
 }
 public void clear(){
	 front=rear=null;
 }
 public boolean isEmpty(){
	 return front==null;
 }
 public int length(){
	 Node p=front;
	 int length=0;
	 while(p!=null)
	 {
		 p=p.next;
		 length++;
	 }
	 return length;
 }
 public Object peek(){
	 if(front!=null)
		 return front.data;
	 else
		 return null;
 }
 public void offer(Object x){
	 Node p=new Node(x);
	 if(front!=null)
	 {
		 rear.next=p;
		 rear=p;
	 }
	 else
		 front=rear=p;
 }
 public Object poll(){
	 if(front!=null){
		 Node p=front;
		 front=front.next;
		 if(p==rear)
			 rear=null;
		 return p.data;
	 }
	 else
		 return null;
 }
 public void display(){
	 Node p=front;
	 while(p!=null){
		 System.out.print(p.data+" ");
		 p=p.next;
	 }
	 System.out.println();
 }
 public static void main(String[] args) {
	System.out.println("链队列实验开始");
	LinkQueue lq=new LinkQueue();
	for(int i=0;i<10;i++)
		lq.offer(i);
	lq.display();
	lq.poll();
	lq.offer('a');
	lq.display();
	System.out.println(lq.peek());
	lq.clear();
	System.out.println("链队列是否为空"+lq.isEmpty());
	System.out.println("链队列实验结束");
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
