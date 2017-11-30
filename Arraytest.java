package javaprograms;

public class Arraytest {

	public static void main(String[] args) {

		int arr1[] = new int[] {1,2,3,4,5,6};
		int arr2[] = new int[] {2,3,4,8,5,9};
		int temp[] = new int[10];
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					temp[i]=arr1[i];
					
					
					
				}
								
			}
			
			
		}
		
		for(int k = 0; k < temp.length; k++) {
		      if(temp[k] != 0)		
			    System.out.println(temp[k]);
			}
			
		}
		
		
	}


