package org.spring.thymeleafLayout.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Table(name = "reply_jpa_tb2")
public class ReplyEntity {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Date create_date;

    private String comments;
    @Column(nullable = false)
    private Date update_date;
    @Column(nullable = false, unique = true)
    private String reply_writer;
    @Column(nullable = false, insertable = false, updatable = false)
    private Long board_id;

    @ManyToOne
    @JoinColumn(name = "board_id", insertable = false)
    private BoardEntity entity;


}