public class demo {
    public static void main(String[] args) {
        int[] arr3 = {1,2,3,5,4};
        int arr4[]=addElement(arr3,0,7);
        for (int ele:arr4) {
            System.out.print(ele);
        }
    }
    public static int[] addElement(int[]arr, int index, int value){
        int[] arrnew=new int[arr.length+1];
        if (index<0 && index>=arr.length){
            return arr;

        }else{
            for (int i = 0; i < index; i++) {
                arrnew[i] = arr[i];
            };

            arrnew[index] = value;

            for (int i = index + 1; i < arr.length + 1; i++) {
                arrnew[i] = arr[i-1];
            }
            return arrnew;
        }

    }
}
