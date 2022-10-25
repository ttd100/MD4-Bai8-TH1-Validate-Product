package rikkei.academy.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import rikkei.academy.model.Product;

public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {
    Page<Product> findAllByNameContaining(String name, Pageable pageable);
    @Query("SELECT p FROM Product as p WHERE p.name LIKE concat('%',:name,'%')" )
    Page<Product> findByNameProduct(@Param("name") String name,Pageable pageable);
    // thực hiện một  câu query xuống mySQL
}
