package com.atguigu.gmall.manage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallManageServiceApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testBigDecimal() {
        BigDecimal x = new BigDecimal("0.00000005");
        System.out.println(x);
    }

}
