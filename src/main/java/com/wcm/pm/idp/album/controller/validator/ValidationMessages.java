package com.wcm.pm.idp.album.controller.validator;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ValidationMessages {

  public static final String NOT_BLANK_MESSAGE = "Should not be null or blank.";
  public static final String FIRSTNAME_VALIDATION_MESSAGE =
      """
                 Should have length between 2 and 30 (minimum 2 letters),
                 contain only letters and spaces but start and end with only letters.""";
  public static final String COMPANY_VALIDATION_MESSAGE =
      """
                Should have length between 1 and 30, contain only letters,
                empty characters and numbers but start and end with only letters or numbers.""";
  public static final String COUNTRY_VALIDATION_MESSAGE = "Invalid country name.";
}
