package javaLec.ExOverriding.ex03HasA;

public class Gun {
	int bullet;
	Gun(){
		bullet = 0;
	}
	Gun(int bnum){
		bullet = bnum;
	}
	
	int getBUllet() {
		return bullet;
	}
	void shot() {
		System.out.println("BBANG!");
		bullet--;
	}
	
	void setBullet(int bnum) {
		bullet = bnum;
	}
}
