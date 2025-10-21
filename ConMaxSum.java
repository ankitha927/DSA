public class ConMaxSum {
    public static int sum(int[]nums){
        int MaxE=nums[0];
        int maxSo=nums[0];
        
        for(int i=1;i<nums.length;i++){
            

            MaxE=Math.max(nums[i],nums[i]+MaxE);
            maxSo=Math.max(MaxE,maxSo);
        }
        return maxSo;
    }
    public static void main(String[] args) {
        int[]nums={-2,1,-3,4,-1,2,1,-5,4};
        int res=sum(nums);
        System.out.println("theres "+res);
    }
}
