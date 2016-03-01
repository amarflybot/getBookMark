package com.getbookmarks.repository;

import com.getbookmarks.domain.Story;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by amarendra on 01/03/16.
 */
@Repository
public interface StoryRepository extends CrudRepository<Story, String> {

    public List<Story> findAll();
}

