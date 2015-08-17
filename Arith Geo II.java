 String ArithGeoII(int[] arr) {
        int multi = 0;
        boolean Geo= true;
        if((arr[arr.length-1] % arr[arr.length-2])==0){
            multi = arr[arr.length-1] / arr[arr.length-2];
            for (int i=0; i<arr.length-1; i++){
                int geo = arr[i]*multi;
                if(geo ==arr[i+1]){
                    continue;
                }
                else{
                    Geo=false;
                    break;
                }
            }
        }
        if((arr[arr.length-1] % arr[arr.length-2])!=0){
            Geo=false;
        }
        if(!Geo){
            int difference = arr[1] - arr[0];
            for (int i=0; i<arr.length-1; i++){
                if(arr[i]+difference != arr[1+i]){
                    return "-1";
                }
            }
            return "Arithmetic";
        }
        return "Geometric";

    }
