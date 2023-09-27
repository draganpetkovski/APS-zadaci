
public class StudentTest {

	
	
	
	public SLL<Student> funkcija (SLL<Student>list){
		
		SLLNode<Student>tmp=list.getFirst();
		
		while(tmp!=null) {
		
			if(tmp.element.getPoeni()<50) {
				list.delete(tmp);
			}
			tmp=tmp.succ;
			
			
			
		}
		
		
		
		
		return list;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SLL<Student>lista= new SLL<Student>();
		
		
		
		Student s1= new Student(155056,"Dragan",100);
		Student s2= new Student(155054,"Nikola",44);
		Student s3= new Student(155058,"Goce", 56);

		lista.insertLast(s3);
		lista.insertLast(s2);
		lista.insertLast(s1);

		
		System.out.println(lista);
		
		SLLNode<Student>prv=lista.getFirst();
		
		System.out.println(prv);
		System.out.println(prv.succ);
		
		System.out.println(prv.element);
		
		if(prv.element.getIme().compareTo(prv.succ.element.getIme())!=0) {
			
			System.out.println("razlicni se");
		}
		
		StudentTest ref = new StudentTest();
		
		System.out.println(ref.funkcija(lista));
		
		
	}

}
