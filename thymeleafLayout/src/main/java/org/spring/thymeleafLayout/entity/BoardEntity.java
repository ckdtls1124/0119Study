package org.spring.thymeleafLayout.entity;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "board_jpa_tb")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long board_id;
    @Column(nullable = false)
    private String board_pw;
    @Column(nullable = false, length = 500)
    private String content;
    @Column(nullable = false, columnDefinition = "integer default 0")
    private int hit;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false, unique = true)
    private String writer;

    @CreationTimestamp
    @Column(updatable = false)
    private Date create_time;
    @CreationTimestamp
    @Column(insertable = false)
    private Date update_time;

    @OneToMany
    @JoinColumn(name = "board_id", insertable = false)
    private List<ReplyEntity> bComments=new ArrayList<>();


}