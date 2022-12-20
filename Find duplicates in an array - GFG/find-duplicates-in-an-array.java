//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
       ArrayList<Integer> arrayList=new ArrayList<>();
        HashMap<Integer, Integer> map1=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            if(!map1.containsKey(arr[i])){
                map1.put(arr[i],1);
            }
            else {
                map1.put(arr[i], map1.get(arr[i])+1);
            }
        }

            for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
                if (entry.getValue() >1  ) {
                    arrayList.add(entry.getKey());
                }
        }
        Collections.sort(arrayList);
            if(arrayList.size()>=1){
                return arrayList;
            }
            arrayList.add(-1);
             return arrayList;
    }
}
