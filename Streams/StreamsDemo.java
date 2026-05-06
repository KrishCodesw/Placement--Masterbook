public class StreamsDemo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 45, 5, 6, 7, 8, 9 };
        int sum = 0;
        for(int i =0;i<=arr.length-1;i++){
            if(arr[i]%2==0){
                sum=sum+arr[i];
            }
        }
        //Above is called imperative programming
        //Below is called declarative programming   
        
    }
}
