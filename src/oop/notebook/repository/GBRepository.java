package oop.notebook.repository;

import java.util.List;
import java.util.Optional;

/**
 * �����������, ��� ���������� CreateReadUpdateDelete (CRUD) ��������
 * @param <E> ��� ������ ������
 * @param <I> ��� ID ������ ������ E
 */
public interface GBRepository<E, I> {
    List<E> findAll();

    void saveAll();

    E create(E e);
    Optional<E> findById(I id);
    Optional<E> update(I id, E e);
    boolean delete(I id);

}
