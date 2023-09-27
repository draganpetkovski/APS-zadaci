
public class SLLTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	SLL<Integer>lista= new SLL<Integer>();
	
	lista.insertFirst(5);
	lista.insertFirst(5);
	lista.insertFirst(1);
	
	
	SLLNode<Integer>prv=lista.getFirst();
	SLLNode<Integer>vtor=prv.succ;

	lista.insertBefore(99, vtor);
	lista.insertLast(121);
	lista.insertLast(123);

	System.out.println(lista);
	System.out.println(lista.length());
	System.out.println(prv);
	}

}
