
public class SLLPalindrom {

	
	public int isPalindrom(SLL<Integer>list) {
		
		if(list.getFirst()==null) {
			return -1;
		}
		
		SLLNode<Integer>tmp=list.getFirst();
		if(list.length()%2==0) {
			
			for(int i=0;i<list.length()/2-1;i++) {
				tmp=tmp.succ;
			}
			
			SLLNode<Integer>tmp2=tmp.succ;
			SLL<Integer>list2= new SLL<Integer>();
			while(tmp2!=null) {
				list2.insertLast(tmp2.element);
				tmp2=tmp2.succ;
			}
			//System.out.println("Jas sum prvata lista"+list);
			list2.mirror();
			System.out.println("Jas sum vtorata lista  " +list2);
			tmp.succ=null;
			System.out.println("Jas sum prvata lista  "+list);
			tmp=list.getFirst();
			tmp2=list2.getFirst();
			while(tmp!=null) {
				if(tmp.element!=tmp2.element) {
					return -1;
				}
				tmp=tmp.succ;
				tmp2=tmp2.succ;
				
			}
			
			
		}
		else if(list.length()%2!=0) {
			
			for(int i=0;i<list.length()/2-1;i++) {
				tmp=tmp.succ;
			}
			
			SLLNode<Integer>tmp2=tmp.succ.succ;
			SLL<Integer>list2= new SLL<Integer>();
			while(tmp2!=null) {
				list2.insertLast(tmp2.element);
				tmp2=tmp2.succ;
			}
			//System.out.println("Jas sum prvata lista"+list);
			list2.mirror();
			System.out.println("Jas sum vtorata lista  " +list2);
			tmp.succ=null;
			System.out.println("Jas sum prvata lista  "+list);
			tmp=list.getFirst();
			tmp2=list2.getFirst();
			while(tmp!=null) {
				if(tmp.element!=tmp2.element) {
					return -1;
				}
				tmp=tmp.succ;
				tmp2=tmp2.succ;
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		return 1;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SLL<Integer>list1=new SLL<Integer>();
		
		list1.insertLast(1);
		list1.insertLast(2);
		list1.insertLast(3);
		list1.insertLast(5);

		list1.insertLast(5);
		list1.insertLast(3);
		list1.insertLast(2);
		list1.insertLast(1);

		System.out.println(list1);
		
		SLLPalindrom ref= new SLLPalindrom();
		
		System.out.println(ref.isPalindrom(list1));
		
		

	}

}
