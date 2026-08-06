public class binarysearch {
    public static void main(String args[]){
        int arr[]={1,3,5,4,2};
        int key=3;
        int l=0;
        int e=4;

        
        for(int i=0;i<5;i++){
            int s=i;
            for(int j=i+1;j<5;j++){
                if(arr[s]>arr[j]){
                    s=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[s];
            arr[s]=temp;
        }
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }

        while(l<=e){
            int mid=(l+e)/2;
            if(arr[mid]>key){
                e=mid;
            }else if(arr[mid]<key){
                l=mid;
            }else{
                System.out.println("key found at index "+mid);
                break;
            }
        }
    }
}
