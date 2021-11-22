package com.example.mottorest;

import javax.persistence.*;

@Entity
@Table
public class Mott {
    @Id
    @SequenceGenerator(
            name = "mott_sequence",
            sequenceName = "mott_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "mott_sequence"
    )

    private Long id;
    private String content;

    public Mott(Long id, String content) {
        this.id = id;
        this.content = content;
    }


    public Mott(String content) {
        this.content = content;
    }

    public Mott() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}