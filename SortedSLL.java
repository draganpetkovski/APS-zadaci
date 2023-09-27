
public class SortedSLL {

	
	
	public SLL<Integer> joinSorted(SLL<Integer>list1,SLL<Integer>list2){
		
		list1.merge(list2);
		SLLNode<Integer>dvizi1=list1.getFirst();
			while(dvizi1!=null) {
				SLLNode<Integer>dvizi2=dvizi1.succ;
				while(dvizi2!=null) {
					if(dvizi1.element>dvizi2.element) {
						int a=dvizi1.element;
						dvizi1.element=dvizi2.element;
						dvizi2.element=a;
					}
					dvizi2=dvizi2.succ;
				}
				dvizi1=dvizi1.succ;

			}
				
			SLLNode<Integer>tmp=list1.getFirst();
			
			while(tmp!=null && tmp.succ!=null){
				if(tmp.element==tmp.succ.element) {
					tmp.succ=tmp.succ.succ;
				}
				else
				{
					tmp=tmp.succ;
				}
				
			}
			
			
			
			
		return list1;
	}
	
	
	

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		SLL<Integer>lista= new SLL<Integer>();
		
		lista.insertFirst(5);
		lista.insertFirst(5);
		lista.insertFirst(1);
		SLL<Integer>list1=new SLL<Integer>();
		
		list1.insertLast(1);
		list1.insertLast(2);
		list1.insertLast(3);
		list1.insertLast(4);
		list1.insertLast(5);
		list1.insertLast(6);
		list1.insertLast(7);
		list1.insertLast(8);
		list1.insertLast(7);
		list1.insertLast(7);
		list1.insertLast(1);
		
		System.out.println(list1);
		
		SortedSLL ref = new SortedSLL();
		
		//System.out.println(ref.joinSorted(lista, list1));
		
		SLL<Integer>pom=new SLL<Integer>();
		
		pom=ref.joinSorted(lista, list1);
		
		System.out.println("AAAAA");
		
		System.out.println(pom);
		
		System.out.println(list1);
		
	}

}
