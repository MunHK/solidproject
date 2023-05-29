package OCP;

public class OCPExample {

	public static void main(String[] args) {
		IAMGround moon = new Moon();
		PlayGame game1 = new PlayGame(moon);
		game1.start();
		
		IAMGround woo = new Woo();
		PlayGame game2 = new PlayGame(woo);
		game2.start();
		
		IAMGround an = new An();
		PlayGame game3 = new PlayGame(an);
		game3.start();
		
		IAMGround han = new Han();
		PlayGame game4 = new PlayGame(han);
		game4.start();
		
		IAMGround hwang = new Hwang();
		PlayGame game5 = new PlayGame(hwang);
		game5.start();
	}

}

class PlayGame{
	private IAMGround i;
	
	public PlayGame(IAMGround i) {
		this.i = i;
	}
	
	public void start() {
		System.out.println("아이엠 그라운드 자기소개하기~");
		i.Introduce();
	}
}

abstract class IAMGround {
	public abstract void Introduce();
}

class Moon extends IAMGround{
	public void Introduce() {
		System.out.println("나는 형규\n");
	}
}

class Woo extends IAMGround{
	public void Introduce() {
		System.out.println("나는 성민\n");
	}
}

class An extends IAMGround{
	public void Introduce() {
		System.out.println("나는 안민\n");
	}
}

class Han extends IAMGround{
	public void Introduce() {
		System.out.println("나는 승현\n");
	}
}

class Hwang extends IAMGround{
	public void Introduce() {
		System.out.println("나는 성진\n");
	}
}