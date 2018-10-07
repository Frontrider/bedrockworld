package hu.frontrider.bedrock.bedrockworld;

import net.minecraft.init.Biomes;
import net.minecraft.world.DimensionType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;

import static hu.frontrider.bedrock.bedrockworld.Bedrockworld.BEDROCK_DIM_TYPE;

public class WorldProvider extends net.minecraft.world.WorldProvider {

    public static BiomeProviderSingle biomeProvider = new BiomeProviderSingle(Biomes.DEFAULT);

    @Override
    public DimensionType getDimensionType() {
        return BEDROCK_DIM_TYPE;
    }

    @Override
    public BiomeProvider getBiomeProvider() {
        return biomeProvider;
    }


}
