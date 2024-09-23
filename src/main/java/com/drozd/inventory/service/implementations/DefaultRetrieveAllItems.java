package com.drozd.inventory.service.implementations;

import com.drozd.inventory.model.dtos.ItemDTO;
import com.drozd.inventory.model.entities.Item;
import com.drozd.inventory.repository.ItemRepository;
import com.drozd.inventory.service.interfaces.RetrieveAllItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultRetrieveAllItems implements RetrieveAllItems {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<ItemDTO> apply(String userId) {
        return buildResponseDTO(itemRepository.findAllByUserId(userId));
    }

    private List<ItemDTO> buildResponseDTO(List<Item> items) {
        return items.stream()
                .map(item -> ItemDTO.builder()
                        .name(item.getName())
                        .quantity(item.getQuantity())
                        .build())
                .toList();
    }

}
