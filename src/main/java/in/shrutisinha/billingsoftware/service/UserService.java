package in.shrutisinha.billingsoftware.service;

import in.shrutisinha.billingsoftware.io.UserRequest;
import in.shrutisinha.billingsoftware.io.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);
}
