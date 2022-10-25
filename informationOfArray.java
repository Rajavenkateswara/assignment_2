package Assignment_2;

public class informationOfArray  {
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object Trainer1[]={ "Mukesh" ,"Testing","mukesh@gmail.com", 1, "Trainer1 can teach Selenium"};
		Object Trainer2[]={"Hitesh" ,"Dev","mukesh@gmail.com", 2,"Trainer2 can teach WebDevlopment"};
		Object Trainer3[]={ "Mukesh" ,"DevOps","mukesh@gmail.com", 3, "Trainer 3 can teach DevOps"};
		
		for(Object tr1:Trainer1){
			System.out.println(tr1);
		}
		for(Object tr2:Trainer2){
			System.out.println(tr2);
		}
		for(Object tr3:Trainer3){
			System.out.println(tr3);
		}

	}

}
