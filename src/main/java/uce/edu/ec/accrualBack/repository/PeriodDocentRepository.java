package uce.edu.ec.accrualBack.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uce.edu.ec.accrualBack.entity.PeriodDocent;

import java.util.List;
import java.util.Optional;

public interface PeriodDocentRepository extends MongoRepository<PeriodDocent, String> {

    List<PeriodDocent> findAllByIdDocent(Long idDocent);

    List<PeriodDocent> findAllByIdPeriod(Long idPeriod);

    boolean existsByIdDocent(Long idDocent);

    boolean existsByIdPeriod(Long idPeriod);

    boolean existsByIdDocentAndIdPeriodAndState(Long idDocent, Long idPeriod, Integer state);

    boolean existsByIdDocentAndIdPeriod(Long idDocent, Long idPeriod);

    Integer countAllByIdDocent(Long idDocent);

    Integer countAllByIdPeriod(Long idPeriod);

    void deleteAllByIdDocent(Long idDocent);

    void deleteAllByIdPeriod(Long idPeriod);

}
