/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

import Estructura_store.*;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.Hashtable;
import java.util.LinkedList;

/**
 *
 * @author twa
 */
public class Traductor implements Visitor{
    
    Tabla_usuario t_usuarios = new Tabla_usuario();
    String mensaje;
    public  LinkedList<String> Log=new LinkedList<>();
    Crea_datos_usuario crea_usuario;
    Crea_datos_tienda crea_tienda;
    Crea_datos_producto crea_producto;
    Hashtable<String, String> claves_tienda = new Hashtable<>();
    public Hashtable<String, String> claves_producto = new Hashtable<>();
    
    
   

    @Override
    public Object vistit(Cadena c) {
        return (String)c.cadena;
    }

    @Override
    public Object vistit(Crea_modifica_producto cp) {
        crea_producto = new Crea_datos_producto(cp.list5, t_usuarios, cp.operacion,this);
        Log.add(crea_producto.getMensaje());
        return null;
    }

    @Override
    public Object vistit(Crea_usuario cu) {
        
        crea_usuario=new Crea_datos_usuario(cu.list1);
        if(!this.t_usuarios.containsKey(crea_usuario.creaUsuario().getId())){
        this.t_usuarios.put(crea_usuario.creaUsuario().getId(), crea_usuario.creaUsuario());
        mensaje = new String("Usuario creado con exito");this.Log.add(mensaje);
        }else{
        mensaje = new String("El usuario ya existe");this.Log.add(mensaje);
        }
        
        return  cu.list1;
    }

    @Override
    public Object vistit(Cuerpo cuerpo) {
        cuerpo.cuerpo.Acept(this);
        return null;
    }

    @Override
    public Object vistit(Declara_const dconst) {
        
        dconst.logica.Acept(this);
        return null;
    }

    @Override
    public Object vistit(Declara_funcion dfuncion) {
        dfuncion.expresion.Acept(this);
        dfuncion.paramet.Acept(this);
        return null;
    }

    @Override
    public Object vistit(Elimina_tienda Et) {
        crea_tienda = new Crea_datos_tienda(Et.list4,this.t_usuarios);
        Log.add(crea_tienda.getMensaje());
        return null;
    }

    @Override
    public Object vistit(Exp_query1 expquery1) {
        return (boolean)expquery1.logica.Acept(this);
    }

    @Override
    public Object vistit(Exp_query2 expquery2) {
        expquery2.logica1.Acept(this);
        expquery2.logica2.Acept(this);//esta es la expresion a evaluar
        return null;
    }

    @Override
    public Object vistit(Expresion_mas expmas) {
         return Double.parseDouble((String)expmas.termino.Acept(this).toString())+Double.parseDouble((String)expmas.expresion.Acept(this).toString());
    }

    @Override
    public Object vistit(Expresion_menos exmenos) {
        return Double.parseDouble((String)exmenos.termino.Acept(this).toString())-Double.parseDouble((String)exmenos.expresion.Acept(this).toString());
    }

    @Override
    public Object vistit(Expresion_termino extermino) {
       return Double.parseDouble((String)extermino.termino.Acept(this).toString());
    }

   

    @Override
    public Object vistit(Factor_exponente fexponente) {
       return (double)Math.sqrt(Double.parseDouble((String)fexponente.logica.Acept(this).toString()));
    }

   
    @Override
    public Object vistit(Factor_menos fmenos) {
        return (double) Double.parseDouble((String)fmenos.expresion.Acept(this).toString())*-1;
    }

   

    @Override
    public Object vistit(Factor_potencia fpotencia) {
     return (double)Math.pow(Double.parseDouble((String)fpotencia.logica.Acept(this).toString()),2);
    }

    @Override
    public Object vistit(Get_tiendas gtiendas) {
       gtiendas.llamada1.Acept(this);
       gtiendas.llamada2.Acept(this);
       return null;
    }

    @Override
    public Object vistit(Id id) {
    return (String)id.id;//buscar en la tabla de simbolos 
    }

    @Override
    public Object vistit(In_rel in_rel) {
       return in_rel.in.Acept(this);
    }

    @Override
    public Object vistit(Inicio_usuario iusuario) {
        String clave_h =iusuario.llamada;  
        String pas = (String)iusuario.llamada1;
        if(this.t_usuarios.containsKey(clave_h)){
            mensaje = new String("Iniciando sesion");this.Log.add(mensaje);
            Usuario a = t_usuarios.getUsuario(clave_h);
            if(this.t_usuarios.getUsuario(clave_h).getId().equals(clave_h)&&this.t_usuarios.getUsuario(clave_h).getPassword().equals(pas)){
            mensaje = new String("Inicio de sesion correcto");this.Log.add(mensaje);  
            }else{
            mensaje = new String("Usuario o clave invalidos");this.Log.add(mensaje);      
            }
        }else{
            mensaje = new String("No se ha podido iniciar sesion usuario no existe");this.Log.add(mensaje);
        }
        return null;
    }

    @Override
    public Object vistit(L_and land) {
      if((boolean)land.logica.Acept(this)&&(boolean)land.rel.Acept(this)){
          return true;
      }   else{
          return false;
      }  
    }

