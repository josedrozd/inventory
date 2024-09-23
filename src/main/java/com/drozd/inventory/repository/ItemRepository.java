package com.drozd.inventory.repository;

import com.drozd.inventory.model.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    Optional<Item> findByNameAndUserId(String name, String userId);

    List<Item> findAllByUserId(String userId);

}