/*Seccion de codigo de usuario*/
package analizadores;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//clase de los token devueltos


/* Seccion de opciones y declaraciones de JFlex */
%% //inicio de opciones
//Cambiamos el nombre la funcion para el siguiente token por nextToken
%function nextToken
//Clase publica
%public
//Cambiamos el nombre de la clase del analizador
%class Lexicop
//Agregamos soporte a unicode
%unicode
//Codigo java
%{
	
    private int contador;
    private int contE;
   public boolean error=false;
    public static ArrayList<Yytoken> tokens;
    public static ArrayList<Yytoken> errors;

	private void writeOutputFile() throws IOException{
			String filename = "file.out";
			BufferedWriter out = new BufferedWriter(
				new FileWriter(filename));
            System.out.println("\n*** Tokens guardados en archivo ***\n");
			for(Yytoken t: this.tokens){
				System.out.println(t);
				out.write(t + "\n");
			}
			out.close();
	}
%}
//Creamos un contador para los tokens
%init{
    contador = 0;
    contE = 0;
	tokens = new ArrayList<Yytoken>();
      errors = new ArrayList<Yytoken>();
%init}
//Cuando se alcanza el fin del archivo de entrada
%eof{
	try{
		this.writeOutputFile();
        
	}catch(IOException ioe){
		ioe.printStackTrace();
	}
%eof}
//Activar el contador de lineas, variable yyline
%line
//Activar el contador de columna, variable yycolumn
%column
//Fin de opciones

