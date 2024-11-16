package DP;

public class Sum {
     static int tree[];

     public static int getSumUtil(int i, int si, int sj, int qi, int qj) {
          if (qj <= si || qi >= sj) {
               return 0;
          } else if (si >= qi && sj <= qj) {
               return tree[i];
          } else {
               int mid = (si + sj) / 2;
               int left = getSumUtil(2 * i + 1, si, mid, qi, qj);
               int right = getSumUtil(2 * i + 2, mid + 1, sj, qi, qj);
               return left + right;
          }

     }

     public static getSum(int arr[],int qi,int j){
          int n=arr.length;
          return getSumUtil(0,0,n-1,qi,qj);
     }

     public static void main(String[] args) {
          int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
          int n = arr.length;
          // init(n);

          System.out.print(getSum(arr, 2, 5));
     }

}
