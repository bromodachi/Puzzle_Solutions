public String[] fizzBuzz(int start, int end) {

        int counter = start;
        String [] fizzBuzz = new String [end-start];
        for (int i = 0; i<fizzBuzz.length ; i++){
            if(i!=0) {
                counter++;
            }
            if(counter%3==0 && counter% 5 ==0){
                fizzBuzz[i] = "FizzBuzz";
            }
            else if(counter%3==0){
                fizzBuzz[i] = "Fizz";
            }
            else if(counter% 5 ==0){
                fizzBuzz[i] = "Buzz";

            }
            else {
                fizzBuzz[i] = String.valueOf(counter);
            }
        }
        return fizzBuzz;

    }
