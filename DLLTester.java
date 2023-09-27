
public class DLLTester {
	
	DLL<Integer> removeDuplicates(DLL<Integer>list){
		
		DLLNode<Integer>tmp=list.getFirst();
		
		while(tmp.succ!=null) {
			DLLNode<Integer>sleden=tmp.succ;
			while(sleden!=null) {
				if(tmp.element==sleden.element) {
					list.delete(sleden);
					System.out.println("SLEDENNNNNNNNNNN:  "+ sleden);
					System.out.println(sleden.succ);
					//if(sleden.succ!=null) {
					//sleden.pred.succ=sleden.succ;
					//if(sleden.succ!=null) {
					//sleden.succ.pred=sleden.pred;
					
					
					}
				
				
				sleden=sleden.succ;
				
				}
			tmp=tmp.succ;
		}
				
				
		
		
		
		
		
		
		
		return list;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DLL<Integer>lista = new DLL<Integer>();
		
		lista.insertLast(1);
		lista.insertLast(2);
		lista.insertLast(2);
		lista.insertLast(1);
		lista.insertLast(1);
		lista.insertLast(3);
		lista.insertLast(1);
		lista.insertLast(2);


		DLLTester ref = new DLLTester();
		
		System.out.println(ref.removeDuplicates(lista));
		
		

	}

}
