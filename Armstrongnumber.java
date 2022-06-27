package tamilnadu.chennai;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Armstrongnumber a= new Armstrongnumber();
		
		a.armstrong(370);
		System.out.println(" program ends ");
		System.out.println(" created a new branch ");
		System.out.println(" created a new test ");
	}

	private void armstrong(int g) {
		// TODO Auto-generated method stub
		int no=g;
		int arm=no;
		int rem=0;
		int f=0;
		while(no>0) {
			rem=no%10;
			f=(rem*rem*rem)+f;
			no=no/10;
		}
		if(f==arm) {
			System.out.println(arm +" number is armstrong");
		}
		else {
			System.out.println("not armstrong...");
		}
	}

}
