package org.example.votingcalc.Repo;

import org.example.votingcalc.entity.Ventity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VRepo extends JpaRepository<Ventity,Integer> {

}
