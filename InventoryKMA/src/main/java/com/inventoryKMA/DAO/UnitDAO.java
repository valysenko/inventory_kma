package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UnitDAO implements UnitDAOInterface {
    private static final String SQL_INSERT_UNIT =
            "insert into inventory_kma.unit (name) values (?)";
    private static final String SQL_SELECT_UNIT_BY_ID =
            "select id, name from inventory_kma.unit where id = ?";

    private static final String SQL_SELECT_UNIT_BY_NAME =
            "select id, name from inventory_kma.unit where name = ?";


    @Autowired
    private SimpleJdbcTemplate jdbcTemplate;

    public void addUnit(Unit unit) {
        jdbcTemplate.update(SQL_INSERT_UNIT,
                unit.getName());
    }

    public Unit getUnit(int id) {
        return jdbcTemplate.queryForObject(SQL_SELECT_UNIT_BY_ID,
                new ParameterizedRowMapper<Unit>() {

                    public Unit mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Unit unit = new Unit();
                        unit.setId(rs.getInt(1));
                        unit.setName(rs.getString(2));
                        return unit;
                    }

                }, id);
    }

    public Unit getUnitByName(String name) {
        return jdbcTemplate.queryForObject(SQL_SELECT_UNIT_BY_NAME,
                new ParameterizedRowMapper<Unit>() {

                    public Unit mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Unit unit = new Unit();
                        unit.setId(rs.getInt(1));
                        unit.setName(rs.getString(2));
                        return unit;
                    }

                }, name);
    }

}
