package com.drozd.inventory.service.interfaces;

import com.drozd.inventory.model.dtos.ItemDTO;

import java.util.List;
import java.util.function.Function;

@FunctionalInterface
public interface RetrieveAllItems extends Function<String, List<ItemDTO>> {
}
