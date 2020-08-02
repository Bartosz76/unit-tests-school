package bm.app.moduleTwo;

import java.math.BigDecimal;
import java.util.UUID;

public class Product {
    UUID id;
    BigDecimal netPrice;

    public Product(UUID id, BigDecimal netPrice){
        this.id = id;
        this.netPrice = netPrice;
    }

    public BigDecimal getNetPrice() {
        return netPrice;
    }
}
