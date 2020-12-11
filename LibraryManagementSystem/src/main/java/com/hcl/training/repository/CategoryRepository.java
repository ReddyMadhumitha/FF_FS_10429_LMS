/**
 * 
 */
package com.hcl.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.training.model.Category;

/**
 * @author reddy-madhumitha
 *
 */
@Repository
public interface CategoryRepository  extends JpaRepository<Category,Integer>{

}
