
public class FirstLastSLL<E> {
	
	public SLL<E>FirstLast(SLL<E>list){
		SLLNode<E>prv=list.getFirst();
		SLLNode<E>tmp=list.getFirst();
		if(tmp.succ!=null) {
		while(tmp.succ.succ!=null) 
		{
			tmp=tmp.succ;

		}
		
		SLLNode<E>last=tmp.succ;
		tmp.succ=prv;
		last.succ=prv.succ;
		prv.succ=null;
		list.setFirst(last);
		}
		
		return list;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SLL<Integer>list=new SLL<Integer>();
		
		list.insertLast(1);
		//list.insertLast(2);
		//list.insertLast(3);
		//list.insertLast(4);
		//list.insertLast(5);
		
		FirstLastSLL<Integer>ref=new FirstLastSLL<Integer>();
		
		
		System.out.println(ref.FirstLast(list));
		
		
		
		
		
		
		
		
		

	}

}
