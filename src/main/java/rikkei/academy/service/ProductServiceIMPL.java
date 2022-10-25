package rikkei.academy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import rikkei.academy.model.Product;
import rikkei.academy.repository.IProductRepository;

import java.util.Optional;

@Service
public class ProductServiceIMPL implements IProductService{
    @Autowired
    IProductRepository productRepository;

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Page<Product> findAllByNameContaining(String name, Pageable pageable) {
        return productRepository.findAllByNameContaining(name, pageable);
    }

    @Override
    public Page<Product> findByNameProduct(String name, Pageable pageable) {
        return productRepository.findByNameProduct(name, pageable);
    }
}
