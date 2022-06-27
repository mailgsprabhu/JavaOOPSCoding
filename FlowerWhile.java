package tamilnadu.chennai;

public class FlowerWhile {
	
	public static int agee=27;
	
	public static void disp() {
		System.out.println("hi static");
	}
	
	{
		System.out.println("instance block");
	}
	
	static{
		System.out.println("static block");
	}
	
	public void flowerCount() {
		
		int flower=256;
		while(flower<1) {
			System.out.println(flower/2);
			System.out.println(FlowerWhile.agee);
			flower=flower/2;
			
		}
	}
	
	public void revNumber() {
		int noo=1234;
		while(noo>0) {
			System.out.print(noo%10);
			noo=noo/10;
			
		}
	}
	
	private void check_palindrome(int no) {
		// TODO Auto-generated method stub
		int no2 = no; //12321
		int rev = 0; 
		while(no>0) 
			{
			int rem = no%10; 
			rev = (rev*10)+rem; 
			no = no/10; 
			}
		if(no2==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FlowerWhile f= new FlowerWhile();
		f.flowerCount();
		
		f.revNumber();
		
		f.check_palindrome(1221);
		
		//System.out.println(FlowerWhile.agee);
		//System.out.println(agee+" by name");
		
		//FlowerWhile.disp();
		//disp();
	}

}