//Expresiones regulares
//Declaraciones
Comentario      ="#*""#"*([^*#]|[^*]"#"|"*"[^#])*"*"*"*#" 
Comentario2     =[/][/] [^\n]* [\n]
EXP_ALPHA=[A-Za-z]
EXP_DIGITO=[0-9]
EXP_ALPHANUMERIC={EXP_ALPHA}|{EXP_DIGITO}
EXP_PUNTO=[.]
NUMERO=({EXP_DIGITO})+
NUMEROREAL=({EXP_DIGITO})+{EXP_PUNTO}({EXP_DIGITO})+
IDENTIFICADOR={EXP_ALPHA}({EXP_ALPHANUMERIC})*
L = [a-zA-Z]
D = [0-9]
S=["."|"/"|"_"]
id = {L}{S}*({L}|{D}|{S})*
ESPACIO=" "
SALTO=\n|\r|\r\n

CADENACOMILLASDOBLES = [\"]([^\"\n]|(\\\"))*[\"]
CACHAR = [\']([^\'\n]|(\\\'))*[\']

//fin declaraciones

/* Seccion de reglas lexicas */
%% 
//Regla     {Acciones}

{NUMERO}    {
    contador++;
    Yytoken t = new Yytoken(contador,1,yytext(),"Numero Entero",yyline,yycolumn);
    tokens.add(t);
    return t;
}
{NUMEROREAL}    {
    contador++;
    Yytoken t = new Yytoken(contador,2,yytext(),"Numero Real",yyline,yycolumn);
    tokens.add(t);
    return t;
}

"importar"   {
    contador++;
    Yytoken t = new Yytoken(contador,20,yytext(),"Palabra Reservada para importar",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"protegido"   {
    contador++;
    Yytoken t = new Yytoken(contador,21,yytext(),"Palabra Reservada visibilidad",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"clase"   {
    contador++;
    Yytoken t = new Yytoken(contador,22,yytext(),"Palabra Reservada para definir Clase",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"int"   {
    contador++;
    Yytoken t = new Yytoken(contador,23,yytext(),"Palabra Reservada para Enteros",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"double"   {
    contador++;
    Yytoken t = new Yytoken(contador,24,yytext(),"Palabra Reservada para Dobles",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"string"   {
    contador++;
    Yytoken t = new Yytoken(contador,25,yytext(),"Palabra Reservada para String",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"char"   {
    contador++;
    Yytoken t = new Yytoken(contador,26,yytext(),"Palabra Reservada para Caracter",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"void"   {
    contador++;
    Yytoken t = new Yytoken(contador,27,yytext(),"Palabra Reservada para Tipo",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"publico"   {
    contador++;
    Yytoken t = new Yytoken(contador,28,yytext(),"Palabra Reservada para visibilidad",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"privado"   {
    contador++;
    Yytoken t = new Yytoken(contador,29,yytext(),"Palabra Reservada para visibilidad",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"heredar"   {
    contador++;
    Yytoken t = new Yytoken(contador,30,yytext(),"Palabra Reservada para herencia",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"@override"   {
    contador++;
    Yytoken t = new Yytoken(contador,31,yytext(),"Palabra Reservada @override",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"nuevo"   {
    contador++;
    Yytoken t = new Yytoken(contador,32,yytext(),"Palabra Reservada para Nuevo",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"retornar"   {
    contador++;
    Yytoken t = new Yytoken(contador,42,yytext(),"Palabra Reservada para retornar",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"principal"   {
    contador++;
    Yytoken t = new Yytoken(contador,43,yytext(),"Palabra Reservada para clase principal",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"SI"   {
    contador++;
    Yytoken t = new Yytoken(contador,44,yytext(),"Palabra Reservada",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"SINO"   {
    contador++;
    Yytoken t = new Yytoken(contador,45,yytext(),"Palabra Reservada",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"SINO_SI"   {
    contador++;
    Yytoken t = new Yytoken(contador,46,yytext(),"Palabra Reservada",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"INTERRUPTOR"   {
    contador++;
    Yytoken t = new Yytoken(contador,47,yytext(),"Palabra Reservada",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"CASO"   {
    contador++;
    Yytoken t = new Yytoken(contador,48,yytext(),"Palabra Reservada",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"DEFECTO"   {
    contador++;
    Yytoken t = new Yytoken(contador,49,yytext(),"Palabra Reservada",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"MIENTRAS"   {
    contador++;
    Yytoken t = new Yytoken(contador,50,yytext(),"Palabra Reservada",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"HACER"   {
    contador++;
    Yytoken t = new Yytoken(contador,51,yytext(),"Palabra Reservada",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"continuar"   {
    contador++;
    Yytoken t = new Yytoken(contador,52,yytext(),"Palabra Reservada",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"salir"   {
    contador++;
    Yytoken t = new Yytoken(contador,53,yytext(),"Palabra Reservada",yyline,yycolumn);
    tokens.add(t);
    return t;
}



{IDENTIFICADOR}   {
    contador++;
    Yytoken t = new Yytoken(contador,3,yytext(),"Identificador",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"+="  {
    contador++;
    Yytoken t = new Yytoken(contador,4,yytext(),"asigna_suma",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"+"  {
    contador++;
    Yytoken t = new Yytoken(contador,5,yytext(),"suma",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"::="  {
    contador++;
    Yytoken t = new Yytoken(contador,6,yytext(),"asigna",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"-"  {
    contador++;
    Yytoken t = new Yytoken(contador,7,yytext(),"resta",yyline,yycolumn);
    tokens.add(t);
    return t;
}
/*Los metacaracteres es necesario usar la secuencia de escape */
"\^"  {
    contador++;
    Yytoken t = new Yytoken(contador,8,yytext(),"potencia",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"\""  {
    contador++;
    Yytoken t = new Yytoken(contador,9,yytext(),"Comilla",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"{"  {
    contador++;
    Yytoken t = new Yytoken(contador,10,yytext(),"Llave Abre",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"}"  {
    contador++;
    Yytoken t = new Yytoken(contador,11,yytext(),"Llave Cierra",yyline,yycolumn);
    tokens.add(t);
    return t;
}
";"  {
    contador++;
    Yytoken t = new Yytoken(contador,12,yytext(),"Punto y Coma",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"\\"  {
    contador++;
    Yytoken t = new Yytoken(contador,13,yytext(),"Diagonal",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"."  {
    contador++;
    Yytoken t = new Yytoken(contador,14,yytext(),"Punto",yyline,yycolumn);
    tokens.add(t);
    return t;
}
":"  {
    contador++;
    Yytoken t = new Yytoken(contador,15,yytext(),"Dos Puntos",yyline,yycolumn);
    tokens.add(t);
    return t;
}
","  {
    contador++;
    Yytoken t = new Yytoken(contador,16,yytext(),"Coma",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"("  {
    contador++;
    Yytoken t = new Yytoken(contador,17,yytext(),"Abre Parentesis",yyline,yycolumn);
    tokens.add(t);
    return t;
}
")"  {
    contador++;
    Yytoken t = new Yytoken(contador,18,yytext(),"Cierra Parentesis",yyline,yycolumn);
    tokens.add(t);
    return t;
}
")"  {
    contador++;
    Yytoken t = new Yytoken(contador,18,yytext(),"Cierra Parentesis",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"/"  {
    contador++;
    Yytoken t = new Yytoken(contador,33,yytext(),"divide",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"||"  {
    contador++;
    Yytoken t = new Yytoken(contador,37,yytext(),"Or",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"*"  {
    contador++;
    Yytoken t = new Yytoken(contador,38,yytext(),"Asterisco",yyline,yycolumn);
    tokens.add(t);
    return t;
}

"<"  {
    contador++;
    Yytoken t = new Yytoken(contador,39,yytext(),"Menor que",yyline,yycolumn);
    tokens.add(t);
    return t;
}
">"  {
    contador++;
    Yytoken t = new Yytoken(contador,40,yytext(),"Mayor que",yyline,yycolumn);
    tokens.add(t);
    return t;
}
"_"  {
    contador++;
    Yytoken t = new Yytoken(contador,67,yytext(),"bajo",yyline,yycolumn);
    tokens.add(t);
    return t;
}

"["  {
    contador++;
    Yytoken t = new Yytoken(contador,67,yytext(),"corchete abre",yyline,yycolumn);
    tokens.add(t);
    return t;
}

"]"  {
    contador++;
    Yytoken t = new Yytoken(contador,68,yytext(),"corchete cierra",yyline,yycolumn);
    tokens.add(t);
    return t;
}

"++"  {
    contador++;
    Yytoken t = new Yytoken(contador,69,yytext(),"Masmas",yyline,yycolumn);
    tokens.add(t);
    return t;
}

"--"  {
    contador++;
    Yytoken t = new Yytoken(contador,70,yytext(),"Menosmenos",yyline,yycolumn);
    tokens.add(t);
    return t;
}

"'"  {
    contador++;
    Yytoken t = new Yytoken(contador,71,yytext(),"apostr",yyline,yycolumn);
    tokens.add(t);
    return t;
}

">="  {
    contador++;
    Yytoken t = new Yytoken(contador,72,yytext(),"mayorigual",yyline,yycolumn);
    tokens.add(t);
    return t;
}

"<="  {
    contador++;
    Yytoken t = new Yytoken(contador,73,yytext(),"menorigual",yyline,yycolumn);
    tokens.add(t);
    return t;
}

"=="  {
    contador++;
    Yytoken t = new Yytoken(contador,74,yytext(),"igualigual",yyline,yycolumn);
    tokens.add(t);
    return t;
}

"!="  {
    contador++;
    Yytoken t = new Yytoken(contador,75,yytext(),"noigual",yyline,yycolumn);
    tokens.add(t);
    return t;
}

"??"  {
    contador++;
    Yytoken t = new Yytoken(contador,76,yytext(),"xor",yyline,yycolumn);
    tokens.add(t);
    return t;
}

"%%"  {
    contador++;
    Yytoken t = new Yytoken(contador,76,yytext(),"and",yyline,yycolumn);
    tokens.add(t);
    return t;
}

"!!"  {
    contador++;
    Yytoken t = new Yytoken(contador,78,yytext(),"not",yyline,yycolumn);
    tokens.add(t);
    return t;
}

"="  {
    contador++;
    Yytoken t = new Yytoken(contador,79,yytext(),"igual",yyline,yycolumn);
    tokens.add(t);
    return t;
}

{CADENACOMILLASDOBLES}  {
    contador++;
    Yytoken t = new Yytoken(contador,80,yytext(),"cadena",yyline,yycolumn);
    tokens.add(t);
    return t;
}

{CACHAR}  {
    contador++;
    Yytoken t = new Yytoken(contador,81,yytext(),"caracter tipo char",yyline,yycolumn);
    tokens.add(t);
    return t;
}



{id}        { contador++;
    Yytoken t = new Yytoken(contador,41,"","combinacion",yyline,yycolumn);
    tokens.add(t);
    return t;}


{ESPACIO} {
 	//ignorar
}
{SALTO} {
    contador++;
    Yytoken t = new Yytoken(contador,19,"","fin_linea",yyline,yycolumn);
    tokens.add(t);
    return t;
}
. {
    error=true;
    contE++;
    System.out.println("Error lexico: "+yytext());
    Yytoken t = new Yytoken(contE,35,yytext(),"Error Lexico",yyline,yycolumn);
    errors.add(t);
    return t;
}

{Comentario}        { contador++;
    Yytoken t = new Yytoken(contador,79,yytext(),"comentario",yyline,yycolumn);
    tokens.add(t);
    return t; /* Se ignoran */}
{Comentario2}       { contador++;
    Yytoken t = new Yytoken(contador,80,yytext(),"comentario",yyline,yycolumn);
    tokens.add(t);
    return t;/* Se ignoran */}

/* BLANCOS */
[ \t\r\f\n]+        { /* Se ignoran */}
