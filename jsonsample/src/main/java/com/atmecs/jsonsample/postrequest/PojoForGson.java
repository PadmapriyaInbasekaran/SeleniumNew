package com.atmecs.jsonsample.postrequest;
public class PojoForGson {
	  public int id;
	    public String name;
	    public String nationality;
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNationality() {
			return nationality;
		}
		public void setNationality(String nationality) {
			this.nationality = nationality;
		}
		@Override
		public String toString() {
			return "PostUsingGson [id=" + id + ", name=" + name + ", nationality=" + nationality + "]";
		}
	   

	   
	    }
	   

	    