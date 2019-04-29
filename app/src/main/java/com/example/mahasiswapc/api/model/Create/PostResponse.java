package com.example.mahasiswapc.api.model.Create;

import com.google.gson.annotations.SerializedName;

public class PostResponse{

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private String description;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	@Override
 	public String toString(){
		return 
			"PostResponse{" + 
			"name = '" + name + '\'' + 
			",description = '" + description + '\'' + 
			"}";
		}
}