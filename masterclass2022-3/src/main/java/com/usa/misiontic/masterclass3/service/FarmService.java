package com.usa.misiontic.masterclass3.service;

import com.usa.misiontic.masterclass3.entities.Farm;
import com.usa.misiontic.masterclass3.repository.FarmRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class FarmService {

    @Autowired
    private FarmRepository farmRepository;

    public List<Farm> getAll(){
        return farmRepository.getAll();
    }
    public Optional<Farm> getProduct(int id){
        return farmRepository.getFarm(id);
               
    }
    public Farm save(Farm p){
        if(p.getIdFarm()==null){
            return farmRepository.save(p);
        }else{
            Optional<Farm> e = farmRepository.getFarm(p.getIdFarm());
            if(e.isPresent()){

                return p;
            }else{
                return farmRepository.save(p);
            }
        }
    }
    
    
    
    public Farm update(Farm p){
        if(p.getIdFarm()!=null){
            Optional<Farm> q = farmRepository.getFarm(p.getIdFarm());
            if(q.isPresent()){
                if(p.getName()!=null){
                    q.get().setName(p.getName());
                }
                                
                if(p.getAddress()!=null){
                    q.get().setAddress(p.getAddress());
                }
                if(p.getExencion()!=null){
                    q.get().setExencion(p.getExencion());
                }
                if(p.getCategory_id()!=null){
                    q.get().setCategory_id(p.getCategory_id());
                }
                             
                
                
                farmRepository.save(q.get());
                return q.get();
            }else{
                return p;
            }
        }else{
            return p;
        }
    }
    public boolean delete(int id){
        boolean flag=false;
        Optional<Farm>p= farmRepository.getFarm(id);
        if(p.isPresent()){
            farmRepository.delete(p.get());
            flag=true;
        }
        return flag;

    }


}
