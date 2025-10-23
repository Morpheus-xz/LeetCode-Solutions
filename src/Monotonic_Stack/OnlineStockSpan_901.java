class StockSpanner {

    Stack<int[]> s;

    public StockSpanner() {
        s = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!s.isEmpty() && price >= s.peek()[0]) { // If the current price is greater than stack peek.
            span += s.peek()[1];
            s.pop();
        }
        s.push(new int[] { price, span });
        return span;
    }

}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */