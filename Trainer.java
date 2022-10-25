package Assignment_2;

public class Trainer {
	
		String name;
		String department;
		String email;
		int id;
		public Trainer(String trName,String trDept,String trEmail,int trId){
			name=trName;
			department=trDept;
			email=trEmail;
			id=trId;
			//System.out.println("Trainer Details "+ name +" "+department +" "+email+ " "+ id);
			//if instance variable and local variable are same then we have to use this -keyword 
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer Trainer1=new Trainer("mukesh" ,"Testing ","mukesh@123",1);
		Trainer Trainer2=new Trainer("Hitesh" ,"Dev","mukesh@gmail.com", 2);
		Trainer Trainer3=new Trainer("mukesh","devOps","mukesh@1234.com",3);
		Trainer1.selenium();
		Trainer2.WebDevlopment();
		Trainer3.DevOps();
	
			
		
	}
	public void selenium(){
		System.out.println("Trainer1 "+ name + " " +department + " " +email+ " "+ id);
		System.out.println("Trainer1 can teach selenium");
	}
	public void DevOps(){
		System.out.println("Trainer3 "  +  name + " " + department + " "+ email + " " + id);
		System.out.println("Trainer3 can teach DevOps");
	}
	public void WebDevlopment(){
		System.out.println("Trainer2 " + name + " "+ department + " " + email + " " + id);
		System.out.println("Trainer2 can teach Webdevelopment");
	}

}
