package ISP;

public class ISPExample {

	public static void main(String[] args) {
		RifleMan rm = new RifleMan();
		rm.sleep();
		rm.gun();
		
		MortarMan mm = new MortarMan();
		mm.sleep();
		mm.gun();
		mm.minethrower();
		
		CookingDisease cd = new CookingDisease();
		cd.sleep();
		cd.cook();
		
		Medic me = new Medic();
		me.sleep();
		me.treat();
	}

}

interface Cook{
	void cook();
}

interface Gun{
	void gun();
}

interface MineThrower{
	void minethrower();
}

interface Treat{
	void treat();
}

interface Sleep{
	void sleep();
}

class RifleMan implements Gun,Sleep{
	public void sleep() {
		System.out.println("소총수는 잠을 잡니다.");
	}
	
	public void gun() {
		System.out.println("소총수는 총을 쏩니다.\n");
	}
	
}

class MortarMan implements Gun,Sleep,MineThrower{
	public void sleep() {
		System.out.println("박격포병은 잠을 잡니다.");
	}
	
	public void gun() {
		System.out.println("박격포병은 총을 쏩니다.");
	}
	
	public void minethrower() {
		System.out.println("박격포병은 박격포를 쏩니다.\n");
	}
}

class CookingDisease implements Sleep,Cook{
	public void sleep() {
		System.out.println("취사병은 잠을 잡니다.");
	}
	
	public void cook() {
		System.out.println("취사병은 밥을 만듭니다.\n");
	}
}
class Medic implements Sleep,Treat{
	public void sleep() {
		System.out.println("의무병은 잠을 잡니다.");
	}
	
	public void treat() {
		System.out.println("의무병은 병사를 치료합니다.\n");
	}
}