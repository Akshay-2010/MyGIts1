package BasicPractice;

import java.util.Scanner;

public class FibbonauciPrac {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
	 Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
    
int a=0,b=1;

System.out.println(a);



for (int i=0;i<=n;i++) {
	
	
	
	int temp=a+b;
	a=b;
	b=temp;
	//temp=temp+b;
	
	System.out.println(b);
	
		}


//System.out.print(b);




		
	}

}

