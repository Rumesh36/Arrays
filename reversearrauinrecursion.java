public class reversearrauinrecursion {
 public static void main(String[] args) {
        int arr[] = {1,2,3,4};
    revarray(arr,0,arr.length-1);
    printarr(arr);
    }
    public static void printarr(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void revarray(int arr[],int s,int e){
        if(s>=e){
            return ;
        }
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
         revarray(arr,s+1,e-1);
 }

}

