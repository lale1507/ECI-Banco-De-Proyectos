package samples.persitence;

import samples.entities;

public interface UsuarioDAO {

    public Usuario consultarUsuario(String correo) throws PersistenceException;

}