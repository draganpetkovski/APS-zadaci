
public class Circular {

	
	public boolean IsCircular(SLL<Integer>list) {
		
		if(list.getFirst()!=null) {
			SLLNode<Integer> tmp=list.getFirst();
			
			while(tmp.succ!=null || tmp.succ==list.getFirst()) {
				
				if(tmp.succ==list.getFirst()) {
					System.out.println("Kruzna e");
					return true;
				}
				
				tmp=tmp.succ;
			}			
		}
		
		
		
		
		return false;
	}
	
	
	public int lenght(SLL<Integer>list) {
		int len=0;
		if(list.getFirst()!=null) {
			SLLNode<Integer>tmp = list.getFirst().succ;
			len=1;
				while(tmp!=list.getFirst()) {
					len++;
					tmp=tmp.succ;
				}
			
		}
		
		return len;
	}
	
	
	
	
	public SLL<Integer> changeFirstLast(SLL<Integer>list){
		SLLNode<Integer>tmp=list.getFirst().succ;
		
		if(tmp!=null) {
			while(tmp.succ.succ!=list.getFirst()) {
				tmp=tmp.succ;
			}
			SLLNode<Integer>a=tmp.succ;
			tmp.succ=list.getFirst();
			tmp.succ.succ=a;
			a.succ=list.getFirst().succ;
			list.setFirst(a);
			
		}
		
		
		
		
		return list;
	}
	
	
	public SLL<Integer> changeFirstLastElement(SLL<Integer>list){
	SLLNode<Integer>prv=list.getFirst();	
	SLLNode<Integer>tmp=list.getFirst();
		while(tmp.succ!=tmp) {
			tmp=tmp.succ;
			}
		
		int a=prv.element;
		prv.element=tmp.element;
		tmp.element=a;
	return list;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
SLL<Integer>list=new SLL<Integer>();
		
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);
		list.insertLast(4);
		list.insertLast(5);
		list.insertLast(6);
		list.insertLast(7);

		
		
		
		
		System.out.println(list);
		
		SLLNode<Integer>tmp=list.getFirst();
		
		while(tmp.succ!=null) {
			tmp=tmp.succ;
		}
		
		tmp.succ=list.getFirst();
		
		//System.out.println(tmp);
		//System.out.println(tmp.succ);
		
		
		
		
		Circular ref = new Circular();
		
SLL<Integer>list1=new SLL<Integer>();
		
		list1.insertLast(1);
		list1.insertLast(2);
		list1.insertLast(3);
		list1.insertLast(4);
		list1.insertLast(5);
		list1.insertLast(6);
		
		//System.out.println(ref.IsCircular(list1));
		//System.out.println(ref.lenght(list));
	SLL<Integer>pomosna=ref.changeFirstLastElement(list);
	
	SLLNode<Integer>prv=pomosna.getFirst();
	System.out.println(prv.element);
	System.out.println(prv.succ.element);
	
	while(prv.succ!=prv) {
		System.out.println(prv.element);
		prv=prv.succ;
	}
		
	}

}
