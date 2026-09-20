class Pair {
    int pos, speed;

    public Pair(int pos, int speed) {
        this.pos = pos;
        this.speed = speed;
    }

    public int getPosition() {
        return this.pos;
    }
    public int getSpeed() {
        return this.speed;
    }
    @Override
    public String toString() {
        return "(" + pos + ", " + speed + ")";
    }
}

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<Pair> arr = new ArrayList<>();

        Stack<Double> st = new Stack<>();

        for (int i = 0; i < position.length; i++) {
            arr.add(new Pair(position[i], speed[i]));
        }

        arr.sort((a, b) -> Integer.compare(b.pos, a.pos));

        for (int i = 0; i < arr.size(); i++) {
           double time = (double) (target - arr.get(i).pos) / arr.get(i).speed;

          if( st.empty() ||  st.peek() < time) st.push(time);


        }


        return st.size();
    }
}
