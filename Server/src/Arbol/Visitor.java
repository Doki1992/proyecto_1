/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

/**
 *
 * @author twa
 */
public interface Visitor {
    public Object vistit(Paramet_dos dos);
    public Object vistit(Paramet_uno uno);
    public Object vistit(Cadena c);
    public Object vistit(Crea_producto cp);
    public Object vistit(Crea_usuario cu);
    public Object vistit(Cuerpo cuerpo);
    public Object vistit(Declara_const dconst);
    public Object vistit(Declara_funcion dfuncion);
    public Object vistit(Elimina_tienda Et);
    public Object vistit(Exp_query1 expquery1);
    public Object vistit(Exp_query2 expquery2);
    public Object vistit(Expresion_mas expmas);
    public Object vistit(Expresion_menos exmenos);
    public Object vistit(Expresion_termino extermino);
    public Object vistit(Factor_exponente fexponente);
    public Object vistit(Factor_menos fmenos);
    public Object vistit(Factor_potencia fpotencia);
    public Object vistit(Get_tiendas gtiendas);
    public Object vistit(Id id);
    public Object vistit(In_rel in_rel);
    public Object vistit(Inicio_usuario iusuario);
    public Object vistit(L_and land);
    public Object vistit(L_or lor);
    public Object vistit(L_xor lxor);
    public Object vistit(L_rel lrel );
    public Object vistit(List_cuerpo lcuerpo);
    public Object vistit(List_declara ldeclara);
    public Object vistit(List_programa lprograma);
    public Object vistit(Llam_cons llamcosn);
    public Object vistit(Llam_fuc llamfunc);
    public Object vistit(Llamada_funcion llamadafuncion);
    public Object vistit(Llamada_logica llamadalogica);
    public Object vistit(Logica_llave logicallave);
    public Object vistit(Mate mate);
    public Object vistit(Mayor_rel mayorel);
    public Object vistit(Menor_rel menorel);
    public Object vistit(Modifica_Elimina_tienda modificatienda);
    public Object vistit(Not_rel nrel);
    public Object vistit(Numero numero);
    public Object vistit(Operaciones_producto opeproducto);
    public Object vistit(Parentesis_logica plogica);
    public Object vistit(Query q);
    public Object vistit(Registro_tienda rt);
    public Object vistit(Termino_division terdivision);
    public Object vistit(Termino_factor terfactor);
    public Object vistit(Termino_por terpor);
    public Object vistit(Unit_cuerpo ucuerpo);
    public Object vistit(Unit_declara udeclara);
    public Object vistit(Unit_programa uprograma);  
}
