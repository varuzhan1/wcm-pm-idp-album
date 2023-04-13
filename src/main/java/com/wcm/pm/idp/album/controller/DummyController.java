package com.wcm.pm.idp.album.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dummy")
@RequiredArgsConstructor
@Validated
public class DummyController {

  @GetMapping()
  public ResponseEntity.BodyBuilder requestDummy() {
    return ResponseEntity.ok();
  }
}
