class StockSpanner {
    List<Integer> arr = new ArrayList<>();

    public StockSpanner() {}

    public int next(int price) {
        int days = 0;
        arr.add(price);
        for (int i = arr.size() - 1; i >= 0; i--) {
            if(arr.get(i) <= arr.get(arr.size() - 1) ){
              days++;
            }else{
                break;
            }
        }

        return days;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */