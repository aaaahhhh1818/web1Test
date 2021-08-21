package org.zerock.w1.dao;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.web1.dao.StoreDAO;
import org.zerock.web1.dao.TimeDAO;
import org.zerock.web1.dto.StoreDTO;

public class StoreDAOTest {

    private TimeDAO timeDAO = new TimeDAO();

    private StoreDAO storeDAO;

    //@BeforeEach -> 테스트 할 때마다 새로 만드는 놈
    @BeforeEach
    public void ready() {
        storeDAO = new StoreDAO();
        System.out.println(storeDAO);
    }

    @Test
    //사용자 입력값
    public void testInsert() {

        StoreDTO storeDTO = StoreDTO.builder()
                .name("성가네순대국")
                .area("종각")
                .desc("직접 만든 순대, 순대국")
                .build();

       storeDAO.insert(storeDTO);

    }

    @Test
    public void testGetTime() {
        System.out.println(timeDAO.getTime());

    }

}
