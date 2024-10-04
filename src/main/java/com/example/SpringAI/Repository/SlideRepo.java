package com.example.SpringAI.Repository;

import com.example.SpringAI.Model.LocalUser;
import com.example.SpringAI.Model.Slide;
import com.example.SpringAI.Model.UserClass;
import lombok.extern.java.Log;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SlideRepo extends JpaRepository<Slide, Long> {
 Page<Slide> findAllByUserclass(UserClass userClass, Pageable pageable);




}
