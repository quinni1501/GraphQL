package vn.iotstar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.iotstar.entity.Product;
import java.util.List;  // Thêm import cho List

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Tìm tất cả các sản phẩm của một người dùng (User)
    List<Product> findByUserId(Long userId);

    // Tìm sản phẩm theo title
    List<Product> findByTitleContaining(String title);
}
