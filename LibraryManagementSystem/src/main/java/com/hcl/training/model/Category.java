/**
 * 
 */
package com.hcl.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author reddy-madhumitha
 *
 */
@Entity
@Table(name="Category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category {
	 @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
	 private String categoryName;
	
}
