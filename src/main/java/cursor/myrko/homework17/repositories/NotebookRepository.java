package cursor.myrko.homework17.repositories;

import cursor.myrko.homework17.entities.Notebook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotebookRepository extends JpaRepository<Notebook, Integer> {
    List<Notebook> findAllByMemoryGreaterThan(int n);
    List<Notebook> findAllByIsUsedIsTrue();
}
