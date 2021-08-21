package org.zerock.web1.dao;

import org.zerock.db.util.JdbcTemplate;
import org.zerock.web1.dto.StoreDTO;

public class StoreDAO {

    public static void insert(final StoreDTO storeDTO) throws RuntimeException {

        String sql = "insert into tbl_store (name,area,menus,link) values (?,?,?,?)";

        new JdbcTemplate() {
            @Override
            protected void execute() throws Exception {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, storeDTO.getName());
                preparedStatement.setString(2, storeDTO.getArea());
                preparedStatement.setString(3, storeDTO.getDesc());
                preparedStatement.setString(4, storeDTO.getLink());

                preparedStatement.executeUpdate();
            }
        }.makeAll();

    }

}
