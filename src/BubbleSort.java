import java.util.Random;

public class BubbleSort {

public int[] sort(int[] nums)
{
	 for(int i=0;i<10;i++)
	 {
		 System.out.println(i+" "+lenArray);
		 if(nums[lenArray-1]==index)
		 {
			 System.out.println(nums[lenArray-1]);
			 System.out.println(lenArray-1+"done in :"+i+" splits");
			 System.out.println(nums[lenArray-1]);
		 break;
		 }
		 
		 else if(nums[lenArray-1]>index)
		 {
			 lenArray = lenArray/2;
		 }
		 else
		 {
			 lenArray = lenArray+ (64-lenArray)/2;
		 }
	 }
	}

}
