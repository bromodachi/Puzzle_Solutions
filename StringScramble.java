 Boolean StringScramble(String str1, String str2) {
        int counter = 0;
        int index = 0;
        char [] char1 = str1.toCharArray();
        char [] char2  = str2.toCharArray();
        for (int i = 0; i<char2.length; i++){
            String temp ="";
            for (int j = 0; j<char1.length; j++) {
                if (char1[j]== char2[i]) {
                    char1[j] = '#';
                    //   counter = 0;
                    counter++;
                    break;
                }
            }
        }
        if(counter== str2.length())
        {
            return true;
        }
        return false;

    }
