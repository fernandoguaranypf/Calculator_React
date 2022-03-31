package com.guarany.calculator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class Calculator {

    @GetMapping("soma")
    public ResponseEntity<Long> soma(@RequestParam Long primeiraparcela, Long segundaparcela) {
        Long soma = primeiraparcela + segundaparcela;
        return !soma.equals(null) ? ResponseEntity.ok(soma) : ResponseEntity.noContent().build();
    }

    @GetMapping("subtracao")
    public ResponseEntity<Long> subtracao(@RequestParam Long minuendo, Long subtraendo) {
        Long resto = minuendo - subtraendo;
        return !resto.equals(null) ? ResponseEntity.ok(resto) : ResponseEntity.noContent().build();
    }

    @GetMapping("multiplicacao")
    public ResponseEntity<Long> multiplicacao(@RequestParam Long primeirofator, Long segundofator) {
        Long produto = primeirofator * segundofator;
        return !produto.equals(null) ? ResponseEntity.ok(produto) : ResponseEntity.noContent().build();
    }

    @GetMapping("divisao")
    public ResponseEntity<Long> divisao(@RequestParam Long dividendo, Long divisor) {
        Long resto = dividendo / divisor;
        return !resto.equals(null) ? ResponseEntity.ok(resto) : ResponseEntity.noContent().build();
    }
}