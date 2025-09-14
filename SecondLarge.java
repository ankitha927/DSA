public class SecondLarge {
    public static int second(int []num){
        int first=num[0];
        int second=num[1];
        for(int i=1;i<num.length;i++){
            if(num[i]>first){
                first=num[i];
            }

        }
        for(int i=0;i<num.length;i++){
            if(num[i]>second&&num[i]<first){
               second=num[i];
            }
        }
     return second;
    }
     public static void main(String[] args) {
        int[] num={1,5,6,3,20,11,12};
        int res=SecondLarge.second(num);
        System.out.println("The second largest number is: "+res);
    }
}
