package week1day3;
public class Fibonaciseries {
	public void shortcut() {
		int firstNum=0, secNum =1, sum =0;
		System.out.print(firstNum+" ");
		for(int i=1;i<=11;i++) {
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.print(sum+" ");
		}		
	}
	public static void main(String[] args) {
		Fibonaciseries num= new Fibonaciseries();
		num.shortcut();
	}
}