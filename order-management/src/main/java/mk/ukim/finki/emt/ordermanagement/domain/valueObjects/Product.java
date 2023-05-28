package mk.ukim.finki.emt.ordermanagement.domain.valueObjects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Currency;

@Getter
public class Product implements ValueObject {

    private final ProductId id;
    private final String name;
    private final String description;
    private final boolean hardCover;
    private final Money price;
    private final int sales;

    private Product() {
        this.id=ProductId.randomId(ProductId.class);
        this.name= "";
        this.price = Money.valueOf(Currency.MKD,0);
        this.sales = 0;
        this.description = "";
        this.hardCover = false;
    }

    @JsonCreator
    public Product(@JsonProperty("id") ProductId id,
                   @JsonProperty("title") String name,
                   @JsonProperty("description") String description,
                   @JsonProperty("hardCover") boolean hardCover,
                   @JsonProperty("price") Money price,
                   @JsonProperty("sales") int sales) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.hardCover = hardCover;
        this.price = price;
        this.sales = sales;
    }
}

