package com.jung.paramvir.Achievements;

import com.jung.paramvir.app.GameStats;
import com.jung.paramvir.app.PlayerStats;

import java.util.Objects;

public abstract class Achievement {

    protected String id;

    public String getId() {
        return id;
    }

    public abstract boolean isAwarded(GameStats gameStats, PlayerStats playerStats);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Achievement that = (Achievement) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Achievement{" +
                "id='" + id + '\'' +
                '}';
    }
}
