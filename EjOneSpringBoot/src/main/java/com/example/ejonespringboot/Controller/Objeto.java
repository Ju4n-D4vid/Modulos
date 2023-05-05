package com.example.ejonespringboot.Controller;

import com.example.ejonespringboot.DTO.ObjetoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Objeto {
    @Autowired
    Objeto objeto;

    @GetMapping("/Objeto")
    @ResponseBody
    public List<Objeto> listarObjeto(){
        return objeto.listarObjeto();
    }
    @PostMapping("/objeto")
    @ResponseBody
    public Objeto crearObjeto(@RequestBody Objeto objeto){
        return objeto.crearObjeto(objeto);
    }
    @DeleteMapping("/objeto/{id}")
    public void borrarObjeto(@PathVariable Long id){
        objeto.borrarObjeto(id);
    }
    @PostMapping("/objeto/{id}")
    @ResponseBody
    public Objeto buscarObjeto(@RequestBody Long id){
        return objeto.buscarObjeto(id);
    }
    @PutMapping("/objeto")
    public void modificarObjeto(@RequestBody Objeto objeto){
        objeto.modificarObjeto(objeto);
    }
   /* @PostMapping("/login")
    public ObjetoDTO login (@RequestBody Objeto objeto){
        return objeto.login(objeto.get)
    }*/

}
