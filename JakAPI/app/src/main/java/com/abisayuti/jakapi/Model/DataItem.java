package com.abisayuti.jakapi.Model;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("NO")
	private int nO;

	@SerializedName("POS_PEMADAM")
	private String pOSPEMADAM;

	@SerializedName("ALAMAT")
	private String aLAMAT;

	@SerializedName("LNG")
	private double lNG;

	@SerializedName("KELURAHAN")
	private String kELURAHAN;

	@SerializedName("RT_RW")
	private String rTRW;

	@SerializedName("LAT")
	private double lAT;

	public void setNO(int nO){
		this.nO = nO;
	}

	public int getNO(){
		return nO;
	}

	public void setPOSPEMADAM(String pOSPEMADAM){
		this.pOSPEMADAM = pOSPEMADAM;
	}

	public String getPOSPEMADAM(){
		return pOSPEMADAM;
	}

	public void setALAMAT(String aLAMAT){
		this.aLAMAT = aLAMAT;
	}

	public String getALAMAT(){
		return aLAMAT;
	}

	public void setLNG(double lNG){
		this.lNG = lNG;
	}

	public double getLNG(){
		return lNG;
	}

	public void setKELURAHAN(String kELURAHAN){
		this.kELURAHAN = kELURAHAN;
	}

	public String getKELURAHAN(){
		return kELURAHAN;
	}

	public void setRTRW(String rTRW){
		this.rTRW = rTRW;
	}

	public String getRTRW(){
		return rTRW;
	}

	public void setLAT(double lAT){
		this.lAT = lAT;
	}

	public double getLAT(){
		return lAT;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"nO = '" + nO + '\'' + 
			",pOS_PEMADAM = '" + pOSPEMADAM + '\'' + 
			",aLAMAT = '" + aLAMAT + '\'' + 
			",lNG = '" + lNG + '\'' + 
			",kELURAHAN = '" + kELURAHAN + '\'' + 
			",rT_RW = '" + rTRW + '\'' + 
			",lAT = '" + lAT + '\'' + 
			"}";
		}
}