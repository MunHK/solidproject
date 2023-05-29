package LSP;

public class LSPExample {

	public static void main(String[] args) {
		Credit java = new A("자바");
		java.Credit();
		
		Credit SoftwareEngineering = new APlus("소프트웨어공학");
		SoftwareEngineering.Credit();
		
		Credit Web = new CPlus("웹프로그래밍");
		Web.Credit();
		
		Credit db = new B("DB응용");
		db.Credit();
		
		
	}

}

abstract class Credit {
	public String subject;
	public int credit;
	
	public void Credit() {
	}
}

class APlus extends Credit{
	public APlus(String s) {
		subject=s;
	}
	
	public void Credit() {
		System.out.println(subject + "의 학점은 4.5(A+)입니다.\n");
	}
}

class A extends Credit{
	public A(String s) {
		subject=s;
	}
	
	public void Credit() {
		System.out.println(subject + "의 학점은 4.0(A)입니다.\n");
	}
}

class BPlus extends Credit{
	public BPlus(String s) {
		subject=s;
	}
	
	public void Credit() {
		System.out.println(subject + "의 학점은 3.5(B+)입니다.\n");
	}
}

class B extends Credit{
	public B(String s) {
		subject=s;
	}
	
	public void Credit() {
		System.out.println(subject + "의 학점은 3.0(B)입니다.\n");
	}
}
class CPlus extends Credit{
	public CPlus(String s) {
		subject=s;
	}
	
	public void Credit() {
		System.out.println(subject + "의 학점은 2.5(C+)입니다.\n");
	}
}
class C extends Credit{
	public C(String s) {
		subject=s;
	}
	
	public void Credit() {
		System.out.println(subject + "의 학점은 2.0(C)입니다.\n");
	}
}