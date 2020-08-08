package utils;

import java.util.Calendar;

public class ApplicationUtils {

    public static String getCurrentTimeStampForMatted() {

        String returningStringDate = "Something went wrong...";
        String dateInString = Calendar.getInstance().getTime().toString();
        String month = dateInString.split(" ")[1];
        String year = dateInString.split(" ")[dateInString.split(" ").length - 1];
        String[] monthsStringsShort = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] monthsStrings = {
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"
        };

        for (int i = 0; i < monthsStringsShort.length; i++) {
            if (month.equalsIgnoreCase(monthsStringsShort[i])) {
                returningStringDate = monthsStrings[i] + " " + year;
            }
        }

        return returningStringDate;
    }
}
