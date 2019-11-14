import java.util.Random;
public class BinaryOperation_0 {
	public static void main(String[] args){
		int[] addOrMinus=new int[50];
		int[] result=new int[50];
		int[] firstNumber=new int[50];
		int[] secondNumber=new int[50];
		Random random=new Random();
		for (int i=0;i<50;i++){
			addOrMinus[i]=(int)random.nextInt(2);
			firstNumber[i]=random.nextInt(101);
			secondNumber[i]=random.nextInt(101);
			if(addOrMinus[i]==1){
				System.out.println(""+(i+1)+":\t"+firstNumber[i]+"+"+secondNumber[i]);
				result[i]=firstNumber[i]+secondNumber[i];
			}
			else{
				System.out.println(""+(i+1)+":\t"+firstNumber[i]+"-"+secondNumber[i]);
				result[i]=firstNumber[i]-secondNumber[i];
			}
		}
			System.out.println("下面是习题参考答案：");
			for (int i=0;i<50;i++){
				System.out.println(""+(i+1)+":\t"+result[i]);
			}
	
	}

}


