package net.swofty.types.generic.item.impl;

public interface PetItem extends ExtraRarityDisplay, ExtraUnderNameDisplay, Unstackable {
    default String getExtraRarityDisplay() {
        return " PET ITEM";
    }

    default String getExtraUnderNameDisplay() {
        return "Consumed on use";
    }
}
