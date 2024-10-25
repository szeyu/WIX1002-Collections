public class L01Q04 {
    public static int maximum(int[] amount){
        int max = amount[0];
        for(int i = 1; i < amount.length; i++){
            if(amount[i] > max){
                max = amount[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args){
        String[] months = {"January ", "February", "March   ", "April   ", "May     ", "June    "};
        int[] amount = {2500, 1600, 2000, 2700, 3200, 800};
        int max = maximum(amount);
        
        int barLength = 15;
        
        System.out.println("Month   |                              Amount                              |");
        for(int j = 0; j < amount.length; j++){
            System.out.print(months[j] + "  ");
            for(int ct = 0; ct < (barLength*amount[j]/max); ct++){
                System.out.print("#");
            }
            System.out.println();
        }
        
    }
}
