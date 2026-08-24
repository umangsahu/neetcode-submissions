class Solution {
    public int calPoints(String[] operations) {
        int size = operations.length;
        List<Integer> arr = new ArrayList<>();



        for(int i=0; i<size; i++){

            if(operations[i].equals("+")){
                int a = arr.get(arr.size() -2);
                int b = arr.get(arr.size() -1);
                arr.add(a+b);
            }else if(operations[i].equals("C")){
              arr.remove(arr.size() -1);
            }else if(operations[i].equals("D")){
                int a = arr.get(arr.size() -1);
                 arr.add(a*2);
            }else{
                arr.add(Integer.parseInt(operations[i]));
            }

        }

        // System.out.println(Arrays.toString(arr));

        int ans =0;
        for(int i=0;i<arr.size();i++){
          ans+=arr.get(i);
        }



        return ans;
    }
}