
public class Juni2023 {

	public SLL<Integer> funkcija(SLL<Integer> list, int n, int m){
		
		SLLNode<Integer>tmp=list.getFirst();
		
		for(int i=0;i<n-1;i++) {
			if(tmp!=null) {
			tmp=tmp.succ;
			}
		}
		
		while(tmp!=null) {
		SLLNode<Integer>tmp2=tmp.succ;
		for(int j=0;j<m;j++) {
			if(tmp2!=null) {
				tmp2=tmp2.succ;
				}
			
		}
		tmp.succ=tmp2;
		for(int k=0;k<n;k++) {
			if(tmp!=null) {
				tmp=tmp.succ;
			}
		}
		}
		
		
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
		list1.insertLast(7);
		list1.insertLast(8);
		list1.insertLast(7);
		list1.insertLast(7);
		list1.insertLast(1);


		
		Juni2023 ref= new Juni2023();
		
		System.out.println(ref.funkcija(list1, 66, 5));
		
		

	}

}
