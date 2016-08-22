package collection;



	public class InfoStor {

	    private String vmName;
	    private String platform;
	    private Integer memory;

	    public InfoStor (String Name, String Platform , Integer Memory) {
	        vmName = Name;
	        platform  = Platform;
	        memory = Memory;
	    }

	    String getName(){
	        return vmName;
	    }

	    void setPlatform(String p){
	        platform = p;
	    }

	    String getPlatform(){
	        return platform;
	    }

	    void setMemory(Integer m){
	        memory = m;
	    }

	    Integer getMemory(){
	        return memory;
	    }
	}