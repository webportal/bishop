package com.bishop.managedBeans;

import com.bishop.domain.User;
import com.bishop.services.UserService;
import org.springframework.context.annotation.Scope;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shevchik
 * Date: 12.10.12
 * Time: 17:28
 * To change this template use File | Settings | File Templates.
 */


@Named
@Scope("request")
public class UserManagedBean {

    //@ManagedProperty(value = "#{userService}")
    @Inject
    private UserService userService;

    private List<User> users;

    public UserManagedBean(){
    }

    @PostConstruct
    public void init(){
        this.setUsers(userService.findAll());
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
