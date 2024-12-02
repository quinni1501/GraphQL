package vn.iotstar.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;
	private int quantity;
	private String description;

	// Mối quan hệ với bảng User
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user; // User sở hữu sản phẩm
}
