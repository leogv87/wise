package claseTest;

public class Usuariios {
	public boolean ValidarPast(String Past){
		if(Past.equals("They were not pleased at all")){
			return true;
		}
		else
			return false;
	}
	public boolean ValidarPresent(String Present){
		if(Present.equals("They play basketball every Sunday")){
			return true;
		}
		else
			return false;
	}
	public boolean ValidarFuture(String Future){
		if(Future.equals("I hope you will have a successful trip")){
			return true;
		}
		else
			return false;
	}
}