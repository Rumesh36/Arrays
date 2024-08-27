import java.util.Scanner;

public class largestandsmallestarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {23,31,41,30,76,36,10};
       boolean anslarge=largest(arr);
        System.out.println(anslarge);
        boolean anssmall=smallest(arr);
        System.out.println(anssmall);
    }
    public static boolean largest(int arr[]){
        int max=0;
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
