package com.confDemo.demo.repositories;

import com.confDemo.demo.models.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {

}