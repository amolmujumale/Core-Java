package com.java.practice;

public class BuilderClass {

	int hardDisk;
	int ram;
	String name;
	String operatingSystem;

	public int getHardDisk() {
		return hardDisk;
	}

	public void setHardDisk(int hardDisk) {
		this.hardDisk = hardDisk;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getName() {
		return name;
	}

	public BuilderClass setName(String name) {
		this.name = name;
		return this;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public BuilderClass setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
		return this;
	}
	
	@Override
	public String toString() {
		return "BuilderClass [hardDisk=" + hardDisk + ", ram=" + ram + ", name=" + name + ", operatingSystem="
				+ operatingSystem + "]";
	}

	public BuilderClass(int hardDisk, int ram) {
		this.hardDisk = hardDisk;
		this.ram = ram;
	}

	static class innerClass {
		int hardDisk;
		int ram;

		public innerClass(int hardDisk, int ram) {
			this.hardDisk = hardDisk;
			this.ram = ram;
		}

		public BuilderClass build() {
			return new BuilderClass(this.hardDisk, this.ram);
		}
	}

	public static void main(String[] args) {
		BuilderClass obj = new BuilderClass.innerClass(1, 2).build().setName("HP").setOperatingSystem("windows");
		System.out.println(obj);
		obj.setName("lenovo");
		System.out.println(obj);
	}

}
