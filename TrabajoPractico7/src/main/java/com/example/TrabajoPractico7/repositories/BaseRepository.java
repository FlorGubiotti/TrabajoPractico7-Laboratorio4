package com.example.TrabajoPractico7.repositories;

import com.example.TrabajoPractico7.entities.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository <T extends BaseEntity,ID extends Serializable> extends JpaRepository<T,ID> {
}
