package com.social.media.repositories;

import com.social.media.models.SocialProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialProfilePostRepository extends JpaRepository<SocialProfile, Long> {
}
