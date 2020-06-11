/*******************************************************************************
 * ${licenseText}     
 *******************************************************************************/
package net.sf.mcf2pdf.mcfelements;

/**
 * TODO comment
 */
public interface McfImage extends McfAreaContent {

	public String getParentChildRelationshipNature();

	public float getScaleImg();

	public int getUseABK();

	public float getLeftImg();

	public float getTopImg();

	public String getFileNameMaster();

	public String getSafeContainerLocation();

	public String getFileName();
	
	public String getFadingFile();

}