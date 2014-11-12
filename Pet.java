public class Pet{

	private int age;
	private String type;
	private String [] vaccinations;
			
			
	public Pet(){
			this("Unknown",null,0);
		}	
	public Pet(String type,String[]vaccinations,int age){
				setType(type);
					setAge(age);
						setVaccs(vaccinations);
			}
	public void setVaccs(String[] vaccinations)
			{
				this.vaccinations = vaccinations;
			}
			
	public void setAge(int age)
			{
				this.age = age;
			}
			
	public void setType(String type)
			{
				this.type = type;
			}
	
/*	public String toString(){
				String message;
				
				message = String.format("Type:%s Age:%d Vaccinations:%S",
										getType(),getAge(),getVaccinations())
											
				return message;*/
				
	public String toString(){
			String vac = " ";
			for(int i=0; i<vaccinations.length; i++){
					vac += vaccinations[i] + ",";
			}
				
			return String.format("Type:%s\nAge:%d\nVaccinations:%S\n",
										getType(), getAge(), vac);
				}
	public String getType(){return type;}
	public String[] getVaccinations(){return vaccinations;}
	public int getAge(){return age;}
			
			
}