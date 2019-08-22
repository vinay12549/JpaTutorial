package com.yaniv.jpa;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by vikumar on 2019-08-17
 */

@Transactional
public class ProductRepoCustomImpl implements ProductRepoCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save() {
        Product product = new Product();
        product.setDesc("desc");
        product.setName("nemffm");
        product.setPrice(34243.5645);
        em.persist(product);
    }
}
