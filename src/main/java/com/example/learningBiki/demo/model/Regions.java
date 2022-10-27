package com.example.learningBiki.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name ="regions", schema = "sys")
public class Regions {
    @Id
    @Column("region_id")
    private int regionsId;
    @Column("region_name")
    private String regionName;


}
