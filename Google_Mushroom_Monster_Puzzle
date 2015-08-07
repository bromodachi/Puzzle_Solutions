import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Created by Conrado on 2015/08/06.
 */
public class MushroomEater {
    boolean firstLine = true;
    int caseNum = 1;
    public static  void main (String [] args){
        MushroomEater doWork  = new MushroomEater();
        doWork.go(args[0]);

    }
    public void go(String fileName){
        readFile(fileName);
    }

    public void readFile(String nameOfFile){
        try{
            BufferedReader br = new BufferedReader(new FileReader(nameOfFile));
            String line;
            int N;
            while((line = br.readLine()) !=null){
                if(firstLine){
                    firstLine = false;
                    continue;
                }
                //assume after first line
                N = Integer.parseInt(line);
                line = br.readLine();
                int [] numbers = new int [N];
                int counter = 0;
                int difference;
                int eatingRate = -1;

                int totalDifference = 0; //solution 1
                int solution2 = 0; //solution 2
                StringTokenizer tokenizer = new StringTokenizer(line, " ");
                while(tokenizer.hasMoreTokens()){
                    numbers[counter] = (Integer.valueOf(tokenizer.nextToken()));
                    counter++;
                }
                for (int i = 0; i<N-1; i++){
                    difference = numbers[(i)] - numbers[(i + 1)];
                    if(difference<0){
                        continue;
                    }
                    eatingRate = Math.max(difference, eatingRate);
                    totalDifference += difference;
                }
                for (int i = 0; i<N-1; i++){
                    solution2 += Math.min(eatingRate, numbers[i]);
                }

                System.out.println("Case #"+caseNum+": "+totalDifference + " "+solution2);
                caseNum++;


            }
        }catch(IOException e){

            System.out.println("An error has occurred");
            System.exit(1);
        }
    }
}
