/*******************************************************************************
 * ${licenseText}     
 *******************************************************************************/
package net.sf.mcf2pdf.mcfelements.impl;

import net.sf.mcf2pdf.mcfelements.McfImage;

public class McfImageImpl extends AbstractMcfAreaContentImpl implements McfImage {
	
	private String parentChildRelationshipNature;
	
	private float scaleImg;
	
	private int useABK;
	
	private float leftImg;
	
	private float topImg;
	
	private String fileNameMaster;
	
	private String safeContainerLocation;
	
	private String fileName;
	
	private String fadingFile;
	
	@Override
	public ContentType getContentType() {
		return ContentType.IMAGE;
	}

	public String getParentChildRelationshipNature() {
		return parentChildRelationshipNature;
	}

	public void setParentChildRelationshipNature(
			String parentChildRelationshipNature) {
		this.parentChildRelationshipNature = parentChildRelationshipNature;
	}

	public float getScaleImg() {
		return this.scaleImg;
	}

	public void setScaleImg(float scale) {
		this.scaleImg = scale;
	}

	public int getUseABK() {
		return useABK;
	}

	public void setUseABK(int useABK) {
		this.useABK = useABK;
	}

	public float getLeftImg() {
		return leftImg;
	}

	public void setLeftImg(float left) {
		this.leftImg = left;
	}

	public float getTopImg() {
		return topImg;
	}

	public void setTopImg(float top) {
		this.topImg = top;
	}

	public String getFileNameMaster() {
		return fileNameMaster;
	}

	public void setFileNameMaster(String fileNameMaster) {
		this.fileNameMaster = fileNameMaster;
	}

	public String getSafeContainerLocation() {
		return safeContainerLocation;
	}

	public void setSafeContainerLocation(String safeContainerLocation) {
		this.safeContainerLocation = safeContainerLocation;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		String fixed = fileName.replace("safecontainer:/", "");
		this.fileName = fixed;
	}

	public String getFadingFile() {
		return fadingFile;
	}

	public void setFadingFile(String fadingFile) {
		this.fadingFile = fadingFile;
	}
	

}
