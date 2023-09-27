
public class SamoParniListi {

	public SLL<SLL<Integer>> parniListi (SLL<SLL<Integer>>list){
		
		SLLNode<SLL<Integer>>tmp=list.getFirst();
		
		
		while(tmp!=null) {
			SLLNode<Integer>dvizi=tmp.element.getFirst();
			while(dvizi!=null) {
				if(dvizi.element%2!=0) {
					tmp.element.delete(dvizi);
				}
				dvizi=dvizi.succ;

				
			}
			tmp=tmp.succ;		
		}
		
		
		
		
		
		
		return list;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamoParniListi ref = new SamoParniListi();
		
SLL<SLL<Integer>>list = new SLL<SLL<Integer>>();
		
		SLL<Integer>l1=new SLL<Integer>();
		
		l1.insertLast(1);
		l1.insertLast(2);
		l1.insertLast(3);
		l1.insertLast(4);
		//l1.insertLast(5);

		
		SLL<Integer>l2=new SLL<Integer>();
		
		l2.insertLast(2);h
		l2.insertLast(2);
		l2.insertLast(3);
		l2.insertLast(88);

		
		
		list.insertLast(l1);
		list.insertLast(l2);
		
		
		System.out.println(ref.parniListi(list));
		
		
	}

}
