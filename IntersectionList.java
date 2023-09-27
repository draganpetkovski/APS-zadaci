
public class IntersectionList {

	
	public SLL<Integer> intersect(SLL<Integer>list1, SLL<Integer>list2){
		SLL<Integer>rez=new SLL<Integer>();
		SLLNode<Integer>dvizi1=list1.getFirst();

		while(dvizi1!=null) {
			SLLNode<Integer>dvizi2=list2.getFirst();
				while(dvizi2!=null) {
					if(dvizi1.element==dvizi2.element) {
						rez.insertLast(dvizi1.element);
					}
					dvizi2=dvizi2.succ;
				}
						
			dvizi1=dvizi1.succ;
		}
			
		return rez;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntersectionList ref= new IntersectionList();
		SLL<Integer>lista= new SLL<Integer>();
		
		lista.insertLast(1);
		lista.insertLast(2);
		lista.insertLast(3);	
		lista.insertLast(4);
		lista.insertLast(5);
		lista.insertLast(6);
		lista.insertLast(7);
		lista.insertLast(7);
		
			
		System.out.println(lista);
		
		SLLNode<Integer>tmp=lista.getFirst();
		
		while(tmp!=null) {
			if(tmp.element==7) {
				lista.delete(tmp);
				System.out.println(tmp);
				System.out.println(tmp.succ);
			}
			tmp=tmp.succ;
		}

		
		System.out.println(lista);
		
		
		//System.out.println(tmp.succ);
				
		
		
		
		SLL<Integer>list1=new SLL<Integer>();
		
		
		list1.insertLast(2);
		list1.insertLast(3);
		list1.insertLast(4);
		
		
		
		
		
		
		
		//System.out.println(ref.intersect(lista, list1));
		
		
	}

}
