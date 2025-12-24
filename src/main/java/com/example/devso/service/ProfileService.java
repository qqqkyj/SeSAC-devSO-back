package com.example.devso.service;

import com.example.devso.dto.request.ProfileUpdateRequest;
import com.example.devso.dto.response.UserProfileResponse;
import com.example.devso.entity.*;
import com.example.devso.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ProfileService {


    private final UserRepository userRepository;


}