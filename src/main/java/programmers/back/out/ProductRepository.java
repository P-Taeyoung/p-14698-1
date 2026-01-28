package programmers.back.out;

import org.springframework.data.repository.CrudRepository;

import programmers.back.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
