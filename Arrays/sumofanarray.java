import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i=0;i< arr.length;i++){
            System.out.println("Enter the value of arr["+i+"] : ");
            arr[i]= sc.nextInt();
        }

        for (int i=0;i< arr.length;i++) {
            sum = sum+arr[i];
        }

        System.out.println("Sum of an array is : "+sum);

        }
}
