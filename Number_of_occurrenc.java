class Number_of_occurrenc {
    public static void main(String[] args) {
        int Arr[] = {1, 1, 2, 2, 2, 2, 3};
        int ans=count(Arr, Arr.length, 7);
        System.out.println(ans);
    }
    static int count(int[] arr, int n, int x) {
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x ){
                ans++;
            }

        }

        return ans;
    }
}