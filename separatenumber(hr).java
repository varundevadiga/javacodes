 // Complete the separateNumbers function below.
    static void separateNumbers(String s) {
    boolean valid = false;
    String substring = "";
    for(int i=1;i<=s.length()/2;i++){
      substring = s.substring(0,i);
        
        long num = Long.parseLong(substring);
        String value = substring;
        while(value.length()<s.length()){
              value+=Long.toString(++num);
        }
        if(s.equals(value)){
            valid = true;
            break;
        }
    }
    System.out.println(valid ? "YES "+substring : "NO");

    }