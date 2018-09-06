package com.abisayuti.jakapi.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponsePostDamkar{

	@SerializedName("data")
	private List<DataItem> data;

	@SerializedName("count")
	private int count;

	@SerializedName("status")
	private String status;

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"ResponsePostDamkar{" + 
			"data = '" + data + '\'' + 
			",count = '" + count + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}