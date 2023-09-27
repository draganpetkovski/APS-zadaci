
public class intersectionPoint {
	
	
	public SLLNode<Integer>intersect(SLL<Integer>list1,SLL<Integer>list2){
		
		SLLNode<Integer>dvizi1=list1.getFirst();
		SLLNode<Integer>dvizi2=list2.getFirst();
		
		while(dvizi1.succ!=null) {
			System.out.println(dvizi2);
			dvizi2=list2.getFirst();
			while(dvizi2.succ!=null) {
				System.out.println("Ova e dvizi1");
				System.out.println(dvizi1);
				System.out.println(dvizi2);
				if(dvizi2.succ==dvizi1.succ) {
					System.out.println("Uleze");
					System.out.println(dvizi1);
					System.out.println("HELo");
					return dvizi1.succ;
					
				}
				else {
				dvizi2=dvizi2.succ;
				}
			}
			dvizi1=dvizi1.succ;
			
		}
				
		return list1.getFirst();
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
		
		SLL<Integer>list2=new SLL<Integer>();
		list2.insertLast(88);
		list2.insertLast(44);
		//list2.insertLast(77);
		SLLNode<Integer>dvizi1=list1.getFirst();
		SLLNode<Integer>dvizi2=list2.getFirst();
		
		while(dvizi2.succ!=null) {
			dvizi2=dvizi2.succ;
		}
		dvizi1=dvizi1.succ.succ;
		
		System.out.println(dvizi1);
		dvizi2.succ=dvizi1.succ;
		System.out.println(list1);
		System.out.println(list2);
		
		intersectionPoint ref= new intersectionPoint();
		
		System.out.println(ref.intersect(list1, list2));
		
		

	}

}
