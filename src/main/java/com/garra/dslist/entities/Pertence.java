package com.garra.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pertence")
public class Pertence {

	@EmbeddedId // Escapsulando dois produtos em um só
	private PertencePK id = new PertencePK();

	private Integer position;

	public Pertence() {
	}

	public Pertence(Game game, GameList list, Integer position) {
		id.setGame(game);
		id.setList(list);
		this.position = position;
	}

	public PertencePK getId() {
		return id;
	}

	public void setId(PertencePK id) {
		this.id = id;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pertence other = (Pertence) obj;
		return Objects.equals(id, other.id);
	}

}
