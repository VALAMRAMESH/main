package com.javatpoint.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository
import com.javatpoint.model.Books;
public interface BooksRepository extends JpaRepository<Books, Integer>
{
}
