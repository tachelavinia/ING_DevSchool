package jpa;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Setter @Getter @Builder
@Entity
public class Project {

    @Tolerate
    public Project() { }

    @Id
    private int id;

    @Column
    private String nume;

}