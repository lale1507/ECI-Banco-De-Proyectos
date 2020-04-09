package samples.persistence.mybatis.mappers;

import samples.entities.Usuario;
import org.apache.ibatis.annotations.Param;

public interface UsuarioMapper {

    public Usuario consultarUsuario(@Param ("correo") String correo);

}