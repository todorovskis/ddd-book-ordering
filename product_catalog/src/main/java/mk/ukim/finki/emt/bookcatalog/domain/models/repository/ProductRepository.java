package mk.ukim.finki.emt.bookcatalog.domain.models.repository;

import mk.ukim.finki.emt.bookcatalog.domain.models.Product;
import mk.ukim.finki.emt.bookcatalog.domain.models.ProductId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, ProductId> {
}