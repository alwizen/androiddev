package com.croxzz.alwizen.myapplicationtestv;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Response{

	@SerializedName("datauser")
	private List<DatauserItem> datauser;

	public void setDatauser(List<DatauserItem> datauser){
		this.datauser = datauser;
	}

	public List<DatauserItem> getDatauser(){
		return datauser;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"datauser = '" + datauser + '\'' + 
			"}";
		}
}