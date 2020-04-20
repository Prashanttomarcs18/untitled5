package lab1;

public class Lab1 {public static void main(String args[])
{
    Lab1 res = new Lab1();
    int[] arr = {1,1,2,2,3,4,55,4,4,4,56,7,7};
    //int number = 2;
    //res.printOccurence(arr,number);
    res.printDuplicate(arr);
}

    public void printOccurence(int[] arr,int number){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==number){
                System.out.println(i);
            }
        }
    }

    public void printDuplicate(int[] arr){
        String s = "";
        for (int i =0 ;i<arr.length;i++){
            int temp  = arr[i];
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]==temp){
                    //System.out.println(arr[j]);
                    s+=arr[i];
                    break;
                }
            }

        }
        System.out.println(s.toString());
    }
}

