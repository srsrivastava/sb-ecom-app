package com.ecommerce.sb_ecom.service;

import com.ecommerce.sb_ecom.payload.CategoryDTO;
import com.ecommerce.sb_ecom.payload.CategoryResponse;

public interface CategoryService {
    CategoryResponse getCategories();
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    CategoryDTO deleteCategory(Long id);
    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}