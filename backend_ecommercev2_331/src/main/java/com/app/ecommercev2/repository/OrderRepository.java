package com.app.ecommercev2.repository;

import com.app.ecommercev2.model.Order;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class OrderRepository extends SimpleJpaRepository<Order, String> {
    private final EntityManager em;
    public OrderRepository(EntityManager em) {
        super(Order.class, em);
        this.em = em;
    }
    @Override
    public List<Order> findAll() {
        return em.createNativeQuery("Select * from \"ecommercev2_822\".\"Order\"", Order.class).getResultList();
    }
}