//package mk.ukim.finki.emt.bookcatalog.domain.models;
//
//import lombok.Getter;
//import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
//import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;
//import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
//
//import javax.persistence.Entity;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "books")
//@Getter
//public class Book extends AbstractEntity<BookId> {
//
//    private int sales;
//
//    private String title;
//
//    private String description;
//
//    private boolean hardCover;
//
//    private Money price;
//
//    protected Book() {
//        super(BookId.randomId(BookId.class));
//    }
//
//    public static Book build(String title, Money price, int sales) {
//        Book p = new Book();
//        p.price = price;
//        p.title = title;
//        p.sales = sales;
//        return p;
//    }
//
//    public void addSales(int qty) {
//        this.sales = this.sales - qty;
//    }
//
//    public void removeSales(int qty) {
//        this.sales -= qty;
//    }
//}
