public class linearsearch {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int key=3;
        for(int i=0;i<5;i++){
            if(arr[i]==key){
                System.out.println(key+" found at index "+i);

            }
        }
    }
}
