package net.dugged.schematicconverter;

import io.izzel.nbt.CompoundTag;
import io.izzel.nbt.util.CompressedNbtReader;
import io.izzel.nbt.util.ImmutableBytes;
import net.dugged.schematicconverter.block.Block;

import java.io.IOException;
import java.nio.file.Path;

public class FormatSchematic extends FileFormat {
	@Override
	public String getFileExtension() {
		return ".schematic";
	}

	@Override
	public Schematic importData(Path path) {
		Schematic schematic = new Schematic();
		try {
			CompoundTag compound = new CompressedNbtReader(path).toCompoundTag();
			ImmutableBytes blocks = compound.getBytesOrDefault("Blocks");
			ImmutableBytes metadata = compound.getBytesOrDefault("Data");
			for (int i = 0; i < blocks.size(); i++) {
				Block block = Block.getById(Byte.toUnsignedInt(blocks.get(i)));
				block.setMetadata(metadata.get(i));
				System.out.println("Old Block: " + block + "\nNew Block: " + block.getNewBlock() + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return schematic;
	}

	@Override
	public boolean exportData(CompoundTag nbt) {
		return false;
	}
}
