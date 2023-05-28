//package mk.ukim.finki.emt.bookcatalog.domain.models;
//
//
//import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;
//
//import javax.validation.constraints.NotNull;
//
//public class BookId extends DomainObjectId {
//
//    private BookId() {
//        super(BookId.randomId(BookId.class).getId());
//    }
//
//    public BookId(@NotNull String uuid) {
//        super(uuid);
//    }
//
//    public static BookId of(String uuid) {
//        BookId p = new BookId(uuid);
//        return p;
//    }
//
//}
