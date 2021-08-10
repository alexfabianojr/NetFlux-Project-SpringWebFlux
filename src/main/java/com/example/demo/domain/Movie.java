package com.example.demo.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
@NoArgsConstructor
@RequiredArgsConstructor
public class Movie {

    private String id;

    @NonNull
    private String title;
}
