import java.util.Arrays;
import java.util.Scanner;

public class arrayshift {
    public static void swap(int[]ar,int n)
    {int j=0,t;
        for(int i=0;i<n;i++){
            if(i!=j){
        t=ar[i];
        ar[i]=ar[j];
        ar[j]=t;}}
    j++;}
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] ar = new int[m];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int n= ar.length - 1;
        swap(ar, n);
        System.out.println(Arrays.toString(ar));
    }}



