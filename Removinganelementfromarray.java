import java.util.Arrays;
public class Removinganelementfromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,1,4,6,7,9};
		int eletodelete=4;
		int arr1[]=new int[arr.length-1];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=eletodelete) {
				arr1[index]=arr[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(arr1));
	}

}
