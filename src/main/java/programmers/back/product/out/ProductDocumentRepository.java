package programmers.back.product.out;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import programmers.back.product.domain.ProductDocument;

public interface ProductDocumentRepository extends ElasticsearchRepository<ProductDocument, Long> {
}
