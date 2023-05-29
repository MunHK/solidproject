package SRP;

public class SRPExample {

	public static void main(String[] args) {
		Person p = new Person();//잘못된 예시
		
		Student s = new Student();
		Instructor i = new Instructor();
		TeachingAssistant t = new TeachingAssistant();
		
		s.study();
		i.teach();
		t.manage();
	}

}
