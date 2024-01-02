package com.example.likelist.wishlist.repository;

import com.example.likelist.DB.MemoryDbRepositoryAbstract;
import com.example.likelist.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
}
