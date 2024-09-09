public class Reversearraywithswaping {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        revarr(arr);
       printarr(arr);
    }
    public static void printarr(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static boolean revarr(int arr[]){
        int s=0;
        int e= arr.length-1;
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        return true;
    }
}
