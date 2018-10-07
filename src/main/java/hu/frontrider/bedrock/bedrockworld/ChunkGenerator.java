package hu.frontrider.bedrock.bedrockworld;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.IChunkGenerator;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class ChunkGenerator implements IChunkGenerator {
    protected World world;

    protected ChunkPrimer chunkPrimer = new ChunkPrimer();
    protected int chunkX;
    protected int chunkZ;
    protected ChunkPos chunkPos;

    protected Random rand;


    /**
     * Instantiates a new chunk generator cloud.
     *
     * @param worldIn the world in
     */
    public ChunkGenerator(World worldIn) {
        // DEBUG
        System.out.println("Constructing ChunkGeneratorCloud");

        world = worldIn;
        rand = new Random(world.getSeed());
        world.setSeaLevel(63);
    }

    @Override
    public Chunk generateChunk(int x, int z) {
        for (int i = 0; i < 15; i++)
            for (int j = 0; j < 15; j++) {
                chunkPrimer.setBlockState(i, 1, j, Blocks.BEDROCK.getDefaultState());
            }
        return new Chunk(world, chunkPrimer, x, z);
    }

    @Override
    public void populate(int x, int z) {

    }

    @Override
    public boolean generateStructures(Chunk chunkIn, int x, int z) {
        return false;
    }

    @Override
    public List<Biome.SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos) {
        return null;
    }

    @Nullable
    @Override
    public BlockPos getNearestStructurePos(World worldIn, String structureName, BlockPos position, boolean findUnexplored) {
        return null;
    }

    @Override
    public void recreateStructures(Chunk chunkIn, int x, int z) {

    }

    @Override
    public boolean isInsideStructure(World worldIn, String structureName, BlockPos pos) {
        return false;
    }
}
