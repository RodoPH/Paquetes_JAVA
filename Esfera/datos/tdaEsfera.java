package datos;

public class tdaEsfera {
	
	protected double radio;
	
	//Constructor
	public tdaEsfera(double radioInicial){
		if(radioInicial>0){
			this.radio=radioInicial;
		}else{
			this.radio=0.0;
		}
	}
	//métodos 	
	
	public double getRadio(){
		return radio;
	}
	
	public double getDiametro(){
		return(radio*2);
	}
	
	public double getCircunferencia(){
		return (Math.PI*getDiametro());
	}
	
	public double getArea(){
		return (4*Math.PI*Math.pow(radio,2));
	}
	
	public double getVolumen(){
		return ((4*Math.PI*Math.pow(radio,3)));
	}
	public void setRadio(double radio){
		this.radio =radio;
	}
	
}
