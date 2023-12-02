/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.dao;

import java.util.List;

/**
 *
 * @author tankh
 * @param <E> entity
 * @param <K> key
 */
abstract public class NuocHoaShopDAO<E, K> {
    abstract public void insert(E entity);
    abstract public void update(E entity);
    abstract public void delete(K id);
    abstract public List<E> selectAll();
    abstract public E selectById(K id);
    abstract protected List<E> selectBySql(String sql, Object...args);
}
