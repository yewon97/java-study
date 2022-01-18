package day26;

public class AbstractClass1 {
	public static void main(String[] args) {
		Pokemon pokemon = new Pikachu();
		System.out.println("이 포켓몬은 : "+pokemon.getName());
		pokemon.attack();
		pokemon.sound();
		
		pokemon = new Squirtle();
		System.out.println("이 포켓몬은 : "+pokemon.getName());
		pokemon.attack();
		pokemon.sound();
	}
}

abstract class Pokemon {
	String name;
	abstract void attack();
	abstract void sound();
	public String getName() {
		return this.name;
	}
}

class Pikachu extends Pokemon {
	Pikachu() {
		this.name = "피카츄";
	}
	@Override
	void attack() {
		System.out.println("전기 공격");
	}
	@Override
	void sound() {
		System.out.println("피카피카!");
	}
}
class Squirtle extends Pokemon {
//	생성자 만들기 
	Squirtle() {
		this.name = "꼬북이";
	}
	@Override
	void attack() {
		System.out.println("물 공격");
	}
	@Override
	void sound() {
		System.out.println("꼬북꼬북!");
	}
}