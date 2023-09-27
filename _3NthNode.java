
public class _3NthNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
SLL<Integer>list=new SLL<Integer>();
		
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);
		list.insertLast(4);
		list.insertLast(5);
		list.insertLast(6);
		
		SLLNode<Integer>tmp=list.getFirst();
		
		for(int i=0;i<list.length()-3;i++) {
			tmp=tmp.succ;
		}
		
		System.out.println(tmp);

		
		

	}

}
