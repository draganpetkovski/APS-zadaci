
public class PairsGivenSum {

	public SLL<String> findPairs(SLL<Integer>list,int x){
		SLL<String>rez=new SLL<String>();
		SLLNode<Integer>dvizi1=list.getFirst();
		
		while(dvizi1!=null) {
			SLLNode<Integer>dvizi2=dvizi1.succ;
			while(dvizi2!=null) {
				if(dvizi1.element + dvizi2.element == x) {
					rez.insertLast("(" + dvizi1.element + "," +dvizi2.element+ ")");
				}
				dvizi2=dvizi2.succ;
				}
			dvizi1=dvizi1.succ;
			}
		
		
		
		
		return rez;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PairsGivenSum ref= new PairsGivenSum();
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
		SLL<String>rez=new SLL<String>();
		rez=ref.findPairs(list1, 8);
		
		
		System.out.println(rez.length());
		

	}

}
