package training.day1;

public class CountWordAndCharcter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="The world is beautiful";
		
		int count =0, total=1, k=0;
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i) !=' ') {
				count++;
			}
		}
		System.out.println("The Characters count is "+count);
		
		while(k<s.length()) {
			if((s.charAt(k) == ' ') && (s.charAt(k+1) != ' ')) {
				total++;
			}
			k++;
		}
		System.out.println("The word count is "+total);
	}

}
