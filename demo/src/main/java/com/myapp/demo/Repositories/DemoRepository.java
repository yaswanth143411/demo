package com.myapp.demo.Repositories;

import com.myapp.demo.Model.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface DemoRepository extends JpaRepository<Demo, Long> {

}
