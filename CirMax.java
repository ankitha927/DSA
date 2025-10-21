public class CirMax {
    public static int max(int[]nums){
        int Total=0;
        int answer=0;
        for(int i=0;i<nums.length;i++){
            Total=Total+nums[i];
        }

        int maxSo=nums[0];
        int maxE=nums[0];
        int maxSo1=nums[0];
        int maxE1=nums[0];
        for(int i=0;i<nums.length;i++){
            maxE=Math.max(nums[i],nums[i]+maxE);
            maxSo=Math.max(maxE,maxSo);

            maxE1=Math.min(nums[i],nums[i]+maxE1);
            maxSo1=Math.min(maxE1,maxSo1);

      
            
        }
        return Math.max(maxSo,Total-maxSo1);

    }
    public static void main(String[] args) {
        int[]nums={1,-2,3,-2};
        int res=max(nums);
        System.out.println("res "+res);
    }
}
