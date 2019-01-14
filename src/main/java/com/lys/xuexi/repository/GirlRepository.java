package com.lys.xuexi.repository;

import com.lys.xuexi.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl,Integer> {
    public List<com.lys.xuexi.Girl> findByAge(Integer age);
}
