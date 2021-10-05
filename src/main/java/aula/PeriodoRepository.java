package aula;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeriodoRepository extends JpaRepository<Periodo, String> {

    @Query(value = aula.Query.QUERY,
            nativeQuery = true)
    List<Periodo> getPeriodos();

}
