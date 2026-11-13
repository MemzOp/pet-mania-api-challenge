package com.dt2.petmania.service;

import com.dt2.petmania.entities.Pet;
import com.dt2.petmania.repositories.PetRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {

    private final PetRepository repository;
    public PetService(PetRepository repository){
        this.repository = repository;
    }

    public List<Pet> mostrarPet(){
        List<Pet> petList = new ArrayList<>();
        return petList = repository.findAll();
    }

    public void cadastrarPet(Pet pets){
        Pet p = new Pet();
        p.setNome(pets.getNome());
        p.setIdade(pets.getIdade());
        p.setDisponivel(pets.isDisponivel());
        p.setEspecie(pets.getEspecie());
        p.setFoto(pets.getFoto());
        p.setPorte(pets.getPorte());
        p.setPersonalidade(pets.getPersonalidade());
        p.setRaca(pets.getRaca());
        p.setSexo(pets.getSexo());
        repository.save(pets);

    }
}
