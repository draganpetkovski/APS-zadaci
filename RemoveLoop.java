
public class RemoveLoop {
	
	public int removeLoop(SLLNode<Integer>prv) {
		
		
		while(prv!=null) {
			SLLNode<Integer>vtor=prv.succ;
			if(vtor.succ==prv) {
				System.out.println(vtor);
				return 99;
			}
			
			prv=prv.succ;

		}
		
		return 1;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

SLL<Integer>list1=new SLL<Integer>();
		
		list1.insertLast(1);
		list1.insertLast(2);
		list1.insertLast(3);
		list1.insertLast(3);

		
		SLLNode<Integer>tmp=list1.getFirst();
		tmp.succ.succ=tmp;
	
		RemoveLoop ref= new RemoveLoop();
		
		System.out.println(ref.removeLoop(tmp));
	}

}
