package ch;

public interface AnimalDoing {
	@Override
	public void eat(String name) {
		System.out.println(name + " eat food.");
	}
	
	@Override
	public void bark(String name) {
		System.out.println(name + " bark 멍멍");
	}
	
	@Override
	public void walk(String name) {
		System.out.println(name + " walk 걷");
	}
}
