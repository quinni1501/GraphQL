package vn.iotstar.graphql;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;
import vn.iotstar.entity.Category;
import vn.iotstar.entity.User;
import vn.iotstar.repository.CategoryRepository;
import vn.iotstar.repository.UserRepository;

import java.util.List;

@Component
public class GraphQLResolver {

    private final UserRepository userRepository;
    private final CategoryRepository categoryRepository;

    public GraphQLResolver(UserRepository userRepository, CategoryRepository categoryRepository) {
        this.userRepository = userRepository;
        this.categoryRepository = categoryRepository;
    }

    @QueryMapping
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @QueryMapping
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @QueryMapping
    public List<Category> getCategoriesByUser(Long userId) {
        return userRepository.findById(userId).get().getCategories().stream().toList();
    }
}
