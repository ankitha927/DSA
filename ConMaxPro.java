public class ConMaxPro {
    public static int pro(int []nums){
   int maxPro=nums[0];
   int minPro=nums[0];
   int result=nums[0];

   for(int i=1;i<nums.length;i++){
    int num=nums[i];
    if(num<0){
        int temp=maxPro;
        maxPro=minPro;
        minPro=temp;

    }

    maxPro=Math.max(num,num*maxPro);
    minPro=Math.min(num,num*minPro);

    result=Math.max(result,maxPro);
   }

   return result;
    }

    public static void main(String[]args){
        int[] nums={2,3,-2,4};
        int res= pro(nums);
        System.out.println("res is: "+res);

    }
}
