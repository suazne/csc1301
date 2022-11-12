//Suzanne Schouest Hon CSC 1301 Homework 9 Strings PROGRAM #1
import java.util.Scanner;
public class ConvertDate//converts "month day, year" to "Day month year"
{
public static void main(String args[])
{
   Scanner s = new Scanner(System.in);
   System.out.println("Enter a date to be converted:");
   String date = s.nextLine();
   date = date.trim();//gets rid of leading or trailing spaces
   
   int firstSpacePos = date.indexOf(' ');//defines where the space after the month is in the string
   int commaPos = date.indexOf(',');//defines where the comma after the day is in the string
   
   String month = date.substring(0, firstSpacePos);//month string starts at position 0 and ends at first space
   String day = date.substring(firstSpacePos + 1, commaPos);//day string starts at first space and ends at comma
   String year = date.substring(commaPos + 1);//year string starts at comma position and ends at end of date string
   
   month = month.trim();//gets rid of leading or trailing spaces
   day = day.trim();//gets rid of leading or trailing spaces
   year = year.trim();//gets rid of leading or trailing spaces
   
   month = month.toLowerCase();//changes whole month string to lower case
   month = month.substring(0, 1).toUpperCase() + month.substring(1);
   //^isolates first character/letter of month and capitalizes it before adding it to the rest of the month string
   
   System.out.print("Converted date: " + day + ' ' + month + ' ' + year);//prints out final result
}
}