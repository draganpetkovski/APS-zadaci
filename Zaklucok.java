
public class Zaklucok {
	
	public SLL<Integer> ripajPrekuEden (SLL<Integer>list){
		
		SLLNode<Integer>tmp=list.getFirst();
		
		while(tmp!=null && tmp.succ!=null) {
			tmp.succ=tmp.succ.succ;
			tmp=tmp.succ;
					
		}
		
			
		return list;
	}
	
	public SLL<Integer> ripajPrekuEdenOdVtor (SLL<Integer>list){
		
		list.deleteFirst();
		SLLNode<Integer>tmp=list.getFirst();
		
		while(tmp!=null && tmp.succ!=null) {
			tmp.succ=tmp.succ.succ;
			tmp=tmp.succ;
					
		}
		
			
		return list;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SLL<Integer>l1=new SLL<Integer>();
		
		l1.insertLast(1);
		//l1.insertLast(2);
		//l1.insertLast(3);
		//l1.insertLast(4);
		//l1.insertLast(5);
		//l1.insertLast(6);
		//l1.insertLast(7);
		//l1.insertLast(88);

		Zaklucok ref = new Zaklucok();
		
		System.out.println(ref.ripajPrekuEdenOdVtor(l1));
		
		
		
		
	}

}
