package com.wcm.pm.idp.album.common.parameters;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import com.wcm.pm.idp.user.common.enumeration.UserRole;
import com.wcm.pm.idp.user.controller.security.okta.OktaUser;
import com.wcm.pm.idp.user.repository.entity.UserEntity;
import java.util.List;

public abstract class DummyTestParameters {

  protected static final Faker FAKER = new Faker();

  public OktaUser getOktaUser(UserEntity entity) {
    return OktaUser.builder()
        .firstName(entity.getFirstName())
        .lastName(entity.getLastName())
        .email(entity.getEmail())
        .roles(List.of(entity.getRole()))
        .build();
  }

  public OktaUser getOktaUser(UserRole role) {
    Name name = FAKER.name();
    return OktaUser.builder()
        .firstName(name.firstName())
        .lastName(name.lastName())
        .email(FAKER.internet().emailAddress())
        .roles(List.of(role))
        .build();
  }
}
