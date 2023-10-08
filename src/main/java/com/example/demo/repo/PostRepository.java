package com.example.demo.repo;

import com.example.demo.dto.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


public interface PostRepository extends CrudRepository<Post,Long> {
}
