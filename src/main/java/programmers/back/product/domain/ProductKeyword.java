package programmers.back.product.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
public class ProductKeyword {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@Setter
	@Getter
	private Product product;

	@Column
	@Getter
	@Setter
	private String keyword;

	public ProductKeyword(String keyword) {
		this.keyword = keyword;
	}
}
