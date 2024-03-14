import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i=0;i< arr.length;i++){
            System.out.println("Enter the value of arr["+i+"] : ");
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter element to find :");
        int ele = sc.nextInt();

        for (int i=0;i< arr.length;i++) {
            if(ele == arr[i]){
                System.out.println("Element found at index : "+i);
        }
        }

        }
}
