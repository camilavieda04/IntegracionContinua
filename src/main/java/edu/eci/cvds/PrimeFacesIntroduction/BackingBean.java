package edu.eci.cvds.PrimeFacesIntroduction;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;;
@ApplicationScoped 
//@SessionScoped 
@ManagedBean(name = "guessBean")


public class BackingBean {
	int intentos, adivinar,premio;
	private int cont;
	String estado;
	private boolean gano;
	private ArrayList<Integer> misIntentos;
	//private List<int> misIntentos;
	
	public BackingBean(){
		restart();
}
	
	
	public void setIntentos(int intentos) {
		this.intentos=intentos;
	}
	
	public int getIntentos() {
		return intentos;
	}

	public void setAdivinar( int adivinar) {
		this.adivinar=adivinar;
	}
	
	public int getAdivinar() {
		return adivinar;
	}
	
	public void setPremio( int premio) {
		this.premio=premio;
	}
	
	public int getPremio( ) {
		return premio;
	}
	
	public void setEstado(String estado) {
		this.estado=estado;
	}
	
	public String getEstado( ) {
		return estado;
	}
	
	public int getCont( ) {
		return cont;
	}
	
	public void setCont(int cont) {
		this.cont=cont;
	}
	
	public boolean getGano() {
		return gano;
	}
	
	public void setGano(boolean gano) {
		this.gano=gano;
	}
	
	
	public ArrayList<Integer> getMisIntentos(){
		return misIntentos;
	}
	
	public void setMisIntentos(ArrayList<Integer>misIntentos) {
		if(gano!=true) {
			this.misIntentos=misIntentos;
		}
	}
	
	
	public void restart() {
		System.out.println("restart");
		Random randomno= new Random();
	
		adivinar= randomno.nextInt(100);
		intentos=0;
		premio=100000;
		estado="Jugando ";
		gano=false;
		misIntentos=new ArrayList<Integer>();
		
	}
	
	public void guess() {
		System.out.println("guess");
		misIntentos.add(this.cont);
		if(this.adivinar==this.cont) {
			estado="Ganaste "+"El numero fue: "+cont;
			gano=true;
			System.out.println("holi gané");
			}
		else {
			intentos+=1;
			//misIntentos.add(this.cont);
			gano=false;
			estado="Perdiste";
			if(premio>0) {
				premio-=10000;
			}
			}
			
		}
		
}
		
		
	
	
	
	

