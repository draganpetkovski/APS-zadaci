
public class ModifyContent {

	public SLL<Integer> modify(SLL<Integer>list){
		
		SLLNode<Integer>dvizi1=list.getFirst();
		
		for(int i=0;i<list.length()/2-1;i++) {
			dvizi1=dvizi1.succ;
		}
		SLL<Integer>list2=new SLL<Integer>(dvizi1.succ);
		list2.mirror();
		dvizi1.succ=null;
		
		dvizi1=list.getFirst();
		SLLNode<Integer>dvizi2=list2.getFirst();
		
		while(dvizi1!=null) {
		dvizi1.element=(dvizi1.element-dvizi2.element);
		System.out.println(dvizi1.element);
		dvizi1=dvizi1.succ;
		dvizi2=dvizi2.succ;
		}
		list2.mirror();
		System.out.println(list);
		dvizi1=list.getFirst();
		while(dvizi1.succ!=null) {
			dvizi1=dvizi1.succ;
		}
		dvizi1.succ=list2.getFirst();
		
		return list;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLL<Integer>list1=new SLL<Integer>();

		list1.insertLast(1);
		list1.insertLast(2);
		list1.insertLast(3);
		list1.insertLast(4);
		list1.insertLast(5);
		list1.insertLast(6);

		
		
		ModifyContent ref= new ModifyContent();
		
		System.out.println(ref.modify(list1));
		
		
		

	}

}
