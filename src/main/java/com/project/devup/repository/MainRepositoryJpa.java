package com.project.devup.repository;

import com.project.devup.entity.Menu;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Repository
public class MainRepositoryJpa implements MainRepository{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Menu> getTopMenu(String authId) {
        List<Menu> result = em.createQuery("select m from Menu m where m.useYn = :useYn and m.authId = :authId and m.depth = :depth", Menu.class)
                .setParameter("useYn", "Y")
                .setParameter("authId", authId)
                .setParameter("depth", 1)
                .getResultList();
        return result;
    }
}
