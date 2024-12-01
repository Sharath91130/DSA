public class FirstRepeatingElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 99, 5, 6};
    int arr1[] = {1, 2, 3, 4};
          int ans=firstRepeated(arr);
        System.out.println(ans);

    }

        // Function to return the position of the first repeating element.
        public static int firstRepeated(int[] arr) {
            // Your code here

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length-1; j++) {
                    if(arr[i]==arr[j] &&i!=j){
                        return i+1;
                    }

                }



            }
            return -1;
        }

}
