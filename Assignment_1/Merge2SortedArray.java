package Assignment_1;

import java.util.*;
public class Merge2SortedArray {

    static void sorted(int arr[], int brr[],ArrayList<Integer> crr, int n, int m){
        int i = 0, j = 0;
        while(i < n && j < m){
            if(arr[i] < brr[j]){
                crr.add(arr[i]);
                i++;
            }
            else{
                crr.add(brr[j]);
                j++;
            }
        }

        while(i < n){
            crr.add(arr[i]);
            i++;
        }
        while(j < m){
            crr.add(brr[j]);
            j++;
        }
        for (Integer integer : crr) {
            System.out.print(integer+" ");
        }
        // return crr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array 1");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of 1st array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }


        System.out.println("Enter the size of the array 2");
        int m = sc.nextInt();
        int brr[] = new int[m];
        System.out.println("Enter the elements of the 2nd array");
        for(int i = 0; i < m; i++){
            brr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        Arrays.sort(brr);
        ArrayList<Integer> crr = new ArrayList<>(n + m);
        sorted(arr, brr,crr, n, m);

        sc.close();
    }
}
