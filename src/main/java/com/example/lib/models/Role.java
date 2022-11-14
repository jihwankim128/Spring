package com.example.lib.models;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
	@Id
	private int id;
	private ERole name;
}
