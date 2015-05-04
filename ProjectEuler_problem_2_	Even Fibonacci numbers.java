public int [] findTheEvenSum(){
        int sum = 0;
        int test [] = new int [1000];
        //initializing it to 10000 is pointless, waste of space.
        test[0] = 1;
        test[1] =1;
        for( int i = 2; i<1000; i++){

            test[i] = test[i-1]+test[i-2];
            if(test[i]>4000000){
                System.out.println("the sum is: "+sum);
                break;
            }

            if(test[i]%2 ==0 ){
                sum = sum+test[i];
            }
        }
        return test;
    }
