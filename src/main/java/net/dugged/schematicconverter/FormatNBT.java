package net.dugged.schematicconverter;

import io.izzel.nbt.CompoundTag;
import io.izzel.nbt.util.CompressedNbtReader;

import java.io.IOException;
import java.nio.file.Path;

public class FormatNBT extends FileFormat {
	@Override
	public String getFileExtension() {
		return ".nbt";
	}

	@Override
	public Schematic importData(Path path) {
		Schematic schematic = new Schematic();
		try {
			CompoundTag tag = new CompressedNbtReader(path).toCompoundTag();
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
