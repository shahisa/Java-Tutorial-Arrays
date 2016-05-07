
public class Arrays {
	public static void main(String[]args){
		int value = 7;
		
		int [] valueArray;
		valueArray = new int[3];
		
		System.out.println(valueArray[0]);
		
		valueArray [0] = 10;
		valueArray [1] = 20;
		valueArray [2] = 30;
		System.out.println(valueArray[0]);
		System.out.println(valueArray[1]);
		System.out.println(valueArray[2]);
		
		for (int i=0; i<valueArray.length; i++){
			System.out.println(valueArray[i]);
			
			
		}
		int [] numbers = {5,6,7};
		
		for(int i =0; i<numbers.length; i++){
			System.out.println(numbers[i]);
		}
	}
}
