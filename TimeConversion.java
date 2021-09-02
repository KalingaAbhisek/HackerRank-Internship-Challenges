import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String sin24hr="";
    String hh = s.valueOf(s.charAt(0))+s.valueOf(s.charAt(1));
    int h1= Integer.parseInt(hh);
    if(s.contains("PM")) {
        if(h1!=12)
        sin24hr=((h1+12)+":"+ s.valueOf(s.charAt(3)) + s.valueOf(s.charAt(4)) + ":" + s.valueOf(s.charAt(6))+s.valueOf(s.charAt(7)));
        else
            sin24hr=((h1)+":"+ s.valueOf(s.charAt(3)) + s.valueOf(s.charAt(4)) + ":" + s.valueOf(s.charAt(6))+s.valueOf(s.charAt(7)));
        
    }
    else if(s.contains("AM")){
        if(h1==12)
            sin24hr=((h1-12)+""+(h1-12)+":"+ s.valueOf(s.charAt(3)) + s.valueOf(s.charAt(4)) + ":" + s.valueOf(s.charAt(6))+s.valueOf(s.charAt(7)));
        else if(h1>=1 && h1<=9)
            sin24hr=(0+""+(h1)+":"+ s.valueOf(s.charAt(3)) + s.valueOf(s.charAt(4)) + ":" + s.valueOf(s.charAt(6))+s.valueOf(s.charAt(7)));
        else
            sin24hr=((h1)+":"+ s.valueOf(s.charAt(3)) + s.valueOf(s.charAt(4)) + ":" + s.valueOf(s.charAt(6))+s.valueOf(s.charAt(7)));
    }
       return sin24hr;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
