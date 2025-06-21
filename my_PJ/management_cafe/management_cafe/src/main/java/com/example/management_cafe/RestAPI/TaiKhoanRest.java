package com.example.management_cafe.RestAPI;

import com.example.management_cafe.Entity.User;
import com.example.management_cafe.Entity.dtos.TaiKhoanWrapper.KichHoat;
import com.example.management_cafe.Security.JwtResponse;
import com.example.management_cafe.Security.JwtService;
import com.example.management_cafe.Security.dtos.LoginRequest;
import com.example.management_cafe.Service.TaikhoanService;
import com.example.management_cafe.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/tai-khoan")
public class TaiKhoan {
    @Autowired
    private TaikhoanService taiKhoanService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    UserService userService;
    @Autowired
    private JwtService jwtService;
    @PostMapping("/dang-ky")
    public ResponseEntity<?> dangKyNguoiDung(@Validated @RequestBody User user){
        ResponseEntity<?> response = taiKhoanService.dangKyNguoiDung(user);
        return response;
    }
    @PostMapping("/kich-hoat")
    public ResponseEntity<?> kichHoatTaiKhoan(@RequestBody KichHoat request){
        ResponseEntity<?> response = taiKhoanService.kichHoatTaiKHoan(request.getEmail(),request.getMaKichHoat());
        return response;
    }
    @PostMapping("/dang-nhap")
    public ResponseEntity<?> dangNhap(@RequestBody LoginRequest loginRequest){
        // Xác thực người dùng bằng tên đăng nhập và mật khẩu
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
            );
            // Nếu xác thực thành công, tạo token JWT
            if(authentication.isAuthenticated()){
                final String jwt = jwtService.generateToken(loginRequest.getUsername());
                return ResponseEntity.ok(new JwtResponse(jwt));
            }
        }catch (AuthenticationException e){
            // Xác thực không thành công, trả về lỗi hoặc thông báo
            return ResponseEntity.badRequest().body("Tên đăng nhập hặc mật khẩu không chính xác.");
        }
        return ResponseEntity.badRequest().body("Xác thực không thành công.");
    }
    @GetMapping("/checkToken")
    ResponseEntity<?> checkToken(@RequestHeader(required = true) Map<String,String> request){
        try {
            return taiKhoanService.checkToken();

        } catch (RuntimeException e) {
                throw new RuntimeException(e);
        }

    }
    @PostMapping("/changePassword")
    public ResponseEntity<?> changePassword(@RequestBody Map<String,String> request){
try {
    return taiKhoanService.changePassowrd(request);

} catch (RuntimeException e) {
        throw new RuntimeException(e);
}

    }
    @PostMapping("/forgotpasssword")
    public ResponseEntity<?> forgetPassword(@RequestBody Map<String,String> request) {
        try {
            return taiKhoanService.fogotPassword(request);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/resetPassword")
    public ResponseEntity<?> resetPassword(@RequestBody Map<String, String> request) {
        String token = request.get("token");
        String newPassword = request.get("newPassword");
        return taiKhoanService.reset_Password(token, newPassword);
    }
    }




