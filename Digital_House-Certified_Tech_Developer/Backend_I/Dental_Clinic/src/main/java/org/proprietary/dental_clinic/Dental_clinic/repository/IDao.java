package org.proprietary.dental_clinic.Dental_clinic.repository;

import java.util.List;
import java.util.Optional;

public interface IDao<T> {

    T insert(T t);
    Optional<T> read(Integer id);
    void delete(Integer id);
    List<T> readAll();
    T update(T t);
}
