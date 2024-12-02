package vn.iotstar.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String images;

    // Mối quan hệ Many-to-Many với User, dùng List thay vì Set
    @ManyToMany(mappedBy = "categories")
    private List<User> users = new ArrayList<>();
}
