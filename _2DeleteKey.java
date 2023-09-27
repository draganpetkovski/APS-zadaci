
public class _2DeleteKey {
	
	public SLL<Integer> firstKey(SLL<Integer>list,int x){
		
		SLLNode<Integer>tmp=list.getFirst();
		
		if(tmp!=null) {
			while(tmp!=null) {
				if(tmp.element==x) {
					list.delete(tmp);
					return list;
				}
				tmp=tmp.succ;
				}			
			
		}
		
		
		return list;
	}
	
	
	
public SLL<Integer> AllKey(SLL<Integer>list,int x){
		
		SLLNode<Integer>tmp=list.getFirst();
		
		if(tmp!=null) {
			while(tmp!=null) {
				if(tmp.element==x) {
					list.delete(tmp);
				}
				tmp=tmp.succ;
				}			
			
		}
		
		
		return list;
	}
	
	
	public SLL<Integer> LastKey(SLL<Integer>list, int x){
		
		if(list.getFirst()!=null) {
			SLLNode<Integer>tmp=list.getFirst();
			SLLNode<Integer>last=null;
			
			while(tmp!=null) {
				if(tmp.element==x) {
					last=tmp;
				}
				tmp=tmp.succ;
			}
			
			list.delete(last);
			
			
		}
		
		
		
		return list;
	}


	public SLL<Integer> Middle(SLL<Integer>list){
	
		if(list.getFirst()!=null) {
			SLLNode<Integer>tmp=list.getFirst();
			
			//if(list.length()%2!=0) {
				for(int i=0;i<(list.length()/2)-1;i++) {
					tmp=tmp.succ;
				}
				tmp.succ=tmp.succ.succ;
			//}
			
			
				
				
			}
			
			
			
			
		
		
		
	
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
		list.insertLast(3);
		list.insertLast(1);
		list.insertLast(1);



		
		_2DeleteKey ref= new _2DeleteKey();
		
		//System.out.println(ref.firstKey(list, 4));
		System.out.println(ref.Middle(list));
		
	
	
	}

}
