
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
