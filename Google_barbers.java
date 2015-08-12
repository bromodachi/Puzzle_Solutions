import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by  on 2015/08/10.
 */
public class Barbers {
    ArrayList<Long> barbers;
    int caseNum=1;

    public static void main(String [] args){
        Barbers doWork  = new Barbers();
        doWork.go(args[0]);
    }


    public void go(String fileName){
        readFile(fileName);
    }

    public void readFile(String fileName){
        boolean firstLineBool = true;
        barbers = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            String [] tokenize;
            long myPlace;
            while((line = br.readLine()) !=null){
                if(firstLineBool){
                    firstLineBool = false;
                    continue;
                }
                long upperBound = 0;
                tokenize = line.split(" ");
                line = br.readLine();
                barbers = new ArrayList<>(Integer.parseInt(tokenize[0]));
                myPlace = Integer.parseInt(tokenize[1]);
                tokenize = line.split(" ");
                for (String val : tokenize){
                    barbers.add((Long.parseLong((val))));
                    upperBound = Math.max(upperBound, Long.parseLong(val));
                }
                long max =upperBound* myPlace;
                long use = binarySearch(-1, max, barbers, myPlace);
                long serveredBefore = getCut(use-1, barbers, myPlace);
                long diff = myPlace - serveredBefore;
                int result = 0;
                for (int i = 0; i<barbers.size();i++)
                {
                    if(use % barbers.get(i)  == 0 ){
                        diff--;
                        if (diff == 0) {
                            result = i+1;
                            break;
                        }

                    }
                }
                System.out.println("Case #"+caseNum+ ": "+result);
                caseNum++;
            }
        }catch(IOException e){

            System.out.println("An error has occurred");
            System.exit(1);
        }
    }

    private long binarySearch(long lower, long max, ArrayList<Long> barbers, long myPlace) {
        while (lower + 1 < max) {
            long mid = (lower + max) / 2;
            if (getCut(mid, barbers, myPlace) < myPlace) {
                lower = mid;
            } else {
                max = mid;
            }
        }
        return max;
    }



    public long getCut(long middle, ArrayList<Long> b, long myplace){
        if(middle < 0){
            return 0;
        }
        long result = 0;
        for (int i= 0 ; i < b.size() ; i++){
            result += Math.min(myplace ,middle/ b.get(i) + 1);
        }
        return result ;
    }
}
