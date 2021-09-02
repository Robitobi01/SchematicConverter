package net.dugged.schematicconverter;

import io.izzel.nbt.CompoundTag;

import java.nio.file.Path;

public abstract class FileFormat {
	public abstract String getFileExtension();

	public abstract Schematic importData(Path path);

	public abstract boolean exportData(CompoundTag nbt);
}
