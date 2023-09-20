package com.example.SpringBancario.DOMAIN.ENTITY;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "costumer")
@Table(name = "costumer")
@RequestMapping(name = "costumer")
@EqualsAndHashCode(of = "if")
public class Costumer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name ;
    @Column(name = "adress")
    private String adress;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "phoneNumber")
    private String phoneNumber;
}



