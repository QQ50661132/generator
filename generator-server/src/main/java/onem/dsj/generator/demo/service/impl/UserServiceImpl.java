package onem.dsj.generator.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import onem.dsj.generator.demo.entity.UserEntity;
import onem.dsj.generator.demo.mapper.UserMapper;
import onem.dsj.generator.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author dengshaojie
 * @date 2020/1/14 15:44
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

}
