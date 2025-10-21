public class MaxPro {
    
    public static int product(int []nums){
        int max=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int pro=nums[i]*nums[j];
                max=Math.max(max,pro);
            }
        }
        return max;
    }
    public static void main(String[]args){
        int[] nums={2,3,-2,4};
        int res= product(nums);
        System.out.println("res is: "+res);

    }
}

