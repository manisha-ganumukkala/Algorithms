public class Karatsuba {
	public int multiply(int x ,int y) {
		int result = 0 ;
		result = x*y;
		return result;
		
	}
	
	public static void main(String args[]) {
		Karatsuba k = new Karatsuba() ;
		System.out.println(k.multiply(5678,1234));
	}
	
	
}
