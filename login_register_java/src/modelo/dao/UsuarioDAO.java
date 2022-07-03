/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.beans.Usuario;
/**
 *
 * @author jumbo170
 */
public class UsuarioDAO {
    private List<Usuario> usuarios;
    
    public UsuarioDAO(){
        usuarios=new ArrayList<>();
    }
    
    public int buscar(String usuario){
       int index=-1;
       for(int i=0;i<usuarios.size();i++){
           if(usuarios.get(i).getUsuario().equals(usuario)){
               index=i;
               break;
           }
       }
       return index;
    }
    public boolean insertar(Usuario usuario){
        if(buscar(usuario.getUsuario())==-1){
            usuarios.add(usuario);
            return true;
        }else{
            return false;
        }
    }
    public boolean modificar(Usuario usuario){
        if(buscar(usuario.getUsuario())!=-1){
            Usuario usuario_auxiliar=obtener(usuario.getUsuario());
            usuario_auxiliar.setPassword(usuario.getPassword());
            usuario_auxiliar.setNombres(usuario.getNombres());
            usuario_auxiliar.setCorreo(usuario.getCorreo());
            usuario_auxiliar.setApellidos(usuario.getApellidos());

            return true;
        }else{
            return false;
        }
        
    }
    public boolean eliminar(String usuario){
        if(buscar(usuario)!=1){
            usuarios.remove(buscar(usuario));
            return true;
        }else{
            return false;
        }
    }
    public Usuario obtener(String usuario){
        if(buscar(usuario)!=1){
            return usuarios.get(buscar(usuario));
        }else{
            return null;
        }
    }
}
