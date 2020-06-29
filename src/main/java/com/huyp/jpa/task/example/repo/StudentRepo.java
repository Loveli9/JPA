package com.huyp.jpa.task.example.repo;

import com.huyp.jpa.task.example.model.vo.StudentVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface StudentRepo extends JpaRepository<StudentVO,Integer>, JpaSpecificationExecutor<StudentVO> {

    @Transactional
//    @Modifying
    @Modifying(flushAutomatically = true)
//    @Modifying(clearAutomatically = true)
    @Query(value = "update student set version = 99 where id = :id",nativeQuery = true)
    Integer updateVerisonById(@Param("id") Integer id);

}
