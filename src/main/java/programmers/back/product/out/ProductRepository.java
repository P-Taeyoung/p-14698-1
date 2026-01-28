package programmers.back.product.out;

import org.springframework.data.repository.CrudRepository;

import programmers.back.product.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
