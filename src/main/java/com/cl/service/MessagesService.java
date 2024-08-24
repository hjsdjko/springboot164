package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.MessagesEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.MessagesView;


/**
 * 在线交流
 *
 * @author 
 * @email 
 * @date 2024-03-16 20:05:23
 */
public interface MessagesService extends IService<MessagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MessagesView> selectListView(Wrapper<MessagesEntity> wrapper);
   	
   	MessagesView selectView(@Param("ew") Wrapper<MessagesEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MessagesEntity> wrapper);
   	

}

