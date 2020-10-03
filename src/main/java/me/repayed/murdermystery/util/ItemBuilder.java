package me.repayed.murdermystery.util;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ItemBuilder {
    private final ItemStack itemStack;
    private final ItemMeta itemMeta;

    public ItemBuilder(Material material) {
        this.itemStack = new ItemStack(material);
        this.itemMeta = this.itemStack.getItemMeta();
    }

    public ItemBuilder withName(String name) {
        this.itemMeta.setDisplayName(Chat.color(name));
        return this;
    }

    public ItemBuilder withLore(String... lore) {
        List<String> fixedLore = Arrays.stream(lore)
                .map(Chat::color)
                .collect(Collectors.toList());

        this.itemMeta.setLore(fixedLore);
        return this;
    }

    public ItemBuilder withHiddenEnchant() {
        this.itemMeta.addEnchant(Enchantment.LUCK, 1, false);
        this.itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        return this;
    }

    public ItemStack build() {
        this.itemStack.setItemMeta(this.itemMeta);
        return this.itemStack;
    }


}
