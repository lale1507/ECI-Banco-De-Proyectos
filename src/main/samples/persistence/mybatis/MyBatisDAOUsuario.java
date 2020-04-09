package samples.persistence.mybatis;

import com.google.inject.Inject;
import samples.entities.Usuario;
//import edu.eci.cvds.persistence.PersistenceException;
import samples.persistence.*;
//import edu.eci.cvds.persistence.mybatisimpl.mappers.*;
import java.util.List;

public class MyBatisUsuarioDAO implements UsuarioDAO {

    @Inject
    private UsuarioMapper usuarioMapper;


    @Override
    public Usuario consultarUsuario(String correo) throws PersistenceException {
        try{
            return usuarioMapper.consultarUsuario(correo);
        }
        catch(Exception e){

            throw new PersistenceException("Error consulta usuario:",e);

        }
    }


}
