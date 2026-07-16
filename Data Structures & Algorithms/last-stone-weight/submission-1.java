class Solution {
    PriorityQueue<Integer> pqMax = new PriorityQueue<>(Comparator.reverseOrder());

    public int lastStoneWeight(int[] stones) {
        for(int stone: stones){
            pqMax.add(stone);
        }

        while(pqMax.size() > 1){
            int heavyStone1 = pqMax.poll();
            int heavyStone2 = pqMax.poll();
            heavyStone1 = heavyStone1 - heavyStone2;

            if(heavyStone1 == 0) continue;

            pqMax.add(heavyStone1);
        }

        return pqMax.size() !=0 ? pqMax.poll() : 0;
    }
}
