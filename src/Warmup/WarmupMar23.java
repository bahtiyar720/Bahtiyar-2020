package Warmup;

/*
write a program that can define the age groups of a person
             age groups are:
                    baby (< 3 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                     Middle-YoungAged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
 */
public class WarmupMar23 {
    public static void main(String[] args) {
        int ageGroup = 23;
        String result = "";
        if (ageGroup < 3) {
            result = " is baby";
        } else if (ageGroup >= 3 && ageGroup <= 5) {
            result = " is Toddler";
        } else if (ageGroup >= 6 && ageGroup <= 9) {
            result = " is kid";
        } else if (ageGroup >= 10 && ageGroup <= 12) {
            result = " is Pre-Teen";
        } else if (ageGroup >= 13 && ageGroup <= 17) {
            result = " is Teenager";
        } else if (ageGroup >= 18 && ageGroup <= 20) {
            result = " is Young Adult";
        } else if (ageGroup >= 21 && ageGroup <= 39) {
            result = " is Adult";
        } else if (ageGroup >= 40 && ageGroup <= 49) {
            result = " is Middle-YoungAged Adult";
        } else if (ageGroup >= 50 && ageGroup <= 54) {
            result = " is Middle-Aged Adult ";
        } else if (ageGroup >= 55 && ageGroup <= 64) {
            result = " is Very Young Senior Citizen";
        } else if (ageGroup >= 65 && ageGroup <= 74) {
            result = " is Young Senior Citizen";
        } else if (ageGroup >= 75 && ageGroup <= 84) {
            result = " is Senior Citizen";
        } else {
            result = " is Old Senior Citizen";
        }
        System.out.println(ageGroup + result);
    }
}
