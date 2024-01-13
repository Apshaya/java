public class testing_continue {
    
    public static void main(String[] args){

        for (int i = 0; i <15; i++) {
            
            
            if(i==8){
                System.out.println("Inside the loop: " + i);
                continue;
            }
        System.out.println("Outside the loop: " + i);
        }
    }
}
