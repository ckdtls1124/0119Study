package org.spring.thymeleafLayout.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
@Table(name = "reply_jpa_tb2")
public class ReplyEntity {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String comments;
    @Column(nullable = false)
    private String reply_writer;

    @CreationTimestamp
    @Column(nullable = false)
    private Date create_date;
    @UpdateTimestamp
    @Column(nullable = false)
    private Date update_date;

}