package constructor.chaining;

public class Anikmal {
	
	String name;

	Anikmal(String name) {
		this.name = name;
	}
	
	Anikmal(){
		this(getRandomName());
	}

	 static String getRandomName() {
		int x = (int) (Math.random() * 5);
		String name = new String[] { "raj","veer", "rajveer", "ranjit", "Ashvini" }[x];
		return name;
	}

	public static void main(String[] args) {
		
		Anikmal a=new Anikmal();
		System.out.println(a.name);

		Anikmal b=new Anikmal();
		System.out.println(b.name);
	}

}
