
public class ProizvodListi {
	
	
	public int proizvod(SLL<SLL<Integer>>list) {
		
		
		SLLNode<SLL<Integer>>tmp=list.getFirst();
		
		System.out.println("jas sum tmp: " + tmp);
		//System.out.println(tmp);
		
		System.out.println(tmp.succ);
		
		int proizvod=1;
		int suma=0;
		
		
		SLLNode<Integer>momentalen1=tmp.element.getFirst();
		System.out.println("Ova go vrakjam jas");
		System.out.println(momentalen1);
		
		
		while(tmp!=null) {
			SLLNode<Integer>momentalen=tmp.element.getFirst();
			suma=0;
			while(momentalen!=null) {
				suma+=momentalen.element;
				momentalen=momentalen.succ;
				}
			proizvod=proizvod*suma;
			tmp=tmp.succ;
		}
		
		
		
		
		
		return proizvod;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		SLL<SLL<Integer>>list = new SLL<SLL<Integer>>();
		
		SLL<Integer>l1=new SLL<Integer>();
		
		//l1.insertLast(1);
		l1.insertLast(2);
		l1.insertLast(3);
		//l1.insertLast(4);
		//l1.insertLast(5);

		System.out.println(l1);
		
		SLL<Integer>l2=new SLL<Integer>();
		
		l2.insertLast(2);
		l2.insertLast(2);
		
		list.insertLast(l1);
		list.insertLast(l2);

		System.out.println(list);
		ProizvodListi ref = new ProizvodListi();
		
		System.out.println(ref.proizvod(list));
		
		
	}

}
