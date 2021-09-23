package aula;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MCRRepository extends JpaRepository<MCR, String> {

    @Query(value = "SELECT * FROM MCR WHERE CD_MCR = :id",
            nativeQuery = true)
    MCR getByIdCustomQueryWithParam(@Param("id") int id);

    @Query(value = "SELECT * FROM MCR WHERE CD_MCR = ?1",
            nativeQuery = true)
    MCR getByIdCustomQuery(int id);

    @Query(value = aula.Query.QUERY_MCR,
            nativeQuery = true)
    List<MCR> getMcr();



}
