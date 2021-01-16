package utils;

public class TablaDispersa {

	static final int TAMTABLA=19;
	public int numJugadores;
	private double factorCarga;//recomendable menor a 0.8
	public Jugador[] tabla;
	
	
	public TablaDispersa()
	{
		//se inicializa la tabla y sus elementos a NULL
		tabla=new Jugador[TAMTABLA];
		for(int i=0; i<TAMTABLA;i++)
		{
			tabla[i]=null;
		}
		//se inicializan los atributos a 0
		numJugadores=0;
		factorCarga=0;
	}
	
	//devuelve la posición o índice de la tabla libre para insertar
	public int direccion(String clave)
	{
		int i=0,p;
		long d;
		//como la clave de dispersion es de tipo cadena, primero se convierte a un valor entero
		d=transformaCadena(clave);
		
		//aplica aritmetica modular para obtener la dirección base
		
		p=(int)(d%TAMTABLA);
		
		//bucle de exploración cuadratica
		
		while(tabla[p]!=null && !(tabla[p]).id.equals(clave))
		{
			i++;
			p=p+i*i;
			p=p%TAMTABLA;//considera el array como circular
		}
		return p;
	}

	private long transformaCadena(String clave) {
		//método de multiplicación para realizar la transformación. 
		//detalles de cómo se obtiene, queda fuera del ámbito del tema
		long d=0;
		 for(int j=0;j<Math.min(10, clave.length());j++)
		 {
			 d=d*27+(int)clave.charAt(j);
		 }
		 
		 if(d<0) d=-d;
		return d;
	}
	
	public void insertar(Jugador j)
	{
		int pos = direccion(j.id);
		tabla[pos] = j;
		numJugadores++;
		factorCarga=(double)(numJugadores)/TAMTABLA;
		tabla[pos].esAlta = true;
		if(factorCarga>0.5) System.out.println("\n#### EL FACTOR DE CARGA SUPERA EL 50%, conviene aumentar el tamaño");
	}
	
	//devuelve una referencia a un elemento di lo encuentra en la tabla y devuelve NULL si no lo encuentra o fue dado de baja
	public Jugador buscar(String clave)
	{
		
		int pos=direccion(clave);
		Jugador j=tabla[pos];
		if(j!=null) 
			if(!j.esAlta) j = null;
		
		return j;
	}
	
	//para dar de baja se siguen los mismos pasos que para buscar y se pone a false el atributo esAlta
	public void eliminar(String clave)
	{
		int posicion=direccion(clave);
		if(tabla[posicion]!=null)
			tabla[posicion].esAlta=false;
		
	}
}
