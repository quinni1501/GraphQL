package vn.iotstar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.iotstar.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	// Tìm User theo email
	User findByEmail(String email);

	// Kiểm tra sự tồn tại của User theo email
	boolean existsByEmail(String email);
}
