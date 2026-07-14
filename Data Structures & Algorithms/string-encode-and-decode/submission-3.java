class Solution {
    char delimeter = '•';

    public String encode(List<String> strs) {
     int size= strs.size();
     String s = "";
     for(int i=0;i<size;i++){
          s+=strs.get(i);
      
            s+=delimeter;
          
     }

     return s;
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();

        int strSize = str.length();
         String temp = "";
        for(int i=0;i<strSize;i++){
           
            if(str.charAt(i) == delimeter){
               ans.add(temp);
               temp="";
            }else{
             temp += str.charAt(i);
            }
        }

        return ans;
    }
}
