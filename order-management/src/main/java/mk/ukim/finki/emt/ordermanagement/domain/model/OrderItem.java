package mk.ukim.finki.emt.ordermanagement.domain.model;

import lombok.Getter;
import lombok.NonNull;
import mk.ukim.finki.emt.ordermanagement.domain.valueObjects.ProductId;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "order_item")
@Getter
public class OrderItem extends AbstractEntity<OrderItemId> {

    @AttributeOverrides({
            @AttributeOverride(name="amount", column = @Column(name="item_price_amount")),
            @AttributeOverride(name="currency", column = @Column(name="item_price_currency"))
    })
    @Column(nullable = false)
    private Money itemPrice;

    @Column(name = "qty", nullable = false)
    private int quantity;

    @AttributeOverride(name = "id", column = @Column(name = "product_id", nullable = false))
    private ProductId productId;

    public OrderItem(@NonNull ProductId productId, @NonNull Money instrumentPrice, int qty) {
        super(DomainObjectId.randomId(OrderItemId.class));
        this.productId = productId;
        this.itemPrice = instrumentPrice;
        this.quantity = qty;

    }

    public OrderItem() {
        super(DomainObjectId.randomId(OrderItemId.class));
    }

    public Money subtotal(){
        return itemPrice.multiply(quantity);
    }

}
