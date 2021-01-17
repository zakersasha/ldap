package com.springsecurity.ldap.repo;

import com.springsecurity.ldap.domain.Vcard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VcardRepo extends JpaRepository<Vcard, Long> {
}
