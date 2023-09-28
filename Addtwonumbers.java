/*Add two numbers represented by Linked List


Given two numbers represented by two lists, write a function that returns the sum in the form of a linked list.

Example:

    Input: 
    List1: 5->6->3 // represents number 563 
    List2: 8->4->2 // represents number 842 
    Output: 
    Resultant list: 1->4->0->5 // represents number 1405 
    Explanation: 563 + 842 = 1405

    Input: 
    List1: 7->5->9->4->6 // represents number 75946
    List2: 8->4 // represents number 84
    Output: 
    Resultant list: 7->6->0->3->0// represents number 76030
    Explanation: 75946+84=76030     */






public class Addtwonumbers {
	
	public SLL<Integer> add(SLL<Integer>list1,SLL<Integer>list2){
		
		String s="";
		
		SLLNode<Integer>tmp=list1.getFirst();
		SLLNode<Integer>tmp2=list2.getFirst();

		while(tmp!=null) {
			s+=tmp.element;
			tmp=tmp.succ;
		}
		
		int a=Integer.valueOf(s);
		String x="";

		while(tmp2!=null) {
			x+=tmp2.element;
			tmp2=tmp2.succ;
		}
		
		System.out.println(x);
		int b=Integer.valueOf(x);
		
		int c = a + b;
		System.out.println(c);
		
		SLL<Integer>rez= new SLL<Integer>();
		
		while(c!=0) {
			rez.insertFirst(c%10);
			c=c/10;
		}
		
		
		return rez;
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addtwonumbers ref= new Addtwonumbers();
		
		SLL<Integer>list1=new SLL<Integer>();
		
		list1.insertLast(1);
		list1.insertLast(2);
		list1.insertLast(3);
		list1.insertLast(3);
		SLL<Integer>list2=new SLL<Integer>();
		list2.insertLast(1);


		System.out.println(ref.add(list1, list2));
		

	}

}
