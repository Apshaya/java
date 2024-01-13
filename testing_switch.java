public class testing_switch {
    public static void main(String[] args){

        int day = 6;
        String day_name = "";

        switch(day){
            case 1:
                day_name = "day = sunday";
                break;
            case 2:
                day_name = "day = monday";
                break;
            case 3:
                day_name = "day = tuesday";
                break;
            case 4:
                day_name = "day = wednesday";
                break;
            case 5:
                day_name = "day = thursday";
                break;
            case 6:
                day_name = "day = friday";
                break;
            case 7:
                day_name = "day = saturday";
                break;
            default:
                day_name = "Invalid day";
        }
        System.out.println(day_name);
    }
}
