package com.bluecoffee.repository;

import com.bluecoffee.domain.BookStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by qianlong on 16/10/2.
 */
public interface BookStoeDao extends JpaRepository<BookStore,Long> {

    @Query("from BookStore bs where bs.storeManager = :storeManager")
    List<BookStore> getBookStoreByManager(@Param("storeManager") String storeManager);
}
