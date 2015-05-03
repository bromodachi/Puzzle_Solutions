public int[] squareUp(int n) {
  return fix(squareUp2(n));
}
public int [] fix (int [] n){
        for (int i = 0; i<n.length; i ++){
            if(n[i]!= 0 && n[i] !=1){
                int toFill= n[i];
                while(toFill!= 1){
                    i++;
                    n[i] = --toFill;

                }
            }
        }
        return n;
    }

    public int[] squareUp2(int n) {

        int [] array = new int [n*n];

        boolean go = false;
        int counter = 1;
        for (int i= 0 ; i<array.length ; i++){
            if(i%n == (n-1)){
                array[i] = 1;
                go= true;
                counter++;

            }
            if(go) {
                if (i % n == (n - counter)) array[i] = counter;
            }
        }
        return array;
    }
