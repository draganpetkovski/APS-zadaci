
public class ParniNeparni {
	
	
	
	public SLL<Integer> podeliParnost(SLL<Integer>list){
		SLLNode<Integer>tmp=list.getFirst();
		for(int i=0;i<list.length()/2-1;i++) {
			tmp=tmp.succ;
		}
		
		SLLNode<Integer>midle=tmp;
		tmp=list.getFirst();
		for(int i=0;i<list.length();i++) {
			
				if(tmp.element%2!=0) {
					list.insertLast(tmp.element);
					list.delete(tmp);
				}
			tmp=tmp.succ;
		}
		System.out.println(list);
		System.out.println(tmp);

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
		list1.insertLast(8);
		list1.insertLast(8);
		list1.insertLast(3);



		
		ParniNeparni ref = new ParniNeparni();
		
		System.out.println(ref.podeliParnost(list1));
		
		
		
	}

}
