package com.example.auth_dis.service.user;

import com.example.auth_dis.Domain.user.User;
import com.example.auth_dis.paylod.IdResponse;
import com.example.auth_dis.paylod.StatusResponse;
import com.example.auth_dis.paylod.UserInformationResponse;
import com.example.auth_dis.paylod.UserResponse;

import java.util.Map;

public interface UserService {
    void SIGN_IN(UserResponse user);
    StatusResponse CheckId(IdResponse id);
    UserInformationResponse GET_INFO_BY_ACCESS(String AccessToken);


}
