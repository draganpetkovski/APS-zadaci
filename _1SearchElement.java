
public class _1SearchElement<E extends Comparable<E>> {
	
	
	public boolean postoi(SLL<E>list, E o) {
		
		SLLNode<E>tmp=list.getFirst();
		if(tmp!=null) {
			while(tmp!=null) {
				if(tmp.element.compareTo(o)==0) {
					System.out.println("postoi");
					return true;
				}
				
				tmp=tmp.succ;
			}
		}
		
		
		
		
		
		return false;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SLL<Integer>list=new SLL<Integer>();
		
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);
		list.insertLast(4);
		list.insertLast(5);

		System.out.println(list);
		
		_1SearchElement<Integer>ref= new _1SearchElement<Integer>();
		boolean dali=ref.postoi(list, 1);
		if(dali==false) {
		System.out.println("Ne postoi");
		}
		else {
			System.out.println("Postoeeeeeee");
		}
		
		
		System.out.println(ref.postoi(list, 6));
		
	}

}
