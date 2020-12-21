package com.flj.student_system.service;

import com.flj.student_system.dao.TRoleHomeMapper;
import com.flj.student_system.dao.TRoleLoginMapper;
import com.flj.student_system.dao.TRoleRouterMapper;
import com.flj.student_system.dao.TRouterMenuMapper;
import com.flj.student_system.entity.TRoleHome;
import com.flj.student_system.entity.TRoleLogin;
import com.flj.student_system.entity.TRoleRouter;
import com.flj.student_system.entity.TRouterMenu;
import com.flj.student_system.entity.dto.HomeInfo;
import com.flj.student_system.entity.dto.MenuDTO;
import com.flj.student_system.entity.dto.LogoInfo;
import com.flj.student_system.entity.dto.RoleMenuDTO;
import com.flj.student_system.service.interfaces.RoleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleImpl implements RoleService {

    @Autowired
    private TRoleHomeMapper tRoleHomeMapper;

    @Autowired
    private TRoleLoginMapper tRoleLoginMapper;

    @Autowired
    private TRouterMenuMapper tRouterMenuMapper;

    @Autowired
    private TRoleRouterMapper tRoleRouterMapper;

    @Override
    public RoleMenuDTO getMenuInfo(Integer roleId) {
        RoleMenuDTO roleMenuDTO = new RoleMenuDTO();
        List<TRoleRouter> tRoleRouters = tRoleRouterMapper.selectByRoleId(roleId);
        // 获取homeInfoID和logoInfoId
        TRoleRouter tRoleRouter = tRoleRouters.get(0);
        Integer logoinfoId = tRoleRouter.getLogoinfo();
        TRoleLogin tRoleLogin = tRoleLoginMapper.selectByPrimaryKey(logoinfoId);
        LogoInfo logoInfo = new LogoInfo();
        BeanUtils.copyProperties(tRoleLogin,logoInfo);
        roleMenuDTO.setLogoInfo(logoInfo);
        Integer homeinfoId = tRoleRouter.getHomeinfo();
        TRoleHome tRoleHome = tRoleHomeMapper.selectByPrimaryKey(homeinfoId);
        HomeInfo homeInfo = new HomeInfo();
        BeanUtils.copyProperties(tRoleHome,homeInfo);
        roleMenuDTO.setHomeInfo(homeInfo);
        // 获取菜单集合
        List<Integer> menuList = new ArrayList<>();
        for (TRoleRouter roleRouter : tRoleRouters) {
            menuList.add(roleRouter.getMenuinfo());
        }
        MenuDTO[] menuDTOFirst = new MenuDTO[1];
        menuDTOFirst[0] = new MenuDTO();
        MenuDTO[] menuDTOChild = new MenuDTO[menuList.size() - 1];
        int index = 0;
        for (Integer integer : menuList) {
            TRouterMenu tRouterMenu = tRouterMenuMapper.selectByPrimaryKey(integer);
            // 如果是父节点，复制拷贝内容
            if(tRouterMenu.getParentId() != null && tRouterMenu.getParentId() == 0){
                BeanUtils.copyProperties(tRouterMenu,menuDTOFirst[0]);
            }else{
                // 不是父节点放入到集合中
                MenuDTO menuDTOC = new MenuDTO();
                BeanUtils.copyProperties(tRouterMenu,menuDTOC);
                menuDTOChild[index] = menuDTOC;
                index++;
            }
        }
        menuDTOFirst[0].setChild(menuDTOChild);
        roleMenuDTO.setMenuInfo(menuDTOFirst);
        return roleMenuDTO;
    }
}
