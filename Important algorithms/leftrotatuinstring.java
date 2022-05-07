  public static boolean isRotated(String s1, String s2){
        
       String s=s1+s1;
if(s.length()==2){
if(s1.equals(s2)) return true;
return false;
}
//azanom = s2
//amazonamazon = s 
if(s.indexOf(s2)==2 || s.indexOf(s2)==s1.length()-2 ){
return true;
}return false;
    }
    
}