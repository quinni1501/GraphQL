package vn.iotstar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.iotstar.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	// Tìm Category theo tên
	Category findByName(String name);
}