package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    BelongingPK belongingPK = new BelongingPK();
    Integer position;

    public Belonging(Game game, GameList gameList, Integer position) {
        this.belongingPK.setGame(game);
        this.belongingPK.setGameList(gameList);
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(belongingPK, belonging.belongingPK) && Objects.equals(position, belonging.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(belongingPK, position);
    }
}
