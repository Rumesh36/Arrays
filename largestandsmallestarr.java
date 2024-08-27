import java.util.Scanner;

public class largestandsmallestarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose 1 for default array 2 for custom array");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                int arr[] = {12, 43, 2, 78, 90, 106, 69};
                System.out.println(largest(arr));
                System.out.println(smallest(arr));
                break;
            case 2:
                System.out.println("enter your array size");
                int arrsize=sc.nextInt();
                int array[] = new int[arrsize];
                System.out.println("enter your array elements");
                for (int i = 0 ; i < arrsize; i++){
                    array[i]= sc.nextInt();
                }
                System.out.println(largest(array));
                System.out.println(smallest(array));
        }
    }
    public static boolean largest(int arr[]){
        int max=arr[0];
        for (int i = 0; i < arr.length-1;i++ ){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        return true;
    }
    public static boolean smallest(int arr[]){
        int min=arr[0];
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
        return true;
    }
}
