class amt{
	public static void main(String[] args) {
		int num=153,sum=0, m, number=num; 
		while(num>0)
		{
			m=num%10;//3//5//1
			num=num/10;//15//1//0
			sum=sum+(m*m*m);//27//152//1=153

		}
		if(number==sum)
		{
			System.out.println(sum + " this number is armstrong.");

		}
		else{
			System.out.println(sum + " this is not armstrong.");
		}
	}
}