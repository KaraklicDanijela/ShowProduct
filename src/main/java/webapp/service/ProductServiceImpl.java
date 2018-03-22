package webapp.service;

import webapp.model.AddressComponents;
import webapp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webapp.repository.ProductRepository;
import javax.transaction.Transactional;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    @Transactional
    public Product findById(Integer id) {
        return productRepository.findOne(id);
    }
}
