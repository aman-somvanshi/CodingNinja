public class CountDigits {
    public static int countDigits(int n){
        // Write your code here.
        int count=0;
		int num=n;
	    while(num>0){
		int lastDigit=num%10;
		if(lastDigit!=0 && n%lastDigit==0){
			count++;
		}
		num=num/10;
	}	
	return count;
    }
}