package com.namaexample.springbootdemo.model;


public class Todo {
    private String id;
    private String desc;
    private String username;
      
    public Todo()
    {
    	
    }

    public Todo(String id, String desc,String username) {
        super();
        this.id = id;
        this.desc = desc;
        this.username=username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

  
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", desc=" + desc + ", username=" + username + "]";
	}

   
    
}