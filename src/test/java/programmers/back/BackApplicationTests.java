package programmers.back;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.testcontainers.utility.TestcontainersConfiguration;

import programmers.back.domain.Product;
import programmers.back.out.ProductRepository;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class BackApplicationTests {
	@Autowired
	private ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

	@Test
	@DisplayName("JPA 테스트")
	void t1(){
		assertDoesNotThrow(()->{
			Product product = new Product();
			product.setName("테스트 상품");

			product.addKeyword("키워드1");
			product.addKeyword("키워드2");

			productRepository.save(product);
		});
	}

}
