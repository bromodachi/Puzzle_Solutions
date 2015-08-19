boolean ArrayAddition(int[] arr) { 
//pretty slow solution to this problem
    int max = 0;
        int previousMax;
        int index = 0;
        int  counter=-1;
        for (int b : arr ){
            previousMax=max;
            max = Math.max(b, max);
            counter++;
            if(max !=previousMax) {
                index = counter;
            }
        }
        int numOfSubsets = 1 << arr.length;
        int sum =0;
        for(int i = 0; i < numOfSubsets; i++)
        {
            int pos = arr.length - 1;
            int bitmask = i;

            while(bitmask > 0)
            {
                if((bitmask & 1) == 1  && pos!=index) {
                    sum += arr[pos];
                }
                if(sum ==max){
                    return true;
                }
                bitmask >>= 1;
                pos--;
            }
            sum =0;
        }
        return false;
  } 
