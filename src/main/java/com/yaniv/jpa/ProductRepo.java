package com.yaniv.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vikumar on 2019-08-16
 */
public interface ProductRepo extends CrudRepository<Product, Integer>, ProductRepoCustom{

}
