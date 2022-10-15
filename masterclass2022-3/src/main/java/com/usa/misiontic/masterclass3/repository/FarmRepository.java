package com.usa.misiontic.masterclass3.repository;

import com.usa.misiontic.masterclass3.entities.Farm;
import com.usa.misiontic.masterclass3.repository.crudRepository.FarmCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class FarmRepository {

    @Autowired
    private FarmCrudRepository farmCrudRepository;

        public List<Farm> getAll(){
            return (List<Farm>) farmCrudRepository.findAll();
            
    }
        public Optional<Farm> getFarm(int id){
            return farmCrudRepository.findById(id);
    }
        public Farm save(Farm c){
            return farmCrudRepository.save(c);
    }
         public void delete(Farm c){
            farmCrudRepository.delete(c);
    }

}
        
    




