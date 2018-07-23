package com.linksSaver.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Builder
@Data
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String ID;

    @Column
    private String nameTheme;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "link", cascade = CascadeType.ALL)
    public List<Link> linkList;


}
