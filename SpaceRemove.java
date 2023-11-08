package training.day1;

public class SpaceRemove {

	public static void main(String[] args) {
		String sent = "The world is beautiful";
		String s = sent.replaceAll(" ", "");
		System.out.println(s);
	}

}
