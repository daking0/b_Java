package javaLec.ExOverriding.ex04Overriding;

public class OverridingMain {
	public static void main(String[] args) {
		BaseEnSpeaker base = new BaseEnSpeaker();
		base.setvolume(10);
		base.setBaseSpeaker(50);
		base.showCurrentState();
	}
}

