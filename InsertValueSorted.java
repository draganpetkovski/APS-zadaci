
public class InsertValueSorted {
	
	
	
	public SLL<Integer> insertValue(SLL<Integer>list, int x){
		
		
		SLLNode<Integer>tmp=list.getFirst();
		if(tmp.element>x) {
			list.insertFirst(x);
			return list;
		}
		
		while(tmp.succ!=null && tmp.succ.element<x) {
			tmp=tmp.succ;
		}
		//if(tmp==null) {
		//	list.insertLast(x);
		//	return list;
		//}
		SLLNode<Integer> a = new SLLNode<Integer>(x,tmp.succ);
		tmp.succ=a;
		
		
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InsertValueSorted ref= new InsertValueSorted();
		
SLL<Integer>list1=new SLL<Integer>();
		
		list1.insertLast(1);
		list1.insertLast(2);
		//list1.insertLast(3);
		list1.insertLast(4);
		list1.insertLast(5);
		list1.insertLast(6);
		list1.insertLast(7);
		System.out.println(list1);

		SLL<Integer>list2=new SLL<Integer>();
		list2=ref.insertValue(list1,8 );
		
		
		System.out.println(list1);

		
		
		
		
	}

}
