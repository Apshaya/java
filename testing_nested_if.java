public class testing_nested_if {
    public static void main(String[] args){

        String condition = "Covid";
        String government = "Travelling is restricted";

        if("Covid".equals(condition)){
            if("Travelling is restricted".equalsIgnoreCase(government)){
                //.equalsIgnoreCase is used for ignore the simple and capital letters of the given variable value
                System.out.println("We can't go out!");
            }
            else{
                System.out.println("Only go out if nesessary");
            }
        }
        else{
            System.out.println("Let's party");
        }

    }

}
