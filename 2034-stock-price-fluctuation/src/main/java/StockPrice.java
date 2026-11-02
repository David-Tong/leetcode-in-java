import java.util.HashMap;
import java.util.TreeMap;

class StockPrice {
    private int lastestTimestamp;
    private final HashMap<Integer, Integer> timeToPrice;
    private final TreeMap<Integer, Integer> priceCount;

    public StockPrice() {
        lastestTimestamp = 0;
        timeToPrice = new HashMap<>();
        priceCount = new TreeMap<>();
    }

    public void update(int timestamp, int price) {
        lastestTimestamp = Math.max(lastestTimestamp, timestamp);
        Integer oldPrice = timeToPrice.put(timestamp, price);
        if (oldPrice != null) {
            priceCount.compute(oldPrice, (k, v) -> v == 1 ? null : v - 1);
        }
        priceCount.merge(price, 1, Integer::sum);
    }

    public int current() {
        return timeToPrice.get(lastestTimestamp);
    }

    public int maximum() {
        return priceCount.lastKey();
    }

    public int minimum() {
        return priceCount.firstKey();
    }
}