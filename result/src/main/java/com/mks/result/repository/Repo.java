package com.mks.result.repository;

import com.mks.result.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Student,Integer> {
    @Query(value = "select * from student where usn=:rn",nativeQuery = true)
    Student getResult(@Param("rn") String usn);
    public Student findByUsn(String usn);
}
