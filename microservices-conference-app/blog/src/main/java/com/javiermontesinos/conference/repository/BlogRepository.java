package com.javiermontesinos.conference.repository;

import com.javiermontesinos.conference.domain.Blog;
import org.springframework.stereotype.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Blog entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BlogRepository extends MongoRepository<Blog, String> {

}
