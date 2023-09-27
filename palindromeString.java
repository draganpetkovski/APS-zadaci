
public class palindromeString<E extends Comparable<E>> {
	
	
	public boolean isPalindrome(String s) {
		
		SLL<String>list=new SLL<String>();
		
		for(int i=0;i<s.length();i++) {
			list.insertLast(String.valueOf(s.charAt(i)));
			
		}
		if(list.getFirst()!=null) {
		if(list.length()%2==0) {
			System.out.println("Uleze u 1 ciklus");
			SLLNode<String>tmp=list.getFirst();
			for(int i=0;i<list.length()/2-1;i++) {
				tmp=tmp.succ;
			}
			System.out.println(tmp);
			SLL<String>list2=new SLL<String>();
			list2.setFirst(tmp.succ);
			list2.mirror();
			tmp.succ=null;
			tmp=list.getFirst();
			SLLNode<String>tmp2=list2.getFirst();
			System.out.println("Ova e listata" + list);
			
			System.out.println(list2);
			while(tmp!=null) {
				System.out.println(tmp);
				System.out.println(tmp2);
				if(tmp.element.compareTo(tmp2.element)!=0) {
					System.out.println("Uleze");
					return false;
				}
				tmp=tmp.succ;
				tmp2=tmp2.succ;
				
			}

		}
		
		
		
		else
			
		if(list.length()%2!=0) {
			System.out.println("Uleze u 2 ciklus");

			SLLNode<String>tmp=list.getFirst();
			for(int i=0;i<list.length()/2-1;i++) {
				tmp=tmp.succ;
			}

			SLL<String>list2=new SLL<String>();
			list2.setFirst(tmp.succ.succ);
			list2.mirror();
			tmp.succ=null;
			tmp=list.getFirst();
			SLLNode<String>tmp2=list2.getFirst();
			System.out.println(list);
			System.out.println(list2);
			while(tmp!=null) {
				if(tmp.element.compareTo(tmp2.element)!=0) {
					System.out.println("Uleze u 2 ciklus");
					return false;
				}
				tmp=tmp.succ;
				tmp2=tmp2.succ;
				
			}

			
			
			
		}
		
		
		
		
		
	}
		
		
		
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	SLL<Integer>list=new SLL<Integer>();
	
	String s= new String();
	s="abkkba";
	
	System.out.println(s.length());

	char b=s.charAt(0);
	
	System.out.println(b);
	
	
	System.out.println("=============================================");
	
	palindromeString ref = new palindromeString();
	
	System.out.println(ref.isPalindrome(s));
	
	
	
	
	}
}
