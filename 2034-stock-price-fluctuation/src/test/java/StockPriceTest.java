import org.junit.jupiter.api.Test;

public class StockPriceTest {
    @Test
    void testCase() {
        StockPrice stockPrice = new StockPrice();
        stockPrice.update(1, 10);
        stockPrice.update(2, 5);
        assert stockPrice.current() == 5;
        assert stockPrice.maximum() == 10;
        stockPrice.update(1, 3);
        assert stockPrice.maximum() == 5;
        stockPrice.update(4, 2);
        assert stockPrice.minimum() == 2;
    }
}
