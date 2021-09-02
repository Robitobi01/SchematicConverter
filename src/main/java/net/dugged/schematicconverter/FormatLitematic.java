package net.dugged.schematicconverter;

import io.izzel.nbt.CompoundTag;

import java.nio.file.Path;

public class FormatLitematic extends FileFormat {
	@Override
	public String getFileExtension() {
		return ".litematic";
	}

	@Override
	public Schematic importData(Path path) {
		Schematic schematic = new Schematic();
		return schematic;
	}

	@Override
	public boolean exportData(CompoundTag nbt) {
		return false;
	}
}
