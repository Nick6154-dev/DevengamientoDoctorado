package uce.edu.ec.devengamiento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uce.edu.ec.devengamiento.models.entity.DatosDevengamiento;
import uce.edu.ec.devengamiento.models.service.IDatosDevengamientoService;

import java.util.List;

@RestController
@RequestMapping("/accrual/api/datosDevengamiento")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
public class DatosDevengamientoRest {

    @Autowired
    private IDatosDevengamientoService service;

    @GetMapping({"/findALl", "/findAll/"})
    public List<DatosDevengamiento> findAll() {
        return service.findAll();
    }

    @GetMapping("/findById/{id}")
    public DatosDevengamiento findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("/findByIdDocente/{idDocente}")
    public DatosDevengamiento findByIdDocente(@PathVariable Long idDocente) {
        return service.findByIdDocente(idDocente);
    }

    @PostMapping("/save/{idDocente}")
    public void save(@PathVariable Long idDocente, @RequestBody DatosDevengamiento datosDevengamiento) {
        service.save(datosDevengamiento, idDocente);
    }

    @DeleteMapping("/deleteById/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable Long id, @RequestBody DatosDevengamiento datosDevengamiento) {
        service.update(id, datosDevengamiento);
    }

}
