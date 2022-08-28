package com.project.devup.repository;

import com.project.devup.entity.Board;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BoardRepository {
    @PersistenceContext
    private EntityManager em;

    public List<Board> findAllByMenuUrl(String menuUrl) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Board> cq = cb.createQuery(Board.class);
        Root<Board> b = cq.from(Board.class);

        List<Predicate> criteria = new ArrayList<>();
        Predicate cond1 = cb.equal(b.get("menuUrl"), "/"+menuUrl);
        criteria.add(cond1);

        cq.where(cb.and(criteria.toArray(new Predicate[criteria.size()])));
        TypedQuery<Board> query = em.createQuery(cq);
        return query.getResultList();
    }

    public List<Board> findAllByCategory(String menuUrl, String category) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Board> cq = cb.createQuery(Board.class);
        Root<Board> b = cq.from(Board.class);

        List<Predicate> criteria = new ArrayList<>();
        Predicate cond1 = cb.equal(b.get("menuUrl"), "/"+menuUrl);
        criteria.add(cond1);

        Predicate cond2 = cb.equal(b.get("category"), category);
        criteria.add(cond2);

        cq.where(cb.and(criteria.toArray(new Predicate[criteria.size()])));
        TypedQuery<Board> query = em.createQuery(cq);
        return query.getResultList();
    }
}
