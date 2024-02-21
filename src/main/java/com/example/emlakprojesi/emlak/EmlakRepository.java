package com.example.emlakprojesi.emlak;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmlakRepository extends JpaRepository<Emlak,Long> {



}
