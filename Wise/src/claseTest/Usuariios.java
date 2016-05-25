package claseTest;

public class Usuariios {
	public boolean ValidarPast(String Past){
		if(Past.equals("they were not pleased at all")){
			return true;
		}
		else
			return false;
	}
	public boolean ValidarPresent(String Present){
		if(Present.equals("they play basketball every sunday")){
			return true;
		}
		else
			return false;
	}
	public boolean ValidarFuture(String Future){
		if(Future.equals("i hope you will have a successful trip")){
			return true;
		}
		else
			return false;
	}
}
