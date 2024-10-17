import java.util.*;
public class L05Q05 {
    public static void printList(int[] list){
        int each;
        for(each = 0; each < 19; each++){
            System.out.print(list[each] + ", ");
        }
        System.out.print(list[each]);
        System.out.println();
    }
    
    public static int binarySearch(int[] list, int target){
        int left = 0;
        int right = list.length - 1;
        int mid;
        int loopCt = 1;

        while(left <= right){
            mid = (left + right)/2;
            
            if(list[mid] == target){
                return(loopCt);
            }
            
            else if(list[mid] > target){
                left = mid + 1;
            }
            
            else{
                right = mid - 1;
            }
            loopCt++;
        }
        return(-1);
    }
    
    public static int linearSearch(int[] list, int target){
        for(int i = 1; i <= 20; i++){
            if (list[i] == target){
                return(i+1);
            }
        }
        return(-1);
    }
    
    
    public static void main(String[] args){
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        
        int[] randomList = new int[20];
        
        for(int ct = 0; ct < 20; ct++){
            randomList[ct] = random.nextInt(101);
        }
        
        System.out.println("A list of 20 random integer within 0 to 100");
        printList(randomList);
        
        System.out.println("Array in descending order");
        for (int i = 0; i < randomList.length - 1; i++){
            for (int j = 0; j < randomList.length - i - 1; j++){
                if (randomList[j] < randomList[j+1]){
                    int temp = randomList[j+1];
                    randomList[j+1] = randomList[j];
                    randomList[j] = temp;
                }
            }
        }
        printList(randomList);
        
        System.out.print("Enter a number to search: ");
        int search = input.nextInt();
        
        int numberOfLoop;
        // linear search
        numberOfLoop = linearSearch(randomList, search);
        if(numberOfLoop > 0){
            System.out.println(search + " found");
            System.out.println("Linear Search - " + numberOfLoop + " loop(s)");
        } else {
            System.out.println(search + " not found");
        }
        
        // binary search
        numberOfLoop = binarySearch(randomList, search);
        if(numberOfLoop > 0){
            System.out.println(search + " found");
            System.out.println("Linear Search - " + numberOfLoop + " loop(s)");
        } else {
            System.out.println(search + " not found");
        }
        
        
    }
}
