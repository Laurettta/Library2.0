package com.Lauretta.Libraryexample.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Setter
@Getter
@AllArgsConstructor @NoArgsConstructor
@Table
public class BookModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String id;

        private String title;

        private String author;

        @GeneratedValue
        @UuidGenerator
        private UUID isbn;

        @CreationTimestamp
        @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
        @Column(name="created_at")
        private LocalDateTime createdAt;

        @UpdateTimestamp
        @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
        @Column(name="updated_at")
        private LocalDateTime updatedAt;

    }
