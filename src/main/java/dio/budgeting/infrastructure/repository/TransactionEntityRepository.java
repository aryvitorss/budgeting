package dio.budgeting.infrastructure.repository;

import dio.budgeting.domain.Category;
import dio.budgeting.infrastructure.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TransactionEntityRepository extends JpaRepository<TransactionEntity, UUID> {

    List<TransactionEntity> findAllByCategory(Category category);
}
