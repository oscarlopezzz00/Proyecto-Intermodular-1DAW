package com.iesmontenaranco.grupox.casarural.repository;
import com.iesmontenaranco.grupox.casarural.model.Contacto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public class ContactoRepository {
    private final JdbcTemplate jdbcTemplate;


    public ContactoRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
    public List<Contacto>findAll(){
        String sql= """
                SELECT id,nombre,email,telefono,mensaje,fecha_envio
                FROM contactos
                ORDER BY id
                """;
        return jdbcTemplate.query(sql,(rs, rowNum) ->
                new Contacto(
                        rs.getLong("id"),
                        rs.getString("nombre"),
                        rs.getString("email"),
                        rs.getString("telefono"),
                        rs.getString("mensaje"),
                        rs.getObject("fecha_envio", LocalDate.class)
                )

        );
    }
    public void save(Contacto contacto){
        String sql= """
                INSERT INTO contactos(nombre,email,telefono,mensaje,fecha_envio)
                VALUES(?,?,?,?,?)
                """;
        if (contacto.getFecha_envio()==null){
            contacto.setFecha_envio(LocalDate.now());
        }
        jdbcTemplate.update(
                sql,
                contacto.getNombre(),
                contacto.getEmail(),
                contacto.getTelefono(),
                contacto.getMensaje(),
                contacto.getFecha_envio()
        );
    }
}
