public class DaysAndYears{
    public static void main(String[] args){
        int days=465;
        int years=days/365;
        int remainingDays=days%365;
        System.out.printf("%d years %d remainingDays",years,remainingDays);
    }
}