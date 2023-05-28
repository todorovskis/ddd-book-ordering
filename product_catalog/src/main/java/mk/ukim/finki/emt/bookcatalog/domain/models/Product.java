package mk.ukim.finki.emt.bookcatalog.domain.models;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;

import javax.persistence.*;

@Entity
@Table(name="product")
@Getter
public class Product extends AbstractEntity<ProductId> {

    private int sales;

    private String title;

    private String description;

    private boolean hardCover;

    @AttributeOverrides({
            @AttributeOverride(name="amount", column = @Column(name="price_amount", nullable = true)),
            @AttributeOverride(name="currency", column = @Column(name="price_currency", nullable = true))
    })
    private Money price;

    protected Product() {
        super(ProductId.randomId(ProductId.class));
    }

    public static Product build(String title, Money price, int sales) {
        Product p = new Product();
        p.price = price;
        p.title = title;
        p.sales = sales;
        return p;
    }

    public void addSales(int qty) {
        this.sales = this.sales - qty;
    }

    public void removeSales(int qty) {
        this.sales -= qty;
    }
}
