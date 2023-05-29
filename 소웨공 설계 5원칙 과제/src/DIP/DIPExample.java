package DIP;

public class DIPExample {

	public static void main(String[] args) {
		ShootService shootService = new ShootService();
		Soldier pistol = new Pistol();
		Soldier rifle = new Rifle();
		Soldier minethrower = new MineThrower();
		
		shootService.setSoldier(pistol);
		shootService.print();
		
		shootService.setSoldier(rifle);
		shootService.print();
		
		shootService.setSoldier(minethrower);
		shootService.print();
		
	}

}

interface Soldier{
	String shoot();
}

class Pistol implements Soldier{
	public String shoot() {
		return "권총 발사!\n";
	}
}

class Rifle implements Soldier{
	public String shoot() {
		return "소총 발사!\n";
	}
}

class MineThrower implements Soldier{
	public String shoot() {
		return "박격포 발사!\n";
	}
}

class ShootService{
	public Soldier soldier;
	
	public void setSoldier(Soldier soldier) {
		this.soldier=soldier;
	}
	public String shoot() {
		return soldier.shoot();
	}
	public void print() {
		System.out.println(soldier.shoot());
	}
}