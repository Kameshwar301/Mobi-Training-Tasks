package training.day1;

public class CustTest {
	static void verify(int age) throws CustException{
		if(age<18) {
			throw new CustException("You are not eligible to vote");
		}
		else {
			System.out.println("you are eligible to vote");
		}
	}
	public static void main(String[] args) {
		try {
			verify(17);
		} catch (CustException e) {
			System.out.println("Caught Exception");
			
			System.out.println("Exception occured "+e);
		}
	}

}
