/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.logic;

import modelo.dao.UsuarioDAO;
import modelo.beans.Usuario;
/**
 *
 * @author jumbo170
 */
public class UsuarioLogic {
    private static UsuarioDAO usuariodao=new UsuarioDAO();
    
    public static boolean autenticar(String usuario,String password){
        if(obtener(usuario)!=null){
            Usuario usuarioConsulta=obtener(usuario);
            if(usuarioConsulta.getUsuario().equals(usuario)&& usuarioConsulta.getPassword().equals(password)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public static boolean insertar(Usuario usuario){
        return usuariodao.insertar(usuario);
    }
    public static boolean modificar(Usuario usuario){
        return usuariodao.modificar(usuario);
    }
    public static boolean eliminar(String usuario){
        return usuariodao.eliminar(usuario);
    }
    public static Usuario obtener(String usuario){
        return usuariodao.obtener(usuario);

    }
}
