public class FindLargest {
    public static int Large(int[]num){
        int max=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int[] num={1,5,6,9,12};
        int res=FindLargest.Large(num);
        System.out.println("The largest number is: "+res);
    }
}
