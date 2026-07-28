class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int l = 0;
        int r = people.length - 1;

        int boats = 0;
        // System.out.println("left"+l+", right"+r);
        while(l <= r){ 
            int remaining = limit- people[r] ;
            // System.out.println("inside: left: "+l+", right: "+r+", remaining: "+remaining+", cond: "+(remaining)+", "+people[l]);
            if(remaining >= people[l]){
                l+=1;
            }
            r-=1;
            boats+=1;
        }


        return boats;
    }
}