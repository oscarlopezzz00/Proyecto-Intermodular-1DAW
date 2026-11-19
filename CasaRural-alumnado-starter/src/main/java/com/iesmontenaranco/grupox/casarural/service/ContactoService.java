package com.iesmontenaranco.grupox.casarural.service;
import com.iesmontenaranco.grupox.casarural.model.Contacto;
import com.iesmontenaranco.grupox.casarural.repository.ContactoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ContactoService {

    private final ContactoRepository contactoRepository;

    public ContactoService(ContactoRepository contactoRepository){
        this.contactoRepository=contactoRepository;
    }
    public List<Contacto> obtenerTodas(){
        return contactoRepository.findAll();
    }

}
