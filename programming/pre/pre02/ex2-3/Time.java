import java.io.*;
import java.util.*;

public class Time {
    public static void main(String[] args){
	int hour = 16;
	int min = 57;
	int sec = 12;

	int sinceMidnight = sec + min * 60 + hour * 3600;
	System.out.println("Seconds since Midnight: " + sinceMidnight);

	int totalSeconds = 24 * 3600;
	System.out.println("Seconds until Midnight: " + (totalSeconds - sinceMidnight));

	double seconds = sinceMidnight;
	double total = totalSeconds;
  double percent = (seconds / total) * 100;
	System.out.printf("Percent: %.02f " , percent);
  
	int start = sinceMidnight;
	hour = 17;
	min = 22;
	sec = 5;

	int now = sec + min * 60 + hour * 3600;
	System.out.println("Elapsed: " + (now - start));
    }
}
    
