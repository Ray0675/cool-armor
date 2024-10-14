package net.raylirov.coolarmor.datagen.generators;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.armor.ModArmorMaterials;
import net.raylirov.coolarmor.init.ModItems;
import net.raylirov.coolarmor.util.ArmorFilter;

import java.util.LinkedHashMap;

public class ModItemModelGenerator extends ItemModelProvider {

    public ModItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CoolArmor.MOD_ID, existingFileHelper);
    }

    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.TINTED_UPGRADE_SMITHING_TEMPLATE);
        simpleItem(ModItems.WOOLED_UPGRADE_SMITHING_TEMPLATE);
        simpleItem(ModItems.LEATHER_UPGRADE_SMITHING_TEMPLATE);
        simpleItem(ModItems.TURTLE_UPGRADE_SMITHING_TEMPLATE);
        simpleItem(ModItems.GILDED_UPGRADE_SMITHING_TEMPLATE);

        trimmedArmorItem(ModItems.NETHERITE_TINTED_HELMET);
        trimmedArmorItem(ModItems.DIAMOND_TINTED_HELMET);
        trimmedArmorItem(ModItems.GOLDEN_TINTED_HELMET);
        trimmedArmorItem(ModItems.CHAINMAIL_TINTED_HELMET);
        trimmedArmorItem(ModItems.IRON_TINTED_HELMET);
        trimmedArmorItem(ModItems.LEATHER_TINTED_HELMET);

        trimmedArmorItem(ModItems.IRON_WOOLED_BOOTS);

        trimmedArmorItem(ModItems.NETHERITE_GILDED_HELMET);
        trimmedArmorItem(ModItems.NETHERITE_GILDED_CHESTPLATE);
        trimmedArmorItem(ModItems.NETHERITE_GILDED_LEGGINGS);
        trimmedArmorItem(ModItems.NETHERITE_GILDED_BOOTS);

        trimmedArmorItem(ModItems.NETHERITE_TURTLE_HELMET);
        trimmedArmorItem(ModItems.NETHERITE_TURTLE_CHESTPLATE);
        trimmedArmorItem(ModItems.NETHERITE_TURTLE_LEGGINGS);
        trimmedArmorItem(ModItems.NETHERITE_TURTLE_BOOTS);

        trimmedArmorItem(ModItems.NETHERITE_LEATHERED_HELMET);
        trimmedArmorItem(ModItems.NETHERITE_LEATHERED_CHESTPLATE);
        trimmedArmorItem(ModItems.NETHERITE_LEATHERED_LEGGINGS);
        trimmedArmorItem(ModItems.NETHERITE_LEATHERED_BOOTS);

        trimmedArmorItem(ModItems.DIAMOND_LEATHERED_HELMET);
        trimmedArmorItem(ModItems.DIAMOND_LEATHERED_CHESTPLATE);
        trimmedArmorItem(ModItems.DIAMOND_LEATHERED_LEGGINGS);
        trimmedArmorItem(ModItems.DIAMOND_LEATHERED_BOOTS);

        trimmedArmorItem(ModItems.GOLDEN_LEATHERED_HELMET);
        trimmedArmorItem(ModItems.GOLDEN_LEATHERED_CHESTPLATE);
        trimmedArmorItem(ModItems.GOLDEN_LEATHERED_LEGGINGS);
        trimmedArmorItem(ModItems.GOLDEN_LEATHERED_BOOTS);

        trimmedArmorItem(ModItems.CHAINMAIL_LEATHERED_HELMET);
        trimmedArmorItem(ModItems.CHAINMAIL_LEATHERED_CHESTPLATE);
        trimmedArmorItem(ModItems.CHAINMAIL_LEATHERED_LEGGINGS);
        trimmedArmorItem(ModItems.CHAINMAIL_LEATHERED_BOOTS);

        trimmedArmorItem(ModItems.IRON_LEATHERED_HELMET);
        trimmedArmorItem(ModItems.IRON_LEATHERED_CHESTPLATE);
        trimmedArmorItem(ModItems.IRON_LEATHERED_LEGGINGS);
        trimmedArmorItem(ModItems.IRON_LEATHERED_BOOTS);
    }


    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = CoolArmor.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };


                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                String tintedoverlay = "item/tinted_" + armorType + "_overlay";
                String tintedleatheroverlay = "item/leather_tinted_" + armorType + "_overlay";
                String leatheroverlay = "item/leathered_" + armorType + "_overlay";
                String wooledoverlay = "item/wooled_" + armorType + "_overlay";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath);
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);
                ResourceLocation tintedoverlayResLoc = new ResourceLocation(MOD_ID, tintedoverlay);
                ResourceLocation tintedleatheroverlayResLoc = new ResourceLocation(MOD_ID, tintedleatheroverlay);
                ResourceLocation leatheroverlayResLoc = new ResourceLocation(MOD_ID, leatheroverlay);
                ResourceLocation wooledoverlayResLoc = new ResourceLocation(MOD_ID, wooledoverlay);

                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                if (ArmorFilter.trimArmorAnyLeatherArmor(itemRegistryObject)){
                    if (armorItem.getMaterial() == ModArmorMaterials.LEATHER_TINTED) {
                        getBuilder(currentTrimName)
                                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                                .texture("layer1", armorItemResLoc)
                                .texture("layer0", tintedleatheroverlayResLoc)
                                .texture("layer2", tintedoverlayResLoc)
                                .texture("layer3", trimResLoc);
                    } else {
                        getBuilder(currentTrimName)
                                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                                .texture("layer1", armorItemResLoc)
                                .texture("layer0", leatheroverlayResLoc)
                                .texture("layer2", trimResLoc);
                    }
                } else if(ArmorFilter.trimArmorAnyTintedHelmet(itemRegistryObject)){
                    getBuilder(currentTrimName)
                            .parent(new ModelFile.UncheckedModelFile("item/generated"))
                            .texture("layer1", armorItemResLoc)
                            .texture("layer0", tintedoverlayResLoc)
                            .texture("layer2", trimResLoc);
                } else if(ArmorFilter.trimArmorAnyWooledArmor(itemRegistryObject)){
                    getBuilder(currentTrimName)
                            .parent(new ModelFile.UncheckedModelFile("item/generated"))
                            .texture("layer1", armorItemResLoc)
                            .texture("layer0", wooledoverlayResLoc)
                            .texture("layer2", trimResLoc);
                } else {
                    getBuilder(currentTrimName)
                            .parent(new ModelFile.UncheckedModelFile("item/generated"))
                            .texture("layer0", armorItemResLoc)
                            .texture("layer1", trimResLoc);

                }

                if (ArmorFilter.trimArmorAnyLeatherArmor(itemRegistryObject)) {
                    if (armorItem.getMaterial() == ModArmorMaterials.LEATHER_TINTED) {
                        this.withExistingParent(itemRegistryObject.getId().getPath(),
                                        mcLoc("item/generated"))
                                .override()
                                .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                                .predicate(mcLoc("trim_type"), trimValue).end()
                                .texture("layer0", new ResourceLocation(MOD_ID, "item/" + itemRegistryObject.getId().getPath()))
                                .texture("layer2", new ResourceLocation(MOD_ID, "item/tinted_" + armorType + "_overlay"))
                                .texture("layer1", new ResourceLocation(MOD_ID, "item/leather_tinted_" + armorType + "_overlay"));
                    } else {
                        this.withExistingParent(itemRegistryObject.getId().getPath(),
                                        mcLoc("item/generated"))
                                .override()
                                .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                                .predicate(mcLoc("trim_type"), trimValue).end()
                                .texture("layer1", new ResourceLocation(MOD_ID, "item/" + itemRegistryObject.getId().getPath()))
                                .texture("layer0", new ResourceLocation(MOD_ID, "item/leathered_" + armorType + "_overlay"));
                    }
                } else if (ArmorFilter.trimArmorAnyTintedHelmet(itemRegistryObject)) {
                    this.withExistingParent(itemRegistryObject.getId().getPath(),
                                    mcLoc("item/generated"))
                            .override()
                            .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                            .predicate(mcLoc("trim_type"), trimValue).end()
                            .texture("layer1", new ResourceLocation(MOD_ID, "item/" + itemRegistryObject.getId().getPath()))
                            .texture("layer0", new ResourceLocation(MOD_ID, "item/tinted_" + armorType + "_overlay"));
                } else if (ArmorFilter.trimArmorAnyWooledArmor(itemRegistryObject)) {
                    this.withExistingParent(itemRegistryObject.getId().getPath(),
                                    mcLoc("item/generated"))
                            .override()
                            .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                            .predicate(mcLoc("trim_type"), trimValue).end()
                            .texture("layer1", new ResourceLocation(MOD_ID, "item/" + itemRegistryObject.getId().getPath()))
                            .texture("layer0", new ResourceLocation(MOD_ID, "item/wooled_" + armorType + "_overlay"));
                }
                else {
                    this.withExistingParent(itemRegistryObject.getId().getPath(),
                                    mcLoc("item/generated"))
                            .override()
                            .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                            .predicate(mcLoc("trim_type"), trimValue).end()
                            .texture("layer0", new ResourceLocation(MOD_ID, "item/" + itemRegistryObject.getId().getPath()));
                }
            });
        }
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CoolArmor.MOD_ID,"item/" + item.getId().getPath()));
    }

}
