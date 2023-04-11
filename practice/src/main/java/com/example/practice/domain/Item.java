package com.example.practice.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Getter
@NoArgsConstructor(access= AccessLevel.PUBLIC)
public class Item implements Serializable {
        @Id
        @Column
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long Id;
        @Column
        private String name;

        @Column
        private int price;

        @Builder
        public Item(String name,int price){
            this.name=name;
            this.price=price;
        }
    }
}
