package net.raylirov.coolarmor.main.datagen.generators;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.raylirov.coolarmor.CoolArmor;
import net.raylirov.coolarmor.content.armor.CAArmorMaterials;
import net.raylirov.coolarmor.main.init.CAItems;
import net.raylirov.coolarmor.main.utils.ArmorHelper;

import java.util.LinkedHashMap;

public class CAItemModelGenerator extends ItemModelProvider {

    public CAItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CoolArmor.MOD_ID, existingFileHelper);
    }

    private static final LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
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
        simpleItem(CAItems.TINTED_UPGRADE_SMITHING_TEMPLATE);
        simpleItem(CAItems.WOOLED_UPGRADE_SMITHING_TEMPLATE);
        simpleItem(CAItems.LEATHER_UPGRADE_SMITHING_TEMPLATE);
        simpleItem(CAItems.TURTLE_UPGRADE_SMITHING_TEMPLATE);
        simpleItem(CAItems.GILDED_UPGRADE_SMITHING_TEMPLATE);

        trimmedArmorItem(CAItems.NETHERITE_TINTED_HELMET);
        trimmedArmorItem(CAItems.DIAMOND_TINTED_HELMET);
        trimmedArmorItem(CAItems.GOLDEN_TINTED_HELMET);
        trimmedArmorItem(CAItems.CHAINMAIL_TINTED_HELMET);
        trimmedArmorItem(CAItems.IRON_TINTED_HELMET);
        trimmedArmorItem(CAItems.LEATHER_TINTED_HELMET);

        trimmedArmorItem(CAItems.IRON_WOOLED_BOOTS);

        trimmedArmorItem(CAItems.NETHERITE_GILDED_HELMET);
        trimmedArmorItem(CAItems.NETHERITE_GILDED_CHESTPLATE);
        trimmedArmorItem(CAItems.NETHERITE_GILDED_LEGGINGS);
        trimmedArmorItem(CAItems.NETHERITE_GILDED_BOOTS);

        trimmedArmorItem(CAItems.NETHERITE_TURTLE_HELMET);
        trimmedArmorItem(CAItems.NETHERITE_TURTLE_CHESTPLATE);
        trimmedArmorItem(CAItems.NETHERITE_TURTLE_LEGGINGS);
        trimmedArmorItem(CAItems.NETHERITE_TURTLE_BOOTS);

        trimmedArmorItem(CAItems.NETHERITE_LEATHERED_HELMET);
        trimmedArmorItem(CAItems.NETHERITE_LEATHERED_CHESTPLATE);
        trimmedArmorItem(CAItems.NETHERITE_LEATHERED_LEGGINGS);
        trimmedArmorItem(CAItems.NETHERITE_LEATHERED_BOOTS);

        trimmedArmorItem(CAItems.DIAMOND_LEATHERED_HELMET);
        trimmedArmorItem(CAItems.DIAMOND_LEATHERED_CHESTPLATE);
        trimmedArmorItem(CAItems.DIAMOND_LEATHERED_LEGGINGS);
        trimmedArmorItem(CAItems.DIAMOND_LEATHERED_BOOTS);

        trimmedArmorItem(CAItems.GOLDEN_LEATHERED_HELMET);
        trimmedArmorItem(CAItems.GOLDEN_LEATHERED_CHESTPLATE);
        trimmedArmorItem(CAItems.GOLDEN_LEATHERED_LEGGINGS);
        trimmedArmorItem(CAItems.GOLDEN_LEATHERED_BOOTS);

        trimmedArmorItem(CAItems.CHAINMAIL_LEATHERED_HELMET);
        trimmedArmorItem(CAItems.CHAINMAIL_LEATHERED_CHESTPLATE);
        trimmedArmorItem(CAItems.CHAINMAIL_LEATHERED_LEGGINGS);
        trimmedArmorItem(CAItems.CHAINMAIL_LEATHERED_BOOTS);

        trimmedArmorItem(CAItems.IRON_LEATHERED_HELMET);
        trimmedArmorItem(CAItems.IRON_LEATHERED_CHESTPLATE);
        trimmedArmorItem(CAItems.IRON_LEATHERED_LEGGINGS);
        trimmedArmorItem(CAItems.IRON_LEATHERED_BOOTS);
    }


    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = CoolArmor.MOD_ID;
        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;
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
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath);
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                if (ArmorHelper.trimArmor(armorItem)) {

                    String tintedoverlay = "item/tinted_" + armorType + "_overlay";
                    ResourceLocation tintedoverlayResLoc = new ResourceLocation(MOD_ID, tintedoverlay);

                    if (ArmorHelper.isOneOfArmor(armorItem, ArmorHelper.modelGenLeatherArmorMaterials)) {
                        if (ArmorHelper.isNeededArmorPiece(armorItem, CAArmorMaterials.LEATHER_TINTED)) {
                            String tintedleatheroverlay = "item/leather_tinted_" + armorType + "_overlay";
                            ResourceLocation tintedleatheroverlayResLoc = new ResourceLocation(MOD_ID, tintedleatheroverlay);
                            getBuilder(currentTrimName)
                                    .parent(new ModelFile.UncheckedModelFile("item/generated"))
                                    .texture("layer0", armorItemResLoc)
                                    .texture("layer1", tintedleatheroverlayResLoc)
                                    .texture("layer2", tintedoverlayResLoc)
                                    .texture("layer3", trimResLoc);

                            this.withExistingParent(itemRegistryObject.getId().getPath(),
                                            mcLoc("item/generated"))
                                    .override()
                                    .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                                    .predicate(mcLoc("trim_type"), trimValue).end()
                                    .texture("layer0", armorItemResLoc)
                                    .texture("layer1", tintedleatheroverlayResLoc)
                                    .texture("layer2", tintedoverlayResLoc);
                        } else {
                            String leatheroverlay = "item/leathered_" + armorType + "_overlay";
                            ResourceLocation leatheroverlayResLoc = new ResourceLocation(MOD_ID, leatheroverlay);
                            getBuilder(currentTrimName)
                                    .parent(new ModelFile.UncheckedModelFile("item/generated"))
                                    .texture("layer0", leatheroverlayResLoc)
                                    .texture("layer1", armorItemResLoc)
                                    .texture("layer2", trimResLoc);

                            this.withExistingParent(itemRegistryObject.getId().getPath(),
                                            mcLoc("item/generated"))
                                    .override()
                                    .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                                    .predicate(mcLoc("trim_type"), trimValue).end()
                                    .texture("layer0", leatheroverlayResLoc)
                                    .texture("layer1", armorItemResLoc);
                        }
                    } else if (ArmorHelper.isOneOfArmor(armorItem, ArmorHelper.modelGenTintedHelmetMaterials)) {
                        getBuilder(currentTrimName)
                                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                                .texture("layer0", armorItemResLoc)
                                .texture("layer1", tintedoverlayResLoc)
                                .texture("layer2", trimResLoc);

                        this.withExistingParent(itemRegistryObject.getId().getPath(),
                                        mcLoc("item/generated"))
                                .override()
                                .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                                .predicate(mcLoc("trim_type"), trimValue).end()
                                .texture("layer0", armorItemResLoc)
                                .texture("layer1", tintedoverlayResLoc);
                    } else if (ArmorHelper.isNeededArmorPiece(armorItem, CAArmorMaterials.IRON_WOOLED)) {
                        String wooledoverlay = "item/wooled_" + armorType + "_overlay";
                        ResourceLocation wooledoverlayResLoc = new ResourceLocation(MOD_ID, wooledoverlay);
                        getBuilder(currentTrimName)
                                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                                .texture("layer0", wooledoverlayResLoc)
                                .texture("layer1", armorItemResLoc)
                                .texture("layer2", trimResLoc);

                        this.withExistingParent(itemRegistryObject.getId().getPath(),
                                        mcLoc("item/generated"))
                                .override()
                                .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                                .predicate(mcLoc("trim_type"), trimValue).end()
                                .texture("layer0", wooledoverlayResLoc)
                                .texture("layer1", armorItemResLoc);

                    }
                } else {
                    getBuilder(currentTrimName)
                            .parent(new ModelFile.UncheckedModelFile("item/generated"))
                            .texture("layer0", armorItemResLoc)
                            .texture("layer1", trimResLoc);

                    this.withExistingParent(itemRegistryObject.getId().getPath(),
                                    mcLoc("item/generated"))
                            .override()
                            .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                            .predicate(mcLoc("trim_type"), trimValue).end()
                            .texture("layer0", armorItemResLoc);
                }
            });
        }
    }

    private void simpleItem(RegistryObject<Item> item) {
        withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CoolArmor.MOD_ID, "item/" + item.getId().getPath()));
    }

}
