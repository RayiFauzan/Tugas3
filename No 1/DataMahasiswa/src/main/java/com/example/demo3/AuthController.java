package com.example.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {


    @PostMapping("/signup")
    public String signUp(@RequestBody User user) {
        // Di sini Anda dapat menyimpan pengguna ke database atau melakukan tindakan lain yang diperlukan
        // Sebagai contoh, kita hanya mencetak pesan pendaftaran berhasil.
        return "Pendaftaran berhasil: " + user.getUsername();
    }



    @PostMapping("/login")
    public String login(@RequestBody User user) {
        // Di sini Anda dapat melakukan autentikasi pengguna, misalnya, memeriksa username dan password.
        // Sebagai contoh, kita hanya mencetak pesan login berhasil jika username dan password cocok.
        if ("username".equals(user.getUsername()) && "password".equals(user.getPassword())) {
            return "Login berhasil: " + user.getUsername();
        } else {
            return "Login gagal";
        }
    }
}

