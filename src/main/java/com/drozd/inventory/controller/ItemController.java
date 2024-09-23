package com.drozd.inventory.controller;

import com.drozd.inventory.model.dtos.ItemDTO;
import com.drozd.inventory.service.interfaces.RetrieveAllItems;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private RetrieveAllItems retrieveAllItems;

    @GetMapping
    public ResponseEntity<List<ItemDTO>> getItems(
            @Valid @NotBlank @RequestParam(name = "user_id") String userId) {
        return ResponseEntity.ok(retrieveAllItems.apply(userId));
    }

    @PostMapping
    public ResponseEntity<Void> addItem(
            @Valid @NotBlank @RequestParam(name = "user_id") String userId) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteItem(
            @Valid @NotBlank @RequestParam(name = "user_id") String userId) {
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> editItem(
            @Valid @NotBlank @RequestParam(name = "user_id") String userId) {
        return ResponseEntity.ok().build();
    }

}