    @Override
    public Object vistit(L_or lor) {
        return (boolean)lor.logica.Acept(this)||(boolean)lor.rel.Acept(this);
    }

    @Override
    public Object vistit(L_xor lxor) {
        return null;
    }

    @Override
    public Object vistit(L_rel lrel) {
       return lrel.rel.Acept(this);
        
    }

    @Override
    public Object vistit(List_cuerpo lcuerpo) {
       lcuerpo.c.Acept(this);
       lcuerpo.cuerpo.Acept(this);
       return null;
    }

    @Override
    public Object vistit(List_declara ldeclara) {
       ldeclara.dec.Acept(this);
       ldeclara.declara.Acept(this);
       return null;
    }

    @Override
    public Object vistit(List_programa lprograma) {
    lprograma.programa.Acept(this);
    lprograma.pro.Acept(this);
    return null;
    }

    @Override
    public Object vistit(Llam_cons llamcosn) {
        llamcosn.logica.Acept(this);
        return null;
    }

    @Override
    public Object vistit(Llam_fuc llamfunc) {
        llamfunc.id.Acept(this);
        llamfunc.paramet.Acept(this);
        return null;
    }

    @Override
    public Object vistit(Llamada_funcion llamadafuncion) {
        llamadafuncion.llam.Acept(this);
        llamadafuncion.logica.Acept(this);
        return null;
    }

    @Override
    public Object vistit(Llamada_logica llamadalogica) {
       return llamadalogica.logica.Acept(this);
     
    }

    @Override
    public Object vistit(Logica_llave logicallave) {
       return (String)logicallave.logica.Acept(this).toString();
    }

    @Override
    public Object vistit(Mate mate) {
        mate.declara.Acept(this);
        mate.logica.Acept(this);
        return null;
    }

    @Override
    public Object vistit(Mayor_rel mayorel) {
        if(Double.parseDouble((String)mayorel.rel.Acept(this))<Double.parseDouble((String)mayorel.in.Acept(this))){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object vistit(Menor_rel menorel) {
        if(Double.parseDouble((String)menorel.rel.Acept(this))>Double.parseDouble((String)menorel.in.Acept(this))){
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public Object vistit(Modifica_Elimina_tienda modificatienda) {
        crea_tienda= new Crea_datos_tienda(modificatienda.list3,this.t_usuarios);
        this.Log.add(crea_tienda.getMensaje());
      return null;
    }

    @Override
    public Object vistit(Not_rel nrel) {
        return nrel.in.Acept(this);
    }

    @Override
    public Object vistit(Numero numero) {
        return (String)numero.numero;
    }

    @Override
    public Object vistit(Operaciones_producto opeproducto) {
      return opeproducto.list6;
    }

    @Override
    public Object vistit(Parentesis_logica plogica) {
       return plogica.logica.Acept(this);
    }

    @Override
    public Object vistit(Query q) {
        q.exp.Acept(this);
        return null;
    }

    @Override
    public Object vistit(Termino_division terdivision) {
      return Double.parseDouble((String)terdivision.factor.Acept(this).toString())/Double.parseDouble((String)terdivision.termino.Acept(this).toString());
    }

    @Override
    public Object vistit(Termino_factor terfactor) {
        return terfactor.factor.Acept(this).toString();
    }

    @Override
    public Object vistit(Termino_por terpor) {
        return Double.parseDouble((String)terpor.factor.Acept(this).toString())*Double.parseDouble((String)terpor.termino.Acept(this).toString());
    }

    @Override
    public Object vistit(Unit_cuerpo ucuerpo) {
        ucuerpo.c.Acept(this);
        return null;
    }

    @Override
    public Object vistit(Unit_declara udeclara) {
        udeclara.dec.Acept(this);
        return null;
    }

    @Override
    public Object vistit(Unit_programa uprograma) {
        uprograma.pro.Acept(this);
     return null;     
    }

    @Override
    public Object vistit(Paramet_dos dos) {
        dos.logica.Acept(this);
        dos.paramet.Acept(this);
        return null;
    }

    @Override
    public Object vistit(Paramet_uno uno) {
        uno.logica.Acept(this);
        return null;
    }

    @Override
    public Object vistit(Registro_tienda rt) {
    crea_tienda = new Crea_datos_tienda(rt.list2,this.t_usuarios);
    if(!claves_tienda.containsKey(crea_tienda.creaTienda().getCodigo())){
        claves_tienda.put(crea_tienda.getT().getCodigo(), crea_tienda.getT().getCodigo());
    if(this.t_usuarios.containsKey(crea_tienda.getT().getPropietario())){
        mensaje=new String("tienda crea con exito"); this.Log.add(mensaje);
        this.t_usuarios.getUsuario(crea_tienda.creaTienda().getPropietario()).getTiendas().put(crea_tienda.getT().getCodigo(),crea_tienda.getT());
    }else{
        mensaje=new String("El usuario "+crea_tienda.getT().getPropietario()+" no existe");this.Log.add(mensaje);
    }
    }else{mensaje = new String("La tienda con codigo ya existe");this.Log.add(mensaje);}
    return rt.list2;        
    }
    
}
