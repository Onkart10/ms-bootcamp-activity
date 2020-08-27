package com.ibm.conversionfactor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ibm.conversionfactor.model.Conversionfactor;


@Component
public interface ConversionfactorRepository extends JpaRepository<Conversionfactor,String> {

}
