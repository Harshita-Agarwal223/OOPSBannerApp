public class ReplaceNumber{
    public static void main(String [] args){
        int []a = {10,7,47,23,11,20};
        int sum=0;
        System.out.println("Modified Array");
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(a[i]%2==0)
                a[i]=1;
             else{
                    a[i]=0;
            }
            System.out.print(a[i]+" ");
        }
        System.out.println("\nSum of array = "+sum);
    }
}