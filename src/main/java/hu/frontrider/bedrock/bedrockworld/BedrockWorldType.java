package hu.frontrider.bedrock.bedrockworld;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;

public class BedrockWorldType extends WorldType {

    static BedrockWorldType bedrockWorldType = new BedrockWorldType();

    /**
     * Creates a new world type, the ID is hidden and should not be referenced by modders.
     * It will automatically expand the underlying workdType array if there are no IDs left.
     */
    public BedrockWorldType() {
        super("bedrockworld");
    }

    @Override
    public WorldType getWorldTypeForGeneratorVersion(int version) {
        return bedrockWorldType;
    }

    @Override
    public BiomeProvider getBiomeProvider(World world) {
        return WorldProvider.biomeProvider;
    }
}
