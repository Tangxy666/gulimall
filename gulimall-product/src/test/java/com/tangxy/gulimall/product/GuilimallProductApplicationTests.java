package com.tangxy.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tangxy.gulimall.product.entity.BrandEntity;
import com.tangxy.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GuilimallProductApplicationTests {


    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功！....");
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq(
                "brand_id", 1
        ));
        list.forEach((item)->{
            System.out.println(item);
        });
    }
}
