public class secondlargestandsecsmallest {
    public static void main(String[] args) {
        int arr[]={32,5,30,7,100,110,78,56,65};
        boolean ans=seclargest(arr);
        System.out.println(ans);
        boolean ans1=secsmallest(arr);
        System.out.println(ans1);
    }
    public static boolean seclargest(int arr[]) {
        int largest=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]>largest){
                secmax=largest;
                largest=arr[i];
            }
            else if(arr[i]>secmax&&arr[i]<largest){
                secmax=arr[i];
            }
        }
        System.out.println(secmax);
        return true;
    }
    public static boolean secsmallest(int arr[]){
        int smallest=Integer.MAX_VALUE;
        int secsmall=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<smallest){
                secsmall=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secsmall&&arr[i]>smallest){
                secsmall=arr[i];
            }
        }
        System.out.println(secsmall);
        return true;
    }
    }
